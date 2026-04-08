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

        public Length convertTo(LengthUnit unit){
            if (unit == null || this.unit == null) {
                throw new IllegalArgumentException("Unit cannot be null");
            }

            if (Double.isNaN(this.value) || Double.isInfinite(this.value)) {
                throw new IllegalArgumentException("Invalid value");
            }
            double convertedValue = this.value *
                    (this.unit.getConversionFactor() / unit.getConversionFactor());

            convertedValue = Math.round(convertedValue * 100.0) / 100.0;

            return new Length(convertedValue, unit);
        }

    @Override
    public String toString() {
        return String.format("%.2f %s", value, unit);
    }

        public static void main(String[] args){
            Length l1 = new Length(1.0, LengthUnit.FEET);
            System.out.println("1 FEET → INCHES = " + l1.convertTo(LengthUnit.INCHES));

            Length l2 = new Length(36.0, LengthUnit.INCHES);
            System.out.println("36 INCHES → YARDS = " + l2.convertTo(LengthUnit.YARDS));

            Length l3 = new Length(100.0, LengthUnit.CENTIMETERS);
            System.out.println("100 CM → FEET = " + l3.convertTo(LengthUnit.FEET));
        }
    }

