package com.apps.quantitymeasurement;

public class Quantity<U extends IMeasurable> {

    private double value;
    private U unit;

    public Quantity(double value, U unit) {

        if (unit == null)
            throw new IllegalArgumentException("Unit cannot be null");

        if (Double.isNaN(value) || Double.isInfinite(value))
            throw new IllegalArgumentException("Invalid value: must be a finite number");

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public U getUnit() {
        return unit;
    }

    public Quantity<U> convertTo(U targetUnit) {
        if (targetUnit == null)
            throw new IllegalArgumentException("Target unit cannot be null");

        double base = unit.convertToBaseUnit(value);
        double converted = targetUnit.convertFromBaseUnit(base);

        return new Quantity<>(converted, targetUnit);
    }

    public Quantity<U> add(Quantity<U> other){
        if(this.getUnit()==null || other.getUnit()==null)
            throw new IllegalArgumentException("Units cannot be null");

        if(Double.isInfinite(this.getValue()) || Double.isInfinite(other.getValue()) || Double.isNaN(this.getValue()) || Double.isNaN(other.getValue()))
            throw new IllegalArgumentException("Invalid values");

        double a = this.getUnit().convertToBaseUnit(this.getValue());
        double b = other.getUnit().convertToBaseUnit((other.getValue()));

        return new Quantity<U>(roundOff(this.getUnit().convertFromBaseUnit(a+b)),this.getUnit());
    }

    public Quantity<U> add(Quantity<U> other,U targetUnit){
        if(this.getUnit()==null || other.getUnit()==null || targetUnit==null)
            throw new IllegalArgumentException("Units cannot be null");

        if(Double.isInfinite(this.getValue()) || Double.isInfinite(other.getValue()) || Double.isNaN(this.getValue()) || Double.isNaN(other.getValue()))
            throw new IllegalArgumentException("Invalid values");

        double a = this.getUnit().convertToBaseUnit(this.getValue());
        double b = other.getUnit().convertToBaseUnit((other.getValue()));

        return new Quantity<U>(roundOff(targetUnit.convertFromBaseUnit(a+b)),targetUnit);
    }

    @Override
    public int hashCode(){
        double base = unit.convertToBaseUnit(value);
        return Double.valueOf(base).hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;

        Quantity<?> other = (Quantity<?>) obj;

        if(!this.getUnit().getClass().equals(other.getUnit().getClass())){
            return false;
        }

        double a= this.getUnit().convertToBaseUnit(this.getValue());
        double b= other.getUnit().convertToBaseUnit((other.getValue()));

        return Double.compare(a,b)==0;
    }

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit + ")";
    }

    private double roundOff(double val) {
        return Math.round(val * 100.0) / 100.0;
    }


}
