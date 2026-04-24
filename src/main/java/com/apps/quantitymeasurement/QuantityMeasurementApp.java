package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static <U extends IMeasurable> boolean demonstrateEquality(Quantity<U> quantity1, Quantity<U> quantity2) {
        if (quantity1 == null || quantity2 == null) return false;

        return quantity1.equals(quantity2);
    }

    public static <U extends IMeasurable> Quantity<U> demonstrateConversion(Quantity<U> quantity, U targetUnit) {
        if (quantity == null || targetUnit == null) {
            throw new IllegalArgumentException("Quantity or target unit cannot be null");
        }

        return quantity.convertTo(targetUnit);
    }

    public static <U extends IMeasurable> Quantity<U> demonstrateAddition(Quantity<U> quantity1, Quantity<U> quantity2) {
        if (quantity1 == null || quantity2 == null) {
            throw new IllegalArgumentException("Quantities cannot be null");
        }
        return quantity1.add(quantity2);
    }

    public static <U extends IMeasurable> Quantity<U> demonstrateAddition(Quantity<U> quantity1, Quantity<U> quantity2, U targetUnit) {
        if (quantity1 == null || quantity2 == null || targetUnit == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        return quantity1.add(quantity2, targetUnit);
    }

    public static void main(String[] args) {

        // Equality
        Quantity<WeightUnit> weightInGrams = new Quantity<>(1000.0, WeightUnit.GRAM);
        Quantity<WeightUnit> weightInKilograms = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        boolean areEqual = demonstrateEquality(weightInGrams, weightInKilograms);

        System.out.println("Are weights equal? " + areEqual);

        // Convert
        Quantity<WeightUnit> convertedWeight = demonstrateConversion(weightInGrams, WeightUnit.KILOGRAM);

        System.out.println("Converted Weight: "+ convertedWeight.getValue() + " "+ convertedWeight.getUnit());

        // Add
        Quantity<WeightUnit> weightInPounds = new Quantity<>(2.20462, WeightUnit.POUND);

        Quantity<WeightUnit> sumWeight = demonstrateAddition(weightInKilograms, weightInPounds);

        System.out.println("Sum Weight: "+ sumWeight.getValue() + " "+ sumWeight.getUnit());

        Quantity<WeightUnit> sumWeightInGrams = demonstrateAddition(weightInKilograms, weightInPounds, WeightUnit.GRAM);

        System.out.println("Sum Weight in Grams: " +sumWeightInGrams.getValue() + " "+ sumWeightInGrams.getUnit());

        System.out.println("Length Operations:");

        Quantity<LengthUnit> l1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> l2 = new Quantity<>(12.0, LengthUnit.INCHES);

        System.out.println("Input: new Quantity<>(1.0, FEET).equals(new Quantity<>(12.0, INCHES)) → Output: "+ l1.equals(l2));

        System.out.println("Input: new Quantity<>(1.0, FEET).convertTo(INCHES) → Output: "+ l1.convertTo(LengthUnit.INCHES));

        System.out.println("Input: add in FEET → Output: "+ l1.add(l2, LengthUnit.FEET));

        System.out.println("\nWeight Operations:");

        Quantity<WeightUnit> w1 = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> w2 = new Quantity<>(1000.0, WeightUnit.GRAM);

        System.out.println("Input: new Quantity<>(1.0, KG).equals(new Quantity<>(1000.0, G)) → Output: "+ w1.equals(w2));

        System.out.println("Input: convertTo(GRAM) → Output: "+ w1.convertTo(WeightUnit.GRAM));

        System.out.println("Input: add in KG → Output: "+ w1.add(w2, WeightUnit.KILOGRAM));

        System.out.println("\nCross Category:");

        Quantity<LengthUnit> len = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<WeightUnit> wt = new Quantity<>(1.0, WeightUnit.KILOGRAM);

        System.out.println("Length vs Weight equals → Output: " + len.equals(wt));

        System.out.println("\nGeneric Methods:");

        System.out.println("demonstrateEquality(length) → "+ demonstrateEquality(l1, l2));

        System.out.println("demonstrateEquality(weight) → "+ demonstrateEquality(w1, w2));
    }
}