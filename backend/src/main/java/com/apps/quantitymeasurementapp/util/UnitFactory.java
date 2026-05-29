package com.apps.quantitymeasurementapp.util;

import com.apps.quantitymeasurementapp.unit.*;

public class UnitFactory {

    public static IMeasurable getUnit(String unitName) {

        if (unitName == null || unitName.isBlank()) {
            throw new IllegalArgumentException(
                    "Unit name cannot be null or empty"
            );
        }

        String normalized = unitName.trim().toUpperCase();

        try {
            return LengthUnit.valueOf(normalized);
        } catch (IllegalArgumentException ignored) {}

        try {
            return WeightUnit.valueOf(normalized);
        } catch (IllegalArgumentException ignored) {}

        try {
            return VolumeUnit.valueOf(normalized);
        } catch (IllegalArgumentException ignored) {}

        try {
            return TemperatureUnit.valueOf(normalized);
        } catch (IllegalArgumentException ignored) {}

        throw new IllegalArgumentException(
                "Invalid unit: " + unitName
        );
    }
}