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

    public static <U extends IMeasurable> Quantity<U> demonstrateSubtraction(
            Quantity<U> quantity1, Quantity<U> quantity2) {

        if (quantity1 == null || quantity2 == null) {
            throw new IllegalArgumentException("Quantities cannot be null");
        }
        return quantity1.subtract(quantity2);
    }

    public static <U extends IMeasurable> Quantity<U> demonstrateSubtraction(
            Quantity<U> quantity1, Quantity<U> quantity2, U targetUnit) {

        if (quantity1 == null || quantity2 == null || targetUnit == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        return quantity1.subtract(quantity2, targetUnit);
    }

    public static <U extends IMeasurable> double demonstrateDivision(
            Quantity<U> quantity1, Quantity<U> quantity2) {

        if (quantity1 == null || quantity2 == null) {
            throw new IllegalArgumentException("Quantities cannot be null");
        }
        return quantity1.divide(quantity2);
    }

    public static void main(String[] args) {

        Quantity<LengthUnit> l1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> l2 = new Quantity<>(12.0, LengthUnit.INCHES);

        System.out.println(demonstrateEquality(l1, l2));
        System.out.println(demonstrateConversion(l1, LengthUnit.INCHES));
        System.out.println(demonstrateAddition(l1, l2));
        System.out.println(demonstrateAddition(l1, l2, LengthUnit.INCHES));
        System.out.println(demonstrateSubtraction(l1, l2));
        System.out.println(demonstrateSubtraction(l1, l2, LengthUnit.INCHES));
        System.out.println(demonstrateDivision(l1, l2));

        Quantity<LengthUnit> a = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> b = new Quantity<>(5.0, LengthUnit.FEET);

        System.out.println(demonstrateAddition(a, b));
        System.out.println(demonstrateSubtraction(a, b));
        System.out.println(demonstrateDivision(a, b));

        Quantity<LengthUnit> f = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> i = new Quantity<>(6.0, LengthUnit.INCHES);

        System.out.println(demonstrateSubtraction(f, i));
        System.out.println(demonstrateAddition(f, i, LengthUnit.INCHES));

        try {
            System.out.println(demonstrateDivision(new Quantity<>(10.0, LengthUnit.FEET), new Quantity<>(0.0, LengthUnit.FEET)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(demonstrateAddition(null, l1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Quantity<TemperatureUnit> t1 = new Quantity<>(0.0, TemperatureUnit.CELSIUS);
        Quantity<TemperatureUnit> t2 = new Quantity<>(32.0, TemperatureUnit.FAHRENHEIT);

        System.out.println(t1.equals(t2)); // true
        System.out.println(t1.convertTo(TemperatureUnit.KELVIN)); // 273.15

        try {
            System.out.println(t1.add(t2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}