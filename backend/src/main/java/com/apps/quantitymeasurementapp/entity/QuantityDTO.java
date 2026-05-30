package com.apps.quantitymeasurementapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuantityDTO {

    private double value;
    private String unit;

    // Required by Jackson
    public QuantityDTO() {
    }

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

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "QuantityDTO{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}