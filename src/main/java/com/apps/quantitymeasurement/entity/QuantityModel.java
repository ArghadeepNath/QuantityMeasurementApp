package com.apps.quantitymeasurement.entity;

import com.apps.quantitymeasurement.unit.IMeasurable;

public class QuantityModel<U extends IMeasurable> {

    private final double value;

    private final U unit;

    public QuantityModel(
            double value,
            U unit
    ) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException(
                    "Invalid quantity value"
            );
        }

        if (unit == null) {
            throw new IllegalArgumentException(
                    "Unit cannot be null"
            );
        }

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public U getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "QuantityModel{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}