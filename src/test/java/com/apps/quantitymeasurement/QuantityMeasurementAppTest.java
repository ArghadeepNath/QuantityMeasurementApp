package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.Length;
import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementAppTest {

    // 1
    @Test
    void testEquality_YardToYard_SameValue() {
        assertTrue(new Length(1.0, LengthUnit.YARDS)
                .equals(new Length(1.0, LengthUnit.YARDS)));
    }

    // 2
    @Test
    void testEquality_YardToYard_DifferentValue() {
        assertFalse(new Length(1.0, LengthUnit.YARDS)
                .equals(new Length(2.0, LengthUnit.YARDS)));
    }

    // 3
    @Test
    void testEquality_YardToFeet_EquivalentValue() {
        assertTrue(new Length(1.0, LengthUnit.YARDS)
                .equals(new Length(3.0, LengthUnit.FEET)));
    }

    // 4
    @Test
    void testEquality_FeetToYard_EquivalentValue() {
        assertTrue(new Length(3.0, LengthUnit.FEET)
                .equals(new Length(1.0, LengthUnit.YARDS)));
    }

    // 5
    @Test
    void testEquality_YardToInches_EquivalentValue() {
        assertTrue(new Length(1.0, LengthUnit.YARDS)
                .equals(new Length(36.0, LengthUnit.INCHES)));
    }

    // 6
    @Test
    void testEquality_InchesToYard_EquivalentValue() {
        assertTrue(new Length(36.0, LengthUnit.INCHES)
                .equals(new Length(1.0, LengthUnit.YARDS)));
    }

    // 7
    @Test
    void testEquality_YardToFeet_NonEquivalentValue() {
        assertFalse(new Length(1.0, LengthUnit.YARDS)
                .equals(new Length(2.0, LengthUnit.FEET)));
    }

    // 8
    @Test
    void testEquality_centimetersToInches_EquivalentValue() {
        assertTrue(new Length(1.0, LengthUnit.CENTIMETERS)
                .equals(new Length(0.393701, LengthUnit.INCHES)));
    }

    // 9
    @Test
    void testEquality_centimetersToFeet_NonEquivalentValue() {
        assertFalse(new Length(1.0, LengthUnit.CENTIMETERS)
                .equals(new Length(1.0, LengthUnit.FEET)));
    }

    // 10 (Transitive)
    @Test
    void testEquality_MultiUnit_TransitiveProperty() {
        Length a = new Length(1.0, LengthUnit.YARDS);
        Length b = new Length(3.0, LengthUnit.FEET);
        Length c = new Length(36.0, LengthUnit.INCHES);

        assertTrue(a.equals(b));
        assertTrue(b.equals(c));
        assertTrue(a.equals(c));
    }

    // 11 (Null unit yard)
    @Test
    void testEquality_YardWithNullUnit() {
        Length l = new Length(1.0, null);
        Length l2 = new Length(1.0, LengthUnit.YARDS);

        assertThrows(NullPointerException.class, () -> l.equals(l2));
    }

    // 12 (Reflexive yard)
    @Test
    void testEquality_YardSameReference() {
        Length l = new Length(1.0, LengthUnit.YARDS);
        assertTrue(l.equals(l));
    }

    // 13 (Null comparison yard)
    @Test
    void testEquality_YardNullComparison() {
        Length l = new Length(1.0, LengthUnit.YARDS);
        assertFalse(l.equals(null));
    }

    // 14 (Null unit cm)
    @Test
    void testEquality_CentimetersWithNullUnit() {
        Length l = new Length(1.0, null);
        Length l2 = new Length(1.0, LengthUnit.CENTIMETERS);

        assertThrows(NullPointerException.class, () -> l.equals(l2));
    }

    // 15 (Reflexive cm)
    @Test
    void testEquality_CentimetersSameReference() {
        Length l = new Length(1.0, LengthUnit.CENTIMETERS);
        assertTrue(l.equals(l));
    }

    // 16 (Null comparison cm)
    @Test
    void testEquality_CentimetersNullComparison() {
        Length l = new Length(1.0, LengthUnit.CENTIMETERS);
        assertFalse(l.equals(null));
    }

    // 17 (Complex multi-unit)
    @Test
    void testEquality_AllUnits_ComplexScenario() {
        Length a = new Length(2.0, LengthUnit.YARDS);
        Length b = new Length(6.0, LengthUnit.FEET);
        Length c = new Length(72.0, LengthUnit.INCHES);

        assertTrue(a.equals(b));
        assertTrue(b.equals(c));
        assertTrue(a.equals(c));
    }
}