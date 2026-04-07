package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {

    //Feet Test Cases

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
    void givenSameFeetReference_shouldReturnTrue() {
        Feet f1 = new Feet(1.0);

        assertTrue(f1.equals(f1));
    }

    @Test
    void givenNullWithFeet_shouldReturnFalse() {
        Feet f1 = new Feet(1.0);

        assertFalse(f1.equals(null));
    }

    @Test
    void givenDifferentWithFeetType_shouldReturnFalse() {
        Feet f1 = new Feet(1.0);
        Object obj = new Object();

        assertFalse(f1.equals(obj));
    }

    @Test
    void equalsFeetSelf_shouldBeReflexive() {
        Feet f = new Feet(2.5);

        assertTrue(f.equals(f));
    }

    @Test
    void equalsFeet_shouldBeSymmetric() {
        Feet f1 = new Feet(3.0);
        Feet f2 = new Feet(3.0);

        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f1));
    }

    @Test
    void equalsFeet_shouldBeTransitive() {
        Feet f1 = new Feet(4.0);
        Feet f2 = new Feet(4.0);
        Feet f3 = new Feet(4.0);

        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f3));
        assertTrue(f1.equals(f3));
    }

    @Test
    void equalsFeet_shouldBeConsistent() {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(5.0);

        assertTrue(f1.equals(f2));
        assertTrue(f1.equals(f2)); // repeat
    }

    @Test
    void equalFeetObjects_shouldHaveSameHashCode() {
        Feet f1 = new Feet(6.0);
        Feet f2 = new Feet(6.0);

        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    void givenFeetNegativeValues_shouldCompareCorrectly() {
        Feet f1 = new Feet(-2.0);
        Feet f2 = new Feet(-2.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    void givenZeroFeetValue_shouldCompareCorrectly() {
        Feet f1 = new Feet(0.0);
        Feet f2 = new Feet(0.0);

        assertTrue(f1.equals(f2));
    }

    //Inches Test Cases

    @Test
    void givenSameInchesValue_shouldReturnTrue() {
        Inches f1 = new Inches(1.0);
        Inches f2 = new Inches(1.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    void givenDifferentInchesValue_shouldReturnFalse() {
        Inches f1 = new Inches(1.0);
        Inches f2 = new Inches(2.0);

        assertFalse(f1.equals(f2));
    }

    @Test
    void givenSameInchesReference_shouldReturnTrue() {
        Inches f1 = new Inches(1.0);

        assertTrue(f1.equals(f1));
    }

    @Test
    void givenNullWithInches_shouldReturnFalse() {
        Inches f1 = new Inches(1.0);

        assertFalse(f1.equals(null));
    }

    @Test
    void givenDifferentWithInchesType_shouldReturnFalse() {
        Inches f1 = new Inches(1.0);
        Object obj = new Object();

        assertFalse(f1.equals(obj));
    }

    @Test
    void equalsInchesSelf_shouldBeReflexive() {
        Inches f = new Inches(2.5);

        assertTrue(f.equals(f));
    }

    @Test
    void equalsInches_shouldBeSymmetric() {
        Inches f1 = new Inches(3.0);
        Inches f2 = new Inches(3.0);

        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f1));
    }

    @Test
    void equalsInches_shouldBeTransitive() {
        Inches f1 = new Inches(4.0);
        Inches f2 = new Inches(4.0);
        Inches f3 = new Inches(4.0);

        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f3));
        assertTrue(f1.equals(f3));
    }

    @Test
    void equalsInches_shouldBeConsistent() {
        Inches f1 = new Inches(5.0);
        Inches f2 = new Inches(5.0);

        assertTrue(f1.equals(f2));
        assertTrue(f1.equals(f2)); // repeat
    }

    @Test
    void equalInchesObjects_shouldHaveSameHashCode() {
        Inches f1 = new Inches(6.0);
        Inches f2 = new Inches(6.0);

        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    void givenInchesNegativeValues_shouldCompareCorrectly() {
        Inches f1 = new Inches(-2.0);
        Inches f2 = new Inches(-2.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    void givenZeroInchesValue_shouldCompareCorrectly() {
        Inches f1 = new Inches(0.0);
        Inches f2 = new Inches(0.0);

        assertTrue(f1.equals(f2));
    }
}