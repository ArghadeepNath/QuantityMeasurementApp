package com.apps.quantitymeasurement;

public class Length {
        double value;
        private LengthUnit unit;

        public enum LengthUnit{
            FEET(12.0),
            INCHES(1.0),
            YARDS(36.0),
            CENTIMETERS(0.393701);

            private final double conversionFactor;

            LengthUnit(double conversionFactor){
                this.conversionFactor=conversionFactor;
            }

            public double getConversionFactor(){
                return conversionFactor;
        }
    }

        public Length(double value, LengthUnit unit){
            this.value=value;
            this.unit=unit;
        }

        private double convertTOBaseUnit(){
            return value* unit.getConversionFactor();
        }

        public boolean compare(Length thatLength){
            double a = this.convertTOBaseUnit();
            double b = thatLength.convertTOBaseUnit();

            return Math.abs(a - b) < 0.01;
        }

        @Override
        public boolean equals(Object o){
            if (this == o) return true;
            if (o == null) return false;
            if (getClass() != o.getClass()) return false;

            Length other = (Length) o;
            return this.compare(other);
        }

        //Conversions

        public Length convertTo(LengthUnit unit){
            if (unit == null || this.unit == null) {
                throw new IllegalArgumentException("Unit cannot be null");
            }

            if (Double.isNaN(this.value) || Double.isInfinite(this.value)) {
                throw new IllegalArgumentException("Invalid value");
            }

            double convertedValue = this.value * (this.unit.getConversionFactor() / unit.getConversionFactor());

            convertedValue = Math.round(convertedValue * 100.0) / 100.0;

            return new Length(convertedValue, unit);
        }

        public static double convert(double value, LengthUnit source, LengthUnit target) {
        if (source == null || target == null) {
            throw new IllegalArgumentException("Units cannot be null");
        }

        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }

        double convertedValue = value * (source.getConversionFactor() / target.getConversionFactor());

        convertedValue = Math.round(convertedValue * 100.0) / 100.0;

        return convertedValue;
        }

        private static double convertFromBaseToTargetUnit(double lengthInInches, LengthUnit targetUnit){
            return lengthInInches / targetUnit.getConversionFactor();
        }

        //Addition

    public static double add(Length l1, Length l2, LengthUnit targetUnit){
            if(l1==null || l2==null || l1.unit==null || l2.unit==null){
                throw new IllegalArgumentException("Units cannot be null");
            }
            if(Double.isNaN(l1.value) || Double.isNaN(l2.value) || Double.isInfinite(l1.value) || Double.isInfinite(l2.value)){
                throw new IllegalArgumentException("Invalid value");
            }
            double val=l1.convertTOBaseUnit()+l2.convertTOBaseUnit();
            return convertFromBaseToTargetUnit(val,targetUnit);
    }

    public Length add(Length thatLength){
            if(thatLength==null || this.unit==null || thatLength.unit==null){
                throw new IllegalArgumentException("Units cannot be null");
            }
            if(Double.isNaN(this.value) || Double.isNaN(thatLength.value) || Double.isInfinite(this.value) || Double.isInfinite(thatLength.value) ){
                throw new IllegalArgumentException("Invalid value");
            }
            double val=this.convertTOBaseUnit()+thatLength.convertTOBaseUnit();
            double ans=convertFromBaseToTargetUnit(val,this.unit);
            return new Length(ans,this.unit);
    }


    @Override
    public String toString() {
        return String.format("%.2f %s", value, unit);
    }

    public static void main(String[] args) {

        // Instance add tests
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);
        System.out.println("Instance Add 1: " + l1.add(l2)); // ~2.00 FEET

        Length l3 = new Length(2.0, LengthUnit.YARDS);
        Length l4 = new Length(3.0, LengthUnit.FEET);
        System.out.println("Instance Add 2: " + l3.add(l4)); // ~3.00 YARDS


        // Static add tests
        Length l5 = new Length(1.0, LengthUnit.FEET);
        Length l6 = new Length(12.0, LengthUnit.INCHES);
        System.out.println("Static Add 1: " +
                Length.add(l5, l6, LengthUnit.FEET)); // ~2.0

        System.out.println("Static Add 2: " +
                Length.add(
                        new Length(1.0, LengthUnit.YARDS),
                        new Length(1.0, LengthUnit.FEET),
                        LengthUnit.INCHES)); // ~48.0

    }
    }

