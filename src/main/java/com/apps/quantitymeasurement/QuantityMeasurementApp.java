package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static boolean demonstrateLengthEquality(Length l1, Length l2){
        return l1.equals(l2);
    }

    private static void demonstrateLengthComparison(double v1, LengthUnit unit1, double v2, LengthUnit unit2) {
        Length l1 = new Length(v1,unit1);
        Length l2 = new Length(v2,unit2);
        boolean result = l1.equals(l2);
        System.out.println(v1 + " " + unit1 + " vs " + v2 + " " + unit2 + " → " + result);
    }

    public static Length demonstrateLengthConversion(double value, LengthUnit fromUnit, LengthUnit toUnit) {
        Length length = new Length(value, fromUnit);
        Length result = length.convertTo(toUnit);

        System.out.println(value + " " + fromUnit + " → " + result);
        return result;
    }

    public static Length demonstrateLengthConversion(Length length, LengthUnit toUnit) {
        Length result = length.convertTo(toUnit);

        System.out.println(length + " → " + result);
        return result;
    }

    public static Length demonstrateLengthAddition(Length l1, Length l2){
        Length result = l1.add(l2);
        System.out.println(l1 + " + " + l2 + " → " + result);
        return result;
    }

    public static Length demonstrateLengthAddition(Length l1, Length l2, LengthUnit targetUnit) {
        Length result = l1.add(l2,targetUnit);

        System.out.println(l1 + " + " + l2 + " → " + result);
        return result;
    }

    public static void main(String[] args) {

        demonstrateLengthConversion(1.0, LengthUnit.FEET, LengthUnit.INCHES);
        demonstrateLengthConversion(36.0, LengthUnit.INCHES, LengthUnit.YARDS);
        demonstrateLengthConversion(100.0, LengthUnit.CENTIMETERS, LengthUnit.FEET);

        Length l = new Length(2.0, LengthUnit.YARDS);
        demonstrateLengthConversion(l, LengthUnit.FEET);

        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        demonstrateLengthAddition(l1, l2);
        demonstrateLengthAddition(l1, l2, LengthUnit.FEET);
    }
}