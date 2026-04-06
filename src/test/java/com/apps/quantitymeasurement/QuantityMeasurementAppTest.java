package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;

public class QuantityMeasurementAppTest {

    @Test
    void givenSameFeetValue_shouldReturnTrue() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    void givenDifferentFeetValue_shouldReturnFalse() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(2.0);

        assertFalse(f1.equals(f2));
    }

    @Test
    void givenSameReference_shouldReturnTrue() {
        Feet f1 = new Feet(1.0);

        assertTrue(f1.equals(f1));
    }

    @Test
    void givenNull_shouldReturnFalse() {
        Feet f1 = new Feet(1.0);

        assertFalse(f1.equals(null));
    }

    @Test
    void givenDifferentType_shouldReturnFalse() {
        Feet f1 = new Feet(1.0);
        Object obj = new Object();

        assertFalse(f1.equals(obj));
    }

    @Test
    void equals_shouldBeReflexive() {
        Feet f = new Feet(2.5);

        assertTrue(f.equals(f));
    }

    @Test
    void equals_shouldBeSymmetric() {
        Feet f1 = new Feet(3.0);
        Feet f2 = new Feet(3.0);

        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f1));
    }

    @Test
    void equals_shouldBeTransitive() {
        Feet f1 = new Feet(4.0);
        Feet f2 = new Feet(4.0);
        Feet f3 = new Feet(4.0);

        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f3));
        assertTrue(f1.equals(f3));
    }

    @Test
    void equals_shouldBeConsistent() {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(5.0);

        assertTrue(f1.equals(f2));
        assertTrue(f1.equals(f2)); // repeat
    }

    @Test
    void givenFloatingPointPrecision_shouldCompareCorrectly() {
        Feet f1 = new Feet(0.1 + 0.2);
        Feet f2 = new Feet(0.3);

        assertTrue(f1.equals(f2));
    }

    @Test
    void equalObjects_shouldHaveSameHashCode() {
        Feet f1 = new Feet(6.0);
        Feet f2 = new Feet(6.0);

        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    void givenNegativeValues_shouldCompareCorrectly() {
        Feet f1 = new Feet(-2.0);
        Feet f2 = new Feet(-2.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    void givenZeroValue_shouldCompareCorrectly() {
        Feet f1 = new Feet(0.0);
        Feet f2 = new Feet(0.0);

        assertTrue(f1.equals(f2));
    }
}