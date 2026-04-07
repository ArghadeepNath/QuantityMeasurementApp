package com.apps.quantitymeasurement;

public class Length {
        private double value;
        private LengthUnit unit;

        public enum LengthUnit{
            FEET(12.0),
            INCHES(1.0);

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
            return Double.compare(this.convertTOBaseUnit(),thatLength.convertTOBaseUnit())==0;
        }

        @Override
        public boolean equals(Object o){
            if (this == o) return true;
            if (o == null) return false;
            if (getClass() != o.getClass()) return false;

            Length other = (Length) o;
            return this.compare(other);
        }
    }

