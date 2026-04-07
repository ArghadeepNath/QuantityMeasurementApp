package com.apps.quantitymeasurement;

public class Length {
        private double value;
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

        public static void main(String[] args){
            Length l1 = new Length(1.0, LengthUnit.FEET);
            Length l2 = new Length(12.0, LengthUnit.INCHES);
            System.out.println("Are lengths equal? "+ l1.equals(l2));

            Length l3 = new Length(1.0, LengthUnit.YARDS);
            Length l4 = new Length(36.0, LengthUnit.INCHES);
            System.out.println("Are lengths equal? "+ l3.equals(l4));

            Length l5 = new Length(100.0, LengthUnit.CENTIMETERS);
            Length l6 = new Length(39.3701, LengthUnit.INCHES);
            System.out.println("Are lengths equal? "+ l5.equals(l6));
        }
    }

