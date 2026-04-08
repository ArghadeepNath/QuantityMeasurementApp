package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static boolean demonstrateLengthEquality(Length l1,Length l2){
        return l1.equals(l2);
    }

    private static void demonstrateLengthComparison(double v1, Length.LengthUnit unit1, double v2, Length.LengthUnit unit2) {
        Length l1 = new Length(v1,unit1);
        Length l2 = new Length(v2,unit2);
        boolean result = l1.equals(l2);
        System.out.println(v1 + " " + unit1 + " vs " + v2 + " " + unit2 + " → " + result);
    }

    public static Length demonstrateLengthConversion(double value, Length.LengthUnit fromUnit, Length.LengthUnit toUnit) {
        Length length = new Length(value, fromUnit);
        Length result = length.convertTo(toUnit);

        System.out.println(value + " " + fromUnit + " → " + result);

        return result;
    }

    public static Length demonstrateLengthConversion(Length length, Length.LengthUnit toUnit) {

        Length result = length.convertTo(toUnit);

        System.out.println(length + " → " + result);

        return result;
    }

    public static void main(String[] args) {

        demonstrateLengthConversion(1.0, Length.LengthUnit.FEET, Length.LengthUnit.INCHES);
        demonstrateLengthConversion(36.0, Length.LengthUnit.INCHES, Length.LengthUnit.YARDS);
        demonstrateLengthConversion(100.0, Length.LengthUnit.CENTIMETERS, Length.LengthUnit.FEET);

        Length l = new Length(2.0, Length.LengthUnit.YARDS);
        demonstrateLengthConversion(l, Length.LengthUnit.FEET);
    }


}