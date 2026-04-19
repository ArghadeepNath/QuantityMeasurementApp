package com.apps.quantitymeasurement;

import java.util.Objects;

public class Length {

    double value;
    private LengthUnit unit;


    public Length(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }

        this.value = value;
        this.unit = unit;
    }

    // SAME naming kept conceptually via delegation
    private double convertTOBaseUnit() {
        return unit.convertToBaseUnit(value);
    }

    private static double convertFromBaseToTargetUnit(double baseValue, LengthUnit targetUnit) {
        return targetUnit.convertFromBaseUnit(baseValue);
    }

    // Compare
    public boolean compare(Length thatLength) {
        if (thatLength == null) return false;

        double a = this.convertTOBaseUnit();
        double b = thatLength.convertTOBaseUnit();

        return Math.abs(a - b) < 0.01;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;

        Length other = (Length) o;
        return this.compare(other);
    }

    @Override
    public int hashCode() {
        double base = convertTOBaseUnit();
        return Objects.hash(Math.round(base * 100.0) / 100.0);
    }

    // Conversion
    public Length convertTo(LengthUnit targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        double convertedValue = unit.convert(value, targetUnit);
        convertedValue = round(convertedValue);

        return new Length(convertedValue, targetUnit);
    }

    public static double convert(double value, LengthUnit source, LengthUnit target) {
        if (source == null || target == null) {
            throw new IllegalArgumentException("Units cannot be null");
        }
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }

        double convertedValue = source.convert(value, target);
        return Math.round(convertedValue * 100.0) / 100.0;
    }

    // Addition
    public Length add(Length len, LengthUnit targetUnit) {
        if (len == null || targetUnit == null) {
            throw new IllegalArgumentException("Units cannot be null");
        }

        double baseSum =
                this.convertTOBaseUnit() +
                        len.convertTOBaseUnit();

        double converted = convertFromBaseToTargetUnit(baseSum, targetUnit);
        converted = round(converted);

        return new Length(converted, targetUnit);
    }

    public Length add(Length thatLength) {
        if (thatLength == null) {
            throw new IllegalArgumentException("Units cannot be null");
        }

        return this.add(thatLength, this.unit);
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", value, unit);
    }
}