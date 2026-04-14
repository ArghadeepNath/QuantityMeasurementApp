package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.Length;
import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementAppTest {

//    // UC1 - FEET
//
//    @Test
//    void givenSameFeetValueFeet_shouldReturnTrue() {
//        Feet f1 = new Feet(1.0);
//        Feet f2 = new Feet(1.0);
//        assertTrue(f1.equals(f2));
//    }
//
//    @Test
//    void givenDifferentFeetValueFeet_shouldReturnFalse() {
//        Feet f1 = new Feet(1.0);
//        Feet f2 = new Feet(2.0);
//        assertFalse(f1.equals(f2));
//    }
//
//    @Test
//    void givenSameReferenceFeet_shouldReturnTrue() {
//        Feet f1 = new Feet(1.0);
//        assertTrue(f1.equals(f1));
//    }
//
//    @Test
//    void givenNullFeet_shouldReturnFalse() {
//        Feet f1 = new Feet(1.0);
//        assertFalse(f1.equals(null));
//    }
//
//    @Test
//    void givenDifferentTypeFeet_shouldReturnFalse() {
//        Feet f1 = new Feet(1.0);
//        assertFalse(f1.equals(new Object()));
//    }
//
//    @Test
//    void equalsFeet_shouldBeReflexive() {
//        Feet f = new Feet(2.5);
//        assertTrue(f.equals(f));
//    }
//
//    @Test
//    void equalsFeet_shouldBeSymmetric() {
//        Feet f1 = new Feet(3.0);
//        Feet f2 = new Feet(3.0);
//        assertTrue(f1.equals(f2));
//        assertTrue(f2.equals(f1));
//    }
//
//    @Test
//    void equalsFeet_shouldBeTransitive() {
//        Feet f1 = new Feet(4.0);
//        Feet f2 = new Feet(4.0);
//        Feet f3 = new Feet(4.0);
//        assertTrue(f1.equals(f2));
//        assertTrue(f2.equals(f3));
//        assertTrue(f1.equals(f3));
//    }
//
//    @Test
//    void equalsFeet_shouldBeConsistent() {
//        Feet f1 = new Feet(5.0);
//        Feet f2 = new Feet(5.0);
//        assertTrue(f1.equals(f2));
//        assertTrue(f1.equals(f2));
//    }
//
//    @Test
//    void givenFloatingPointPrecisionFeet_shouldCompareCorrectly() {
//        Feet f1 = new Feet(0.1 + 0.2);
//        Feet f2 = new Feet(0.3);
//        assertTrue(f1.equals(f2));
//    }
//
//    @Test
//    void equalFeetObjects_shouldHaveSameHashCode() {
//        Feet f1 = new Feet(6.0);
//        Feet f2 = new Feet(6.0);
//        assertEquals(f1.hashCode(), f2.hashCode());
//    }
//
//    @Test
//    void givenNegativeFeetValues_shouldCompareCorrectly() {
//        Feet f1 = new Feet(-2.0);
//        Feet f2 = new Feet(-2.0);
//        assertTrue(f1.equals(f2));
//    }
//
//    @Test
//    void givenZeroFeetValue_shouldCompareCorrectly() {
//        Feet f1 = new Feet(0.0);
//        Feet f2 = new Feet(0.0);
//        assertTrue(f1.equals(f2));
//    }
//
//    // UC2 - INCHES
//
//    @Test
//    void givenSameInchesValueInches_shouldReturnTrue() {
//        Inches f1 = new Inches(1.0);
//        Inches f2 = new Inches(1.0);
//        assertTrue(f1.equals(f2));
//    }
//
//    @Test
//    void givenDifferentInchesValueInches_shouldReturnFalse() {
//        Inches f1 = new Inches(1.0);
//        Inches f2 = new Inches(2.0);
//        assertFalse(f1.equals(f2));
//    }
//
//    @Test
//    void givenSameInchesReferenceInches_shouldReturnTrue() {
//        Inches f1 = new Inches(1.0);
//        assertTrue(f1.equals(f1));
//    }
//
//    @Test
//    void givenNullInches_shouldReturnFalse() {
//        Inches f1 = new Inches(1.0);
//        assertFalse(f1.equals(null));
//    }
//
//    @Test
//    void givenDifferentTypeInches_shouldReturnFalse() {
//        Inches f1 = new Inches(1.0);
//        assertFalse(f1.equals(new Object()));
//    }
//
//    @Test
//    void equalsInches_shouldBeReflexive() {
//        Inches f = new Inches(2.5);
//        assertTrue(f.equals(f));
//    }
//
//    @Test
//    void equalsInches_shouldBeSymmetric() {
//        Inches f1 = new Inches(3.0);
//        Inches f2 = new Inches(3.0);
//        assertTrue(f1.equals(f2));
//        assertTrue(f2.equals(f1));
//    }
//
//    @Test
//    void equalsInches_shouldBeTransitive() {
//        Inches f1 = new Inches(4.0);
//        Inches f2 = new Inches(4.0);
//        Inches f3 = new Inches(4.0);
//        assertTrue(f1.equals(f2));
//        assertTrue(f2.equals(f3));
//        assertTrue(f1.equals(f3));
//    }
//
//    @Test
//    void equalsInches_shouldBeConsistent() {
//        Inches f1 = new Inches(5.0);
//        Inches f2 = new Inches(5.0);
//        assertTrue(f1.equals(f2));
//        assertTrue(f1.equals(f2));
//    }
//
//    @Test
//    void equalInchesObjects_shouldHaveSameHashCode() {
//        Inches f1 = new Inches(6.0);
//        Inches f2 = new Inches(6.0);
//        assertEquals(f1.hashCode(), f2.hashCode());
//    }
//
//    @Test
//    void givenNegativeInchesValues_shouldCompareCorrectly() {
//        Inches f1 = new Inches(-2.0);
//        Inches f2 = new Inches(-2.0);
//        assertTrue(f1.equals(f2));
//    }
//
//    @Test
//    void givenZeroInchesValue_shouldCompareCorrectly() {
//        Inches f1 = new Inches(0.0);
//        Inches f2 = new Inches(0.0);
//        assertTrue(f1.equals(f2));
//    }

    //UC3

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

    //UC4

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

    //UC5

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


    //UC6

    @Test
    void testAddition_SameUnit_FeetPlusFeet() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(2.0, Length.LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(3.0, result.convertTo(Length.LengthUnit.FEET).value);
    }

    @Test
    void testAddition_SameUnit_InchPlusInch() {
        Length l1 = new Length(6.0, Length.LengthUnit.INCHES);
        Length l2 = new Length(6.0, Length.LengthUnit.INCHES);

        Length result = l1.add(l2);

        assertEquals(12.0, result.convertTo(Length.LengthUnit.INCHES).value);
    }

    @Test
    void testAddition_CrossUnit_FeetPlusInches() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(12.0, Length.LengthUnit.INCHES);

        Length result = l1.add(l2);

        assertEquals(2.0, result.convertTo(Length.LengthUnit.FEET).value);
    }

    @Test
    void testAddition_CrossUnit_InchPlusFeet() {
        Length l1 = new Length(12.0, Length.LengthUnit.INCHES);
        Length l2 = new Length(1.0, Length.LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(24.0, result.convertTo(Length.LengthUnit.INCHES).value);
    }

    @Test
    void testAddition_CrossUnit_YardPlusFeet() {
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length l2 = new Length(3.0, Length.LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(2.0, result.convertTo(Length.LengthUnit.YARDS).value);
    }

    @Test
    void testAddition_CrossUnit_CentimeterPlusInch() {
        Length l1 = new Length(2.54, Length.LengthUnit.CENTIMETERS);
        Length l2 = new Length(1.0, Length.LengthUnit.INCHES);

        Length result = l1.add(l2);

        assertEquals(5.08, result.convertTo(Length.LengthUnit.CENTIMETERS).value);
    }

    @Test
    void testAddition_Commutativity() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(12.0, Length.LengthUnit.INCHES);

        assertEquals(l1.add(l2), l2.add(l1));
    }

    @Test
    void testAddition_WithZero() {
        Length l1 = new Length(5.0, Length.LengthUnit.FEET);
        Length l2 = new Length(0.0, Length.LengthUnit.INCHES);

        Length result = l1.add(l2);

        assertEquals(5.0, result.convertTo(Length.LengthUnit.FEET).value);
    }

    @Test
    void testAddition_NegativeValues() {
        Length l1 = new Length(5.0, Length.LengthUnit.FEET);
        Length l2 = new Length(-2.0, Length.LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(3.0, result.convertTo(Length.LengthUnit.FEET).value);
    }

    @Test
    void testAddition_NullSecondOperand() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);

        assertThrows(IllegalArgumentException.class, () -> l1.add(null));
    }

    @Test
    void testAddition_LargeValues() {
        Length l1 = new Length(1e6, Length.LengthUnit.FEET);
        Length l2 = new Length(1e6, Length.LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(2e6, result.convertTo(Length.LengthUnit.FEET).value);
    }

    @Test
    void testAddition_SmallValues() {
        Length l1 = new Length(0.001, Length.LengthUnit.FEET);
        Length l2 = new Length(0.002, Length.LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(0.003, result.convertTo(Length.LengthUnit.FEET).value);
    }


}