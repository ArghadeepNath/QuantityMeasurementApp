package com.apps.quantitymeasurement;

public class Weight {
    private final double value;
    private final WeightUnit unit;

    public double getValue(){
        return value;
    }

    public WeightUnit getUnit(){
        return unit;
    }

    Weight(double value,WeightUnit unit){
        if(unit==null) throw new IllegalArgumentException("Unit cannot be Null");
        if(Double.isNaN(value) || Double.isInfinite(value)) throw new IllegalArgumentException("Invalid Value");

        this.value=value;
        this.unit=unit;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null) return false;
        if(this.getClass()!=o.getClass()) return false;
        Weight other =(Weight) o;
        return this.compare(other);
    }

    public boolean compare(Weight w){
        if (w == null) return false;
        double a=this.getUnit().convertToBaseUnit(this.getValue());
        double b=w.getUnit().convertToBaseUnit(w.getValue());
        return Math.abs(a-b)<0.01;
    }

    public Weight convertTo(WeightUnit targetUnit){
        if(targetUnit==null) throw new IllegalArgumentException("Unit cannot be Null");
        double x= getUnit().convertToBaseUnit(this.getValue());
        double y=targetUnit.convertFromBaseUnit(x);
        y=Math.round(y*100.00)/100.0;
        return new Weight(y,targetUnit);
    }

    public Weight add(Weight thatWeight){
        return addAndConvert(thatWeight,this.getUnit());
    }

    public Weight add(Weight weight,WeightUnit targetUnit){
        return addAndConvert(weight,targetUnit);
    }

    private Weight addAndConvert(Weight weight,WeightUnit targetUnit){
        if (weight == null) throw new IllegalArgumentException("Weight cannot be null");
        if(targetUnit==null) throw new IllegalArgumentException("Target Unit cannot be null");
        double sum=this.getUnit().convertToBaseUnit(this.getValue())+weight.getUnit().convertToBaseUnit(weight.getValue());
        double result=targetUnit.convertFromBaseUnit(sum);
        result=Math.round(result*100.00)/100.0;

        return new Weight(result,targetUnit);
    }

    @Override
    public String toString(){
        return String.format("%.2f %s", value, unit);
    }
}
