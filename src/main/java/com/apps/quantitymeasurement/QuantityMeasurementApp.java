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

    public static boolean demonstrateWeightEquality(Weight w1, Weight w2){
        return w1.equals(w2);
    }

    private static void demonstrateWeightComparison(double v1, WeightUnit unit1,
                                                    double v2, WeightUnit unit2) {
        Weight w1 = new Weight(v1, unit1);
        Weight w2 = new Weight(v2, unit2);

        boolean result = w1.equals(w2);

        System.out.println(v1 + " " + unit1 + " vs " +
                v2 + " " + unit2 + " → " + result);
    }

    public static Weight demonstrateWeightConversion(double value,
                                                     WeightUnit fromUnit,
                                                     WeightUnit toUnit) {
        Weight weight = new Weight(value, fromUnit);
        Weight result = weight.convertTo(toUnit);

        System.out.println(value + " " + fromUnit + " → " + result);
        return result;
    }

    public static Weight demonstrateWeightConversion(Weight weight,
                                                     WeightUnit toUnit) {
        Weight result = weight.convertTo(toUnit);

        System.out.println(weight + " → " + result);
        return result;
    }

    public static Weight demonstrateWeightAddition(Weight w1, Weight w2){
        Weight result = w1.add(w2);

        System.out.println(w1 + " + " + w2 + " → " + result);
        return result;
    }

    public static Weight demonstrateWeightAddition(Weight w1, Weight w2,
                                                   WeightUnit targetUnit) {
        Weight result = w1.add(w2, targetUnit);

        System.out.println(w1 + " + " + w2 + " → " + result);
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

        // Weight Conversion
        demonstrateWeightConversion(1.0, WeightUnit.KILOGRAM, WeightUnit.GRAM);
        demonstrateWeightConversion(500.0, WeightUnit.GRAM, WeightUnit.POUND);

        Weight w = new Weight(2.0, WeightUnit.POUND);
        demonstrateWeightConversion(w, WeightUnit.KILOGRAM);

        // Weight Comparison
        demonstrateWeightComparison(1.0, WeightUnit.KILOGRAM,
                1000.0, WeightUnit.GRAM);

        demonstrateWeightComparison(2.0, WeightUnit.POUND,
                907.184, WeightUnit.GRAM);

        //  Weight Addition
        Weight w1 = new Weight(1.0, WeightUnit.KILOGRAM);
        Weight w2 = new Weight(500.0, WeightUnit.GRAM);

        demonstrateWeightAddition(w1, w2);
        demonstrateWeightAddition(w1, w2, WeightUnit.GRAM);
    }
}