package com.apps.quantitymeasurement.dto;

public class QuantityDTO {

    private double value;
    private String unit;

    public QuantityDTO(double value, String unit) {

        if (!Double.isFinite(value))
            throw new IllegalArgumentException(
                    "Invalid value"
            );

        if (unit == null || unit.isBlank())
            throw new IllegalArgumentException(
                    "Unit cannot be null or empty"
            );

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "QuantityDTO{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}