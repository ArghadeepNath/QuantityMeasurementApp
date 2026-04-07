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

    public static void main(String[] args) {
        // Feet vs Inches
        demonstrateLengthComparison(1.0, Length.LengthUnit.FEET,
                12.0, Length.LengthUnit.INCHES);

        // Yards vs Inches
        demonstrateLengthComparison(1.0, Length.LengthUnit.YARDS,
                36.0, Length.LengthUnit.INCHES);

        // CM vs Inches
        demonstrateLengthComparison(100.0, Length.LengthUnit.CENTIMETERS,
                39.3701, Length.LengthUnit.INCHES);

        // Feet vs Yards
        demonstrateLengthComparison(3.0, Length.LengthUnit.FEET,
                1.0, Length.LengthUnit.YARDS);

        // CM vs Feet
        demonstrateLengthComparison(30.48, Length.LengthUnit.CENTIMETERS,
                1.0, Length.LengthUnit.FEET);
    }


}