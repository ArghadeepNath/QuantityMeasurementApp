package com.apps.quantitymeasurement.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementEntityTest {

    @Test
    void testEntityCreation() {

        QuantityMeasurementEntity entity =
                new QuantityMeasurementEntity();

        entity.setId(1);

        entity.setThisValue(1.0);

        entity.setThisUnit("FEET");

        entity.setOperation("ADD");

        entity.setResultString("2 FEET");

        assertEquals(
                1,
                entity.getId()
        );

        assertEquals(
                1.0,
                entity.getThisValue()
        );

        assertEquals(
                "FEET",
                entity.getThisUnit()
        );

        assertEquals(
                "ADD",
                entity.getOperation()
        );

        assertEquals(
                "2 FEET",
                entity.getResultString()
        );
    }

    @Test
    void testErrorFlags() {

        QuantityMeasurementEntity entity =
                new QuantityMeasurementEntity();

        entity.setError(true);

        entity.setErrorMessage(
                "Division by zero"
        );

        Assertions.assertTrue(entity.isError());

        assertEquals(
                "Division by zero",
                entity.getErrorMessage()
        );
    }

    @Test
    void testToString_NotNull() {

        QuantityMeasurementEntity entity =
                new QuantityMeasurementEntity();

        entity.setId(10);

        entity.setOperation("COMPARE");

        String result =
                entity.toString();

        assertNotNull(result);

        assertTrue(
                result.contains("COMPARE")
        );
    }
}