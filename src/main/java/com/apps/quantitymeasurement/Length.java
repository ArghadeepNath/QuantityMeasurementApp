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

        public Length add(Length len, LengthUnit targetUnit){
            if (len == null || targetUnit == null || this.unit == null || len.unit == null) {
                throw new IllegalArgumentException("Units cannot be null");
            }
            if (Double.isNaN(this.value) || Double.isNaN(len.value) ||
                    Double.isInfinite(this.value) || Double.isInfinite(len.value)) {
                throw new IllegalArgumentException("Invalid value");
            }
            return this.addAndConvert(len, targetUnit);
    }

        private Length addAndConvert(Length len, LengthUnit targetUnit){
            double val = len.convertTOBaseUnit() + this.convertTOBaseUnit();

            double converted = convertFromBaseToTargetUnit(val, targetUnit);
            converted = Math.round(converted * 100.0) / 100.0;

            return new Length(converted, targetUnit);
    }

        public Length add(Length thatLength){
            if(thatLength==null || this.unit==null || thatLength.unit==null){
                throw new IllegalArgumentException("Units cannot be null");
            }
            if(Double.isNaN(this.value) || Double.isNaN(thatLength.value) || Double.isInfinite(this.value) || Double.isInfinite(thatLength.value) ){
                throw new IllegalArgumentException("Invalid value");
            }
            return this.addAndConvert(thatLength,this.unit);
    }


        @Override
        public String toString() {
        return String.format("%.2f %s", value, unit);
    }

        public static void main(String[] args) {

        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);
        System.out.println("Instance Add 1: " + l1.add(l2,LengthUnit.CENTIMETERS));

        Length l3 = new Length(2.0, LengthUnit.YARDS);
        Length l4 = new Length(3.0, LengthUnit.FEET);
        System.out.println("Instance Add 2: " + l3.add(l4));


    }
}

