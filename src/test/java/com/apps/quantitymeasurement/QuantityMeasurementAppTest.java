package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//import com.apps.quantitymeasurement.Length;
import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementAppTest {

    // 1. Same unit (Feet)
    @Test
    void givenSameFeetValue_shouldReturnTrue() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(1.0, LengthUnit.FEET);

        assertTrue(l1.equals(l2));
    }

    // 2. Same unit (Inches)
    @Test
    void givenSameInchesValue_shouldReturnTrue() {
        Length l1 = new Length(12.0, LengthUnit.INCHES);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
    }

    // 🔥 3. Cross-unit equality (CORE UC3)
    @Test
    void givenFeetAndInchesEquivalent_shouldReturnTrue() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
    }

    // 4. Cross-unit inequality
    @Test
    void givenFeetAndInchesNotEquivalent_shouldReturnFalse() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(10.0, LengthUnit.INCHES);

        assertFalse(l1.equals(l2));
    }

    // 5. Same unit inequality (Feet)
    @Test
    void givenDifferentFeetValues_shouldReturnFalse() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(2.0, LengthUnit.FEET);

        assertFalse(l1.equals(l2));
    }

    // 6. Same unit inequality (Inches)
    @Test
    void givenDifferentInchesValues_shouldReturnFalse() {
        Length l1 = new Length(12.0, LengthUnit.INCHES);
        Length l2 = new Length(24.0, LengthUnit.INCHES);

        assertFalse(l1.equals(l2));
    }

    // 7. Reflexive property
    @Test
    void equals_shouldBeReflexive() {
        Length l = new Length(5.0, LengthUnit.FEET);

        assertTrue(l.equals(l));
    }

    // 8. Symmetric property
    @Test
    void equals_shouldBeSymmetric() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
        assertTrue(l2.equals(l1));
    }

    // 9. Transitive property
    @Test
    void equals_shouldBeTransitive() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);
        Length l3 = new Length(1.0, LengthUnit.FEET);

        assertTrue(l1.equals(l2));
        assertTrue(l2.equals(l3));
        assertTrue(l1.equals(l3));
    }

    // 10. Null check
    @Test
    void givenNull_shouldReturnFalse() {
        Length l = new Length(1.0, LengthUnit.FEET);

        assertFalse(l.equals(null));
    }

    // 11. Different type
    @Test
    void givenDifferentType_shouldReturnFalse() {
        Length l = new Length(1.0, LengthUnit.FEET);

        assertFalse(l.equals(new Object()));
    }

    // 12. Zero value
    @Test
    void givenZeroValue_shouldReturnTrue() {
        Length l1 = new Length(0.0, LengthUnit.FEET);
        Length l2 = new Length(0.0, LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
    }

    // 13. Negative values
    @Test
    void givenNegativeValues_shouldCompareCorrectly() {
        Length l1 = new Length(-1.0, LengthUnit.FEET);
        Length l2 = new Length(-12.0, LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
    }
}