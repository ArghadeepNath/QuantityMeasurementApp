package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.Length;
import com.apps.quantitymeasurement.LengthUnit;

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
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(2.0, LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(3.0, result.convertTo(LengthUnit.FEET).value);
    }

    @Test
    void testAddition_SameUnit_InchPlusInch() {
        Length l1 = new Length(6.0, LengthUnit.INCHES);
        Length l2 = new Length(6.0, LengthUnit.INCHES);

        Length result = l1.add(l2);

        assertEquals(12.0, result.convertTo(LengthUnit.INCHES).value);
    }

    @Test
    void testAddition_CrossUnit_FeetPlusInches() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = l1.add(l2);

        assertEquals(2.0, result.convertTo(LengthUnit.FEET).value);
    }

    @Test
    void testAddition_CrossUnit_InchPlusFeet() {
        Length l1 = new Length(12.0, LengthUnit.INCHES);
        Length l2 = new Length(1.0, LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(24.0, result.convertTo(LengthUnit.INCHES).value);
    }

    @Test
    void testAddition_CrossUnit_YardPlusFeet() {
        Length l1 = new Length(1.0, LengthUnit.YARDS);
        Length l2 = new Length(3.0, LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(2.0, result.convertTo(LengthUnit.YARDS).value);
    }

    @Test
    void testAddition_CrossUnit_CentimeterPlusInch() {
        Length l1 = new Length(2.54, LengthUnit.CENTIMETERS);
        Length l2 = new Length(1.0, LengthUnit.INCHES);

        Length result = l1.add(l2);

        assertEquals(5.08, result.convertTo(LengthUnit.CENTIMETERS).value);
    }

    @Test
    void testAddition_Commutativity() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        assertEquals(l1.add(l2), l2.add(l1));
    }

    @Test
    void testAddition_WithZero() {
        Length l1 = new Length(5.0, LengthUnit.FEET);
        Length l2 = new Length(0.0, LengthUnit.INCHES);

        Length result = l1.add(l2);

        assertEquals(5.0, result.convertTo(LengthUnit.FEET).value);
    }

    @Test
    void testAddition_NegativeValues() {
        Length l1 = new Length(5.0, LengthUnit.FEET);
        Length l2 = new Length(-2.0, LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(3.0, result.convertTo(LengthUnit.FEET).value);
    }

    @Test
    void testAddition_NullSecondOperand() {
        Length l1 = new Length(1.0, LengthUnit.FEET);

        assertThrows(IllegalArgumentException.class, () -> l1.add(null));
    }

    @Test
    void testAddition_LargeValues() {
        Length l1 = new Length(1e6, LengthUnit.FEET);
        Length l2 = new Length(1e6, LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(2e6, result.convertTo(LengthUnit.FEET).value);
    }

    @Test
    void testAddition_SmallValues() {
        Length l1 = new Length(0.01, LengthUnit.FEET);
        Length l2 = new Length(0.02, LengthUnit.FEET);

        Length result = l1.add(l2);

        assertEquals(0.03, result.convertTo(LengthUnit.FEET).value);
    }


    //UC7

    @Test
    public void addFeetAndInchesWithTargetUnitInches() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = l1.add(l2, LengthUnit.INCHES);

        assertEquals(24.0, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_Feet() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = l1.add(l2, LengthUnit.FEET);

        assertEquals(2.0, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_Inches() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = l1.add(l2, LengthUnit.INCHES);

        assertEquals(24.0, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_Yards() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = l1.add(l2, LengthUnit.YARDS);

        assertEquals(0.67, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_Centimeters() {
        Length l1 = new Length(1.0, LengthUnit.INCHES);
        Length l2 = new Length(1.0, LengthUnit.INCHES);

        Length result = l1.add(l2, LengthUnit.CENTIMETERS);

        assertEquals(5.08, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_SameAsFirstOperand() {
        Length l1 = new Length(2.0, LengthUnit.YARDS);
        Length l2 = new Length(3.0, LengthUnit.FEET);

        Length result = l1.add(l2, LengthUnit.YARDS);

        assertEquals(3.0, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_SameAsSecondOperand() {
        Length l1 = new Length(2.0, LengthUnit.YARDS);
        Length l2 = new Length(3.0, LengthUnit.FEET);

        Length result = l1.add(l2, LengthUnit.FEET);

        assertEquals(9.0, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_Commutativity() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length r1 = l1.add(l2, LengthUnit.YARDS);
        Length r2 = l2.add(l1, LengthUnit.YARDS);

        assertEquals(r1.value, r2.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_WithZero() {
        Length l1 = new Length(5.0, LengthUnit.FEET);
        Length l2 = new Length(0.0, LengthUnit.INCHES);

        Length result = l1.add(l2, LengthUnit.YARDS);

        assertEquals(1.67, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_NegativeValues() {
        Length l1 = new Length(5.0, LengthUnit.FEET);
        Length l2 = new Length(-2.0, LengthUnit.FEET);

        Length result = l1.add(l2, LengthUnit.INCHES);

        assertEquals(36.0, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_NullTargetUnit() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        assertThrows(IllegalArgumentException.class,
                () -> l1.add(l2, null));
    }

    @Test
    public void testAddition_ExplicitTargetUnit_LargeToSmallScale() {
        Length l1 = new Length(1000.0, LengthUnit.FEET);
        Length l2 = new Length(500.0, LengthUnit.FEET);

        Length result = l1.add(l2, LengthUnit.INCHES);

        assertEquals(18000.0, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_SmallToLargeScale() {
        Length l1 = new Length(12.0, LengthUnit.INCHES);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = l1.add(l2, LengthUnit.YARDS);

        assertEquals(0.67, result.value);
    }

    @Test
    public void testAddition_ExplicitTargetUnit_AllUnitCombinations() {
        Length[] values = {
                new Length(1.0, LengthUnit.FEET),
                new Length(12.0, LengthUnit.INCHES),
                new Length(1.0, LengthUnit.YARDS),
                new Length(2.54, LengthUnit.CENTIMETERS)
        };

        for (Length a : values) {
            for (Length b : values) {
                for (LengthUnit target : LengthUnit.values()) {
                    Length result = a.add(b, target);
                    assertNotNull(result);
                }
            }
        }
    }

    @Test
    public void testAddition_ExplicitTargetUnit_PrecisionTolerance() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(2.54, LengthUnit.CENTIMETERS);

        Length result = l1.add(l2, LengthUnit.INCHES);

        assertEquals(13.0, result.value);
    }

    //UC8

    @Test
    void testLengthUnitEnum_FeetConstant() {
        assertEquals(12.0, LengthUnit.FEET.getConversionFactor());
    }

    @Test
    void testLengthUnitEnum_InchesConstant() {
        assertEquals(1.0, LengthUnit.INCHES.getConversionFactor());
    }

    @Test
    void testLengthUnitEnum_YardsConstant() {
        assertEquals(36.0, LengthUnit.YARDS.getConversionFactor());
    }

    @Test
    void testLengthUnitEnum_CentimetersConstant() {
        assertEquals(0.393701, LengthUnit.CENTIMETERS.getConversionFactor(), 0.0001);
    }

    @Test
    void testConvertToBaseUnit_FeetToFeet() {
        assertEquals(60.0, LengthUnit.FEET.convertToBaseUnit(5.0));
    }

    @Test
    void testConvertToBaseUnit_InchesToFeet() {
        assertEquals(12.0, LengthUnit.INCHES.convertToBaseUnit(12.0));
    }

    @Test
    void testConvertToBaseUnit_YardsToFeet() {
        assertEquals(36.0, LengthUnit.YARDS.convertToBaseUnit(1.0));
    }

    @Test
    void testConvertToBaseUnit_CentimetersToFeet() {
        assertEquals(12.0, LengthUnit.CENTIMETERS.convertToBaseUnit(30.48), 0.01);
    }

    @Test
    void testConvertFromBaseUnit_FeetToFeet() {
        assertEquals(5.0, LengthUnit.FEET.convertFromBaseUnit(60.0));
    }

    @Test
    void testConvertFromBaseUnit_FeetToInches() {
        assertEquals(12.0, LengthUnit.INCHES.convertFromBaseUnit(12.0));
    }

    @Test
    void testConvertFromBaseUnit_FeetToYards() {
        assertEquals(1.0, LengthUnit.YARDS.convertFromBaseUnit(36.0));
    }

    @Test
    void testConvertFromBaseUnit_FeetToCentimeters() {
        assertEquals(30.48, LengthUnit.CENTIMETERS.convertFromBaseUnit(12.0), 0.01);
    }

    @Test
    void testQuantityLengthRefactored_Equality() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
    }

    @Test
    void testQuantityLengthRefactored_ConvertTo() {
        Length l = new Length(1.0, LengthUnit.FEET);
        Length result = l.convertTo(LengthUnit.INCHES);

        assertEquals(new Length(12.0, LengthUnit.INCHES), result);
    }

    @Test
    void testQuantityLengthRefactored_Add() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = l1.add(l2, LengthUnit.FEET);

        assertEquals(new Length(2.0, LengthUnit.FEET), result);
    }

    @Test
    void testQuantityLengthRefactored_AddWithTargetUnit() {
        Length l1 = new Length(1.0, LengthUnit.YARDS);
        Length l2 = new Length(3.0, LengthUnit.FEET);

        Length result = l1.add(l2, LengthUnit.YARDS);

        assertEquals(new Length(2.0, LengthUnit.YARDS), result);
    }

    @Test
    void testQuantityLengthRefactored_NullUnit() {
        assertThrows(IllegalArgumentException.class, () ->
                new Length(1.0, null)
        );
    }

    @Test
    void testQuantityLengthRefactored_InvalidValue() {
        assertThrows(IllegalArgumentException.class, () ->
                new Length(Double.NaN, LengthUnit.FEET)
        );
    }

    @Test
    void testBackwardCompatibility_UC1EqualityTests() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(1.0, LengthUnit.FEET);

        assertTrue(l1.equals(l2));
    }

    @Test
    void testBackwardCompatibility_UC5ConversionTests() {
        Length l = new Length(1.0, LengthUnit.FEET);
        Length result = l.convertTo(LengthUnit.INCHES);

        assertEquals(new Length(12.0, LengthUnit.INCHES), result);
    }

    @Test
    void testBackwardCompatibility_UC6AdditionTests() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(1.0, LengthUnit.FEET);

        assertEquals(new Length(2.0, LengthUnit.FEET), l1.add(l2));
    }

    @Test
    void testBackwardCompatibility_UC7AdditionWithTargetUnitTests() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = l1.add(l2, LengthUnit.INCHES);

        assertEquals(new Length(24.0, LengthUnit.INCHES), result);
    }

    @Test
    void testRoundTripConversion_RefactoredDesign() {
        double original = 10.0;

        double converted = LengthUnit.FEET.convert(original, LengthUnit.YARDS);
        double back = LengthUnit.YARDS.convert(converted, LengthUnit.FEET);

        assertEquals(original, back, 0.01);
    }

    @Test
    void testEnumImmutability() {
        LengthUnit unit = LengthUnit.FEET;
        assertNotNull(unit);
    }
}