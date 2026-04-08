package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.Length;
import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementAppTest {

    @Test
    void centimeterEquals39Point3701Inches() {
        assertTrue(new Length(100.0, LengthUnit.CENTIMETERS)
                .equals(new Length(39.3701, LengthUnit.INCHES)));
    }

    @Test
    void testFeetInchesComparison() {
        assertTrue(new Length(1.0, LengthUnit.FEET)
                .equals(new Length(12.0, LengthUnit.INCHES)));
    }

    @Test
    void testInchesInequality() {
        assertFalse(new Length(12.0, LengthUnit.INCHES)
                .equals(new Length(10.0, LengthUnit.INCHES)));
    }

    @Test
    void differentValuesSameUnitNotEqual() {
        assertFalse(new Length(2.0, LengthUnit.FEET)
                .equals(new Length(3.0, LengthUnit.FEET)));
    }

    @Test
    void crossUnitEqualityDemonstrateMethod() {
        assertTrue(new Length(1.0, LengthUnit.YARDS)
                .equals(new Length(36.0, LengthUnit.INCHES)));
    }

    @Test
    void testFeetEquality() {
        assertTrue(new Length(5.0, LengthUnit.FEET)
                .equals(new Length(5.0, LengthUnit.FEET)));
    }

    @Test
    void testFeetInequality() {
        assertFalse(new Length(5.0, LengthUnit.FEET)
                .equals(new Length(6.0, LengthUnit.FEET)));
    }

    @Test
    void yardNotEqualToInches() {
        assertFalse(new Length(1.0, LengthUnit.YARDS)
                .equals(new Length(30.0, LengthUnit.INCHES)));
    }

    @Test
    void reflexiveSymmetricAndTransitiveProperty() {
        Length a = new Length(1.0, LengthUnit.YARDS);
        Length b = new Length(3.0, LengthUnit.FEET);
        Length c = new Length(36.0, LengthUnit.INCHES);

        // Reflexive
        assertTrue(a.equals(a));

        // Symmetric
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));

        // Transitive
        assertTrue(a.equals(b));
        assertTrue(b.equals(c));
        assertTrue(a.equals(c));
    }

    @Test
    void testCrossUnitInequality() {
        assertFalse(new Length(1.0, LengthUnit.FEET)
                .equals(new Length(10.0, LengthUnit.INCHES)));
    }

    @Test
    void testMultipleFeetComparison() {
        assertTrue(new Length(3.0, LengthUnit.FEET)
                .equals(new Length(1.0, LengthUnit.YARDS)));
    }

    @Test
    void yardEquals36Inches() {
        assertTrue(new Length(1.0, LengthUnit.YARDS)
                .equals(new Length(36.0, LengthUnit.INCHES)));
    }

    @Test
    void convertYardsToInchesUsingOverloadedMethod() {
        Length l = new Length(1.0, LengthUnit.YARDS);
        assertTrue(l.convertTo(LengthUnit.INCHES)
                .equals(new Length(36.0, LengthUnit.INCHES)));
    }

    @Test
    void thirtyPoint48CmEqualsOneFoot() {
        assertTrue(new Length(30.48, LengthUnit.CENTIMETERS)
                .equals(new Length(1.0, LengthUnit.FEET)));
    }

    @Test
    void equalsReturnsFalseForNull() {
        assertFalse(new Length(1.0, LengthUnit.FEET).equals(null));
    }

    @Test
    void referenceEqualitySameObject() {
        Length l = new Length(2.0, LengthUnit.FEET);
        assertTrue(l.equals(l));
    }

    @Test
    void threeFeetEqualsOneYard() {
        assertTrue(new Length(3.0, LengthUnit.FEET)
                .equals(new Length(1.0, LengthUnit.YARDS)));
    }

    @Test
    void testInchesEquality() {
        assertTrue(new Length(12.0, LengthUnit.INCHES)
                .equals(new Length(12.0, LengthUnit.INCHES)));
    }

    @Test
    void convertFeetToInches() {
        Length l = new Length(1.0, LengthUnit.FEET);
        assertTrue(l.convertTo(LengthUnit.INCHES)
                .equals(new Length(12.0, LengthUnit.INCHES)));
    }
}