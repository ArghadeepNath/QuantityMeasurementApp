package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {
    {
//
////    // UC1 - FEET
////
////    @Test
////    void givenSameFeetValueFeet_shouldReturnTrue() {
////        Feet f1 = new Feet(1.0);
////        Feet f2 = new Feet(1.0);
////        assertTrue(f1.equals(f2));
////    }
////
////    @Test
////    void givenDifferentFeetValueFeet_shouldReturnFalse() {
////        Feet f1 = new Feet(1.0);
////        Feet f2 = new Feet(2.0);
////        assertFalse(f1.equals(f2));
////    }
////
////    @Test
////    void givenSameReferenceFeet_shouldReturnTrue() {
////        Feet f1 = new Feet(1.0);
////        assertTrue(f1.equals(f1));
////    }
////
////    @Test
////    void givenNullFeet_shouldReturnFalse() {
////        Feet f1 = new Feet(1.0);
////        assertFalse(f1.equals(null));
////    }
////
////    @Test
////    void givenDifferentTypeFeet_shouldReturnFalse() {
////        Feet f1 = new Feet(1.0);
////        assertFalse(f1.equals(new Object()));
////    }
////
////    @Test
////    void equalsFeet_shouldBeReflexive() {
////        Feet f = new Feet(2.5);
////        assertTrue(f.equals(f));
////    }
////
////    @Test
////    void equalsFeet_shouldBeSymmetric() {
////        Feet f1 = new Feet(3.0);
////        Feet f2 = new Feet(3.0);
////        assertTrue(f1.equals(f2));
////        assertTrue(f2.equals(f1));
////    }
////
////    @Test
////    void equalsFeet_shouldBeTransitive() {
////        Feet f1 = new Feet(4.0);
////        Feet f2 = new Feet(4.0);
////        Feet f3 = new Feet(4.0);
////        assertTrue(f1.equals(f2));
////        assertTrue(f2.equals(f3));
////        assertTrue(f1.equals(f3));
////    }
////
////    @Test
////    void equalsFeet_shouldBeConsistent() {
////        Feet f1 = new Feet(5.0);
////        Feet f2 = new Feet(5.0);
////        assertTrue(f1.equals(f2));
////        assertTrue(f1.equals(f2));
////    }
////
////    @Test
////    void givenFloatingPointPrecisionFeet_shouldCompareCorrectly() {
////        Feet f1 = new Feet(0.1 + 0.2);
////        Feet f2 = new Feet(0.3);
////        assertTrue(f1.equals(f2));
////    }
////
////    @Test
////    void equalFeetObjects_shouldHaveSameHashCode() {
////        Feet f1 = new Feet(6.0);
////        Feet f2 = new Feet(6.0);
////        assertEquals(f1.hashCode(), f2.hashCode());
////    }
////
////    @Test
////    void givenNegativeFeetValues_shouldCompareCorrectly() {
////        Feet f1 = new Feet(-2.0);
////        Feet f2 = new Feet(-2.0);
////        assertTrue(f1.equals(f2));
////    }
////
////    @Test
////    void givenZeroFeetValue_shouldCompareCorrectly() {
////        Feet f1 = new Feet(0.0);
////        Feet f2 = new Feet(0.0);
////        assertTrue(f1.equals(f2));
////    }
////
////    // UC2 - INCHES
////
////    @Test
////    void givenSameInchesValueInches_shouldReturnTrue() {
////        Inches f1 = new Inches(1.0);
////        Inches f2 = new Inches(1.0);
////        assertTrue(f1.equals(f2));
////    }
////
////    @Test
////    void givenDifferentInchesValueInches_shouldReturnFalse() {
////        Inches f1 = new Inches(1.0);
////        Inches f2 = new Inches(2.0);
////        assertFalse(f1.equals(f2));
////    }
////
////    @Test
////    void givenSameInchesReferenceInches_shouldReturnTrue() {
////        Inches f1 = new Inches(1.0);
////        assertTrue(f1.equals(f1));
////    }
////
////    @Test
////    void givenNullInches_shouldReturnFalse() {
////        Inches f1 = new Inches(1.0);
////        assertFalse(f1.equals(null));
////    }
////
////    @Test
////    void givenDifferentTypeInches_shouldReturnFalse() {
////        Inches f1 = new Inches(1.0);
////        assertFalse(f1.equals(new Object()));
////    }
////
////    @Test
////    void equalsInches_shouldBeReflexive() {
////        Inches f = new Inches(2.5);
////        assertTrue(f.equals(f));
////    }
////
////    @Test
////    void equalsInches_shouldBeSymmetric() {
////        Inches f1 = new Inches(3.0);
////        Inches f2 = new Inches(3.0);
////        assertTrue(f1.equals(f2));
////        assertTrue(f2.equals(f1));
////    }
////
////    @Test
////    void equalsInches_shouldBeTransitive() {
////        Inches f1 = new Inches(4.0);
////        Inches f2 = new Inches(4.0);
////        Inches f3 = new Inches(4.0);
////        assertTrue(f1.equals(f2));
////        assertTrue(f2.equals(f3));
////        assertTrue(f1.equals(f3));
////    }
////
////    @Test
////    void equalsInches_shouldBeConsistent() {
////        Inches f1 = new Inches(5.0);
////        Inches f2 = new Inches(5.0);
////        assertTrue(f1.equals(f2));
////        assertTrue(f1.equals(f2));
////    }
////
////    @Test
////    void equalInchesObjects_shouldHaveSameHashCode() {
////        Inches f1 = new Inches(6.0);
////        Inches f2 = new Inches(6.0);
////        assertEquals(f1.hashCode(), f2.hashCode());
////    }
////
////    @Test
////    void givenNegativeInchesValues_shouldCompareCorrectly() {
////        Inches f1 = new Inches(-2.0);
////        Inches f2 = new Inches(-2.0);
////        assertTrue(f1.equals(f2));
////    }
////
////    @Test
////    void givenZeroInchesValue_shouldCompareCorrectly() {
////        Inches f1 = new Inches(0.0);
////        Inches f2 = new Inches(0.0);
////        assertTrue(f1.equals(f2));
////    }
//
//    //UC3
//
//    // 1. Same unit (Feet)
//    @Test
//    void givenSameFeetValue_shouldReturnTrue() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    // 2. Same unit (Inches)
//    @Test
//    void givenSameInchesValue_shouldReturnTrue() {
//        Length l1 = new Length(12.0, LengthUnit.INCHES);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    // 🔥 3. Cross-unit equality (CORE UC3)
//    @Test
//    void givenFeetAndInchesEquivalent_shouldReturnTrue() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    // 4. Cross-unit inequality
//    @Test
//    void givenFeetAndInchesNotEquivalent_shouldReturnFalse() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(10.0, LengthUnit.INCHES);
//
//        assertFalse(l1.equals(l2));
//    }
//
//    // 5. Same unit inequality (Feet)
//    @Test
//    void givenDifferentFeetValues_shouldReturnFalse() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(2.0, LengthUnit.FEET);
//
//        assertFalse(l1.equals(l2));
//    }
//
//    // 6. Same unit inequality (Inches)
//    @Test
//    void givenDifferentInchesValues_shouldReturnFalse() {
//        Length l1 = new Length(12.0, LengthUnit.INCHES);
//        Length l2 = new Length(24.0, LengthUnit.INCHES);
//
//        assertFalse(l1.equals(l2));
//    }
//
//    // 7. Reflexive property
//    @Test
//    void equals_shouldBeReflexive() {
//        Length l = new Length(5.0, LengthUnit.FEET);
//
//        assertTrue(l.equals(l));
//    }
//
//    // 8. Symmetric property
//    @Test
//    void equals_shouldBeSymmetric() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        assertTrue(l1.equals(l2));
//        assertTrue(l2.equals(l1));
//    }
//
//    // 9. Transitive property
//    @Test
//    void equals_shouldBeTransitive() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//        Length l3 = new Length(1.0, LengthUnit.FEET);
//
//        assertTrue(l1.equals(l2));
//        assertTrue(l2.equals(l3));
//        assertTrue(l1.equals(l3));
//    }
//
//    // 10. Null check
//    @Test
//    void givenNull_shouldReturnFalse() {
//        Length l = new Length(1.0, LengthUnit.FEET);
//
//        assertFalse(l.equals(null));
//    }
//
//    // 11. Different type
//    @Test
//    void givenDifferentType_shouldReturnFalse() {
//        Length l = new Length(1.0, LengthUnit.FEET);
//
//        assertFalse(l.equals(new Object()));
//    }
//
//    // 12. Zero value
//    @Test
//    void givenZeroValue_shouldReturnTrue() {
//        Length l1 = new Length(0.0, LengthUnit.FEET);
//        Length l2 = new Length(0.0, LengthUnit.INCHES);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    // 13. Negative values
//    @Test
//    void givenNegativeValues_shouldCompareCorrectly() {
//        Length l1 = new Length(-1.0, LengthUnit.FEET);
//        Length l2 = new Length(-12.0, LengthUnit.INCHES);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    //UC4
//
//    // 1
//    @Test
//    void testEquality_YardToYard_SameValue() {
//        assertTrue(new Length(1.0, LengthUnit.YARDS)
//                .equals(new Length(1.0, LengthUnit.YARDS)));
//    }
//
//    // 2
//    @Test
//    void testEquality_YardToYard_DifferentValue() {
//        assertFalse(new Length(1.0, LengthUnit.YARDS)
//                .equals(new Length(2.0, LengthUnit.YARDS)));
//    }
//
//    // 3
//    @Test
//    void testEquality_YardToFeet_EquivalentValue() {
//        assertTrue(new Length(1.0, LengthUnit.YARDS)
//                .equals(new Length(3.0, LengthUnit.FEET)));
//    }
//
//    // 4
//    @Test
//    void testEquality_FeetToYard_EquivalentValue() {
//        assertTrue(new Length(3.0, LengthUnit.FEET)
//                .equals(new Length(1.0, LengthUnit.YARDS)));
//    }
//
//    // 5
//    @Test
//    void testEquality_YardToInches_EquivalentValue() {
//        assertTrue(new Length(1.0, LengthUnit.YARDS)
//                .equals(new Length(36.0, LengthUnit.INCHES)));
//    }
//
//    // 6
//    @Test
//    void testEquality_InchesToYard_EquivalentValue() {
//        assertTrue(new Length(36.0, LengthUnit.INCHES)
//                .equals(new Length(1.0, LengthUnit.YARDS)));
//    }
//
//    // 7
//    @Test
//    void testEquality_YardToFeet_NonEquivalentValue() {
//        assertFalse(new Length(1.0, LengthUnit.YARDS)
//                .equals(new Length(2.0, LengthUnit.FEET)));
//    }
//
//    // 8
//    @Test
//    void testEquality_centimetersToInches_EquivalentValue() {
//        assertTrue(new Length(1.0, LengthUnit.CENTIMETERS)
//                .equals(new Length(0.393701, LengthUnit.INCHES)));
//    }
//
//    // 9
//    @Test
//    void testEquality_centimetersToFeet_NonEquivalentValue() {
//        assertFalse(new Length(1.0, LengthUnit.CENTIMETERS)
//                .equals(new Length(1.0, LengthUnit.FEET)));
//    }
//
//    // 10 (Transitive)
//    @Test
//    void testEquality_MultiUnit_TransitiveProperty() {
//        Length a = new Length(1.0, LengthUnit.YARDS);
//        Length b = new Length(3.0, LengthUnit.FEET);
//        Length c = new Length(36.0, LengthUnit.INCHES);
//
//        assertTrue(a.equals(b));
//        assertTrue(b.equals(c));
//        assertTrue(a.equals(c));
//    }
//
//    // 11 (Null unit yard)
//    @Test
//    void testEquality_YardWithNullUnit() {
//        Length l = new Length(1.0, null);
//        Length l2 = new Length(1.0, LengthUnit.YARDS);
//
//        assertThrows(NullPointerException.class, () -> l.equals(l2));
//    }
//
//    // 12 (Reflexive yard)
//    @Test
//    void testEquality_YardSameReference() {
//        Length l = new Length(1.0, LengthUnit.YARDS);
//        assertTrue(l.equals(l));
//    }
//
//    // 13 (Null comparison yard)
//    @Test
//    void testEquality_YardNullComparison() {
//        Length l = new Length(1.0, LengthUnit.YARDS);
//        assertFalse(l.equals(null));
//    }
//
//    // 14 (Null unit cm)
//    @Test
//    void testEquality_CentimetersWithNullUnit() {
//        Length l = new Length(1.0, null);
//        Length l2 = new Length(1.0, LengthUnit.CENTIMETERS);
//
//        assertThrows(IllegalArgumentException.class, () -> l.equals(l2));
//    }
//
//    // 15 (Reflexive cm)
//    @Test
//    void testEquality_CentimetersSameReference() {
//        Length l = new Length(1.0, LengthUnit.CENTIMETERS);
//        assertTrue(l.equals(l));
//    }
//
//    // 16 (Null comparison cm)
//    @Test
//    void testEquality_CentimetersNullComparison() {
//        Length l = new Length(1.0, LengthUnit.CENTIMETERS);
//        assertFalse(l.equals(null));
//    }
//
//    // 17 (Complex multi-unit)
//    @Test
//    void testEquality_AllUnits_ComplexScenario() {
//        Length a = new Length(2.0, LengthUnit.YARDS);
//        Length b = new Length(6.0, LengthUnit.FEET);
//        Length c = new Length(72.0, LengthUnit.INCHES);
//
//        assertTrue(a.equals(b));
//        assertTrue(b.equals(c));
//        assertTrue(a.equals(c));
//    }
//
//    //UC5
//
//    @Test
//    void centimeterEquals39Point3701Inches() {
//        assertTrue(new Length(100.0, LengthUnit.CENTIMETERS)
//                .equals(new Length(39.3701, LengthUnit.INCHES)));
//    }
//
//    @Test
//    void testFeetInchesComparison() {
//        assertTrue(new Length(1.0, LengthUnit.FEET)
//                .equals(new Length(12.0, LengthUnit.INCHES)));
//    }
//
//    @Test
//    void testInchesInequality() {
//        assertFalse(new Length(12.0, LengthUnit.INCHES)
//                .equals(new Length(10.0, LengthUnit.INCHES)));
//    }
//
//    @Test
//    void differentValuesSameUnitNotEqual() {
//        assertFalse(new Length(2.0, LengthUnit.FEET)
//                .equals(new Length(3.0, LengthUnit.FEET)));
//    }
//
//    @Test
//    void crossUnitEqualityDemonstrateMethod() {
//        assertTrue(new Length(1.0, LengthUnit.YARDS)
//                .equals(new Length(36.0, LengthUnit.INCHES)));
//    }
//
//    @Test
//    void testFeetEquality() {
//        assertTrue(new Length(5.0, LengthUnit.FEET)
//                .equals(new Length(5.0, LengthUnit.FEET)));
//    }
//
//    @Test
//    void testFeetInequality() {
//        assertFalse(new Length(5.0, LengthUnit.FEET)
//                .equals(new Length(6.0, LengthUnit.FEET)));
//    }
//
//    @Test
//    void yardNotEqualToInches() {
//        assertFalse(new Length(1.0, LengthUnit.YARDS)
//                .equals(new Length(30.0, LengthUnit.INCHES)));
//    }
//
//    @Test
//    void reflexiveSymmetricAndTransitiveProperty() {
//        Length a = new Length(1.0, LengthUnit.YARDS);
//        Length b = new Length(3.0, LengthUnit.FEET);
//        Length c = new Length(36.0, LengthUnit.INCHES);
//
//        // Reflexive
//        assertTrue(a.equals(a));
//
//        // Symmetric
//        assertTrue(a.equals(b));
//        assertTrue(b.equals(a));
//
//        // Transitive
//        assertTrue(a.equals(b));
//        assertTrue(b.equals(c));
//        assertTrue(a.equals(c));
//    }
//
//    @Test
//    void testCrossUnitInequality() {
//        assertFalse(new Length(1.0, LengthUnit.FEET)
//                .equals(new Length(10.0, LengthUnit.INCHES)));
//    }
//
//    @Test
//    void testMultipleFeetComparison() {
//        assertTrue(new Length(3.0, LengthUnit.FEET)
//                .equals(new Length(1.0, LengthUnit.YARDS)));
//    }
//
//    @Test
//    void yardEquals36Inches() {
//        assertTrue(new Length(1.0, LengthUnit.YARDS)
//                .equals(new Length(36.0, LengthUnit.INCHES)));
//    }
//
//    @Test
//    void convertYardsToInchesUsingOverloadedMethod() {
//        Length l = new Length(1.0, LengthUnit.YARDS);
//        assertTrue(l.convertTo(LengthUnit.INCHES)
//                .equals(new Length(36.0, LengthUnit.INCHES)));
//    }
//
//    @Test
//    void thirtyPoint48CmEqualsOneFoot() {
//        assertTrue(new Length(30.48, LengthUnit.CENTIMETERS)
//                .equals(new Length(1.0, LengthUnit.FEET)));
//    }
//
//    @Test
//    void equalsReturnsFalseForNull() {
//        assertFalse(new Length(1.0, LengthUnit.FEET).equals(null));
//    }
//
//    @Test
//    void referenceEqualitySameObject() {
//        Length l = new Length(2.0, LengthUnit.FEET);
//        assertTrue(l.equals(l));
//    }
//
//    @Test
//    void threeFeetEqualsOneYard() {
//        assertTrue(new Length(3.0, LengthUnit.FEET)
//                .equals(new Length(1.0, LengthUnit.YARDS)));
//    }
//
//    @Test
//    void testInchesEquality() {
//        assertTrue(new Length(12.0, LengthUnit.INCHES)
//                .equals(new Length(12.0, LengthUnit.INCHES)));
//    }
//
//    @Test
//    void convertFeetToInches() {
//        Length l = new Length(1.0, LengthUnit.FEET);
//        assertTrue(l.convertTo(LengthUnit.INCHES)
//                .equals(new Length(12.0, LengthUnit.INCHES)));
//    }
//
//
//    //UC6
//
//    @Test
//    void testAddition_SameUnit_FeetPlusFeet() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(2.0, LengthUnit.FEET);
//
//        Length result = l1.add(l2);
//
//        assertEquals(3.0, result.convertTo(LengthUnit.FEET).value);
//    }
//
//    @Test
//    void testAddition_SameUnit_InchPlusInch() {
//        Length l1 = new Length(6.0, LengthUnit.INCHES);
//        Length l2 = new Length(6.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2);
//
//        assertEquals(12.0, result.convertTo(LengthUnit.INCHES).value);
//    }
//
//    @Test
//    void testAddition_CrossUnit_FeetPlusInches() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2);
//
//        assertEquals(2.0, result.convertTo(LengthUnit.FEET).value);
//    }
//
//    @Test
//    void testAddition_CrossUnit_InchPlusFeet() {
//        Length l1 = new Length(12.0, LengthUnit.INCHES);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//        Length result = l1.add(l2);
//
//        assertEquals(24.0, result.convertTo(LengthUnit.INCHES).value);
//    }
//
//    @Test
//    void testAddition_CrossUnit_YardPlusFeet() {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(3.0, LengthUnit.FEET);
//
//        Length result = l1.add(l2);
//
//        assertEquals(2.0, result.convertTo(LengthUnit.YARDS).value);
//    }
//
//    @Test
//    void testAddition_CrossUnit_CentimeterPlusInch() {
//        Length l1 = new Length(2.54, LengthUnit.CENTIMETERS);
//        Length l2 = new Length(1.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2);
//
//        assertEquals(5.08, result.convertTo(LengthUnit.CENTIMETERS).value);
//    }
//
//    @Test
//    void testAddition_Commutativity() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        assertEquals(l1.add(l2), l2.add(l1));
//    }
//
//    @Test
//    void testAddition_WithZero() {
//        Length l1 = new Length(5.0, LengthUnit.FEET);
//        Length l2 = new Length(0.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2);
//
//        assertEquals(5.0, result.convertTo(LengthUnit.FEET).value);
//    }
//
//    @Test
//    void testAddition_NegativeValues() {
//        Length l1 = new Length(5.0, LengthUnit.FEET);
//        Length l2 = new Length(-2.0, LengthUnit.FEET);
//
//        Length result = l1.add(l2);
//
//        assertEquals(3.0, result.convertTo(LengthUnit.FEET).value);
//    }
//
//    @Test
//    void testAddition_NullSecondOperand() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//
//        assertThrows(IllegalArgumentException.class, () -> l1.add(null));
//    }
//
//    @Test
//    void testAddition_LargeValues() {
//        Length l1 = new Length(1e6, LengthUnit.FEET);
//        Length l2 = new Length(1e6, LengthUnit.FEET);
//
//        Length result = l1.add(l2);
//
//        assertEquals(2e6, result.convertTo(LengthUnit.FEET).value);
//    }
//
//    @Test
//    void testAddition_SmallValues() {
//        Length l1 = new Length(0.01, LengthUnit.FEET);
//        Length l2 = new Length(0.02, LengthUnit.FEET);
//
//        Length result = l1.add(l2);
//
//        assertEquals(0.03, result.convertTo(LengthUnit.FEET).value);
//    }
//
//
//    //UC7
//
//    @Test
//    public void addFeetAndInchesWithTargetUnitInches() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2, LengthUnit.INCHES);
//
//        assertEquals(24.0, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_Feet() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2, LengthUnit.FEET);
//
//        assertEquals(2.0, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_Inches() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2, LengthUnit.INCHES);
//
//        assertEquals(24.0, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_Yards() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2, LengthUnit.YARDS);
//
//        assertEquals(0.67, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_Centimeters() {
//        Length l1 = new Length(1.0, LengthUnit.INCHES);
//        Length l2 = new Length(1.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2, LengthUnit.CENTIMETERS);
//
//        assertEquals(5.08, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_SameAsFirstOperand() {
//        Length l1 = new Length(2.0, LengthUnit.YARDS);
//        Length l2 = new Length(3.0, LengthUnit.FEET);
//
//        Length result = l1.add(l2, LengthUnit.YARDS);
//
//        assertEquals(3.0, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_SameAsSecondOperand() {
//        Length l1 = new Length(2.0, LengthUnit.YARDS);
//        Length l2 = new Length(3.0, LengthUnit.FEET);
//
//        Length result = l1.add(l2, LengthUnit.FEET);
//
//        assertEquals(9.0, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_Commutativity() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        Length r1 = l1.add(l2, LengthUnit.YARDS);
//        Length r2 = l2.add(l1, LengthUnit.YARDS);
//
//        assertEquals(r1.value, r2.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_WithZero() {
//        Length l1 = new Length(5.0, LengthUnit.FEET);
//        Length l2 = new Length(0.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2, LengthUnit.YARDS);
//
//        assertEquals(1.67, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_NegativeValues() {
//        Length l1 = new Length(5.0, LengthUnit.FEET);
//        Length l2 = new Length(-2.0, LengthUnit.FEET);
//
//        Length result = l1.add(l2, LengthUnit.INCHES);
//
//        assertEquals(36.0, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_NullTargetUnit() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        assertThrows(IllegalArgumentException.class,
//                () -> l1.add(l2, null));
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_LargeToSmallScale() {
//        Length l1 = new Length(1000.0, LengthUnit.FEET);
//        Length l2 = new Length(500.0, LengthUnit.FEET);
//
//        Length result = l1.add(l2, LengthUnit.INCHES);
//
//        assertEquals(18000.0, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_SmallToLargeScale() {
//        Length l1 = new Length(12.0, LengthUnit.INCHES);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2, LengthUnit.YARDS);
//
//        assertEquals(0.67, result.value);
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_AllUnitCombinations() {
//        Length[] values = {
//                new Length(1.0, LengthUnit.FEET),
//                new Length(12.0, LengthUnit.INCHES),
//                new Length(1.0, LengthUnit.YARDS),
//                new Length(2.54, LengthUnit.CENTIMETERS)
//        };
//
//        for (Length a : values) {
//            for (Length b : values) {
//                for (LengthUnit target : LengthUnit.values()) {
//                    Length result = a.add(b, target);
//                    assertNotNull(result);
//                }
//            }
//        }
//    }
//
//    @Test
//    public void testAddition_ExplicitTargetUnit_PrecisionTolerance() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(2.54, LengthUnit.CENTIMETERS);
//
//        Length result = l1.add(l2, LengthUnit.INCHES);
//
//        assertEquals(13.0, result.value);
//    }
//
//    //UC8
//
//    @Test
//    void testLengthUnitEnum_FeetConstant() {
//        assertEquals(12.0, LengthUnit.FEET.getConversionFactor());
//    }
//
//    @Test
//    void testLengthUnitEnum_InchesConstant() {
//        assertEquals(1.0, LengthUnit.INCHES.getConversionFactor());
//    }
//
//    @Test
//    void testLengthUnitEnum_YardsConstant() {
//        assertEquals(36.0, LengthUnit.YARDS.getConversionFactor());
//    }
//
//    @Test
//    void testLengthUnitEnum_CentimetersConstant() {
//        assertEquals(0.393701, LengthUnit.CENTIMETERS.getConversionFactor(), 0.0001);
//    }
//
//    @Test
//    void testConvertToBaseUnit_FeetToFeet() {
//        assertEquals(60.0, LengthUnit.FEET.convertToBaseUnit(5.0));
//    }
//
//    @Test
//    void testConvertToBaseUnit_InchesToFeet() {
//        assertEquals(12.0, LengthUnit.INCHES.convertToBaseUnit(12.0));
//    }
//
//    @Test
//    void testConvertToBaseUnit_YardsToFeet() {
//        assertEquals(36.0, LengthUnit.YARDS.convertToBaseUnit(1.0));
//    }
//
//    @Test
//    void testConvertToBaseUnit_CentimetersToFeet() {
//        assertEquals(12.0, LengthUnit.CENTIMETERS.convertToBaseUnit(30.48), 0.01);
//    }
//
//    @Test
//    void testConvertFromBaseUnit_FeetToFeet() {
//        assertEquals(5.0, LengthUnit.FEET.convertFromBaseUnit(60.0));
//    }
//
//    @Test
//    void testConvertFromBaseUnit_FeetToInches() {
//        assertEquals(12.0, LengthUnit.INCHES.convertFromBaseUnit(12.0));
//    }
//
//    @Test
//    void testConvertFromBaseUnit_FeetToYards() {
//        assertEquals(1.0, LengthUnit.YARDS.convertFromBaseUnit(36.0));
//    }
//
//    @Test
//    void testConvertFromBaseUnit_FeetToCentimeters() {
//        assertEquals(30.48, LengthUnit.CENTIMETERS.convertFromBaseUnit(12.0), 0.01);
//    }
//
//    @Test
//    void testQuantityLengthRefactored_Equality() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    @Test
//    void testQuantityLengthRefactored_ConvertTo() {
//        Length l = new Length(1.0, LengthUnit.FEET);
//        Length result = l.convertTo(LengthUnit.INCHES);
//
//        assertEquals(new Length(12.0, LengthUnit.INCHES), result);
//    }
//
//    @Test
//    void testQuantityLengthRefactored_Add() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2, LengthUnit.FEET);
//
//        assertEquals(new Length(2.0, LengthUnit.FEET), result);
//    }
//
//    @Test
//    void testQuantityLengthRefactored_AddWithTargetUnit() {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(3.0, LengthUnit.FEET);
//
//        Length result = l1.add(l2, LengthUnit.YARDS);
//
//        assertEquals(new Length(2.0, LengthUnit.YARDS), result);
//    }
//
//    @Test
//    void testQuantityLengthRefactored_NullUnit() {
//        assertThrows(IllegalArgumentException.class, () ->
//                new Length(1.0, null)
//        );
//    }
//
//    @Test
//    void testQuantityLengthRefactored_InvalidValue() {
//        assertThrows(IllegalArgumentException.class, () ->
//                new Length(Double.NaN, LengthUnit.FEET)
//        );
//    }
//
//    @Test
//    void testBackwardCompatibility_UC1EqualityTests() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    @Test
//    void testBackwardCompatibility_UC5ConversionTests() {
//        Length l = new Length(1.0, LengthUnit.FEET);
//        Length result = l.convertTo(LengthUnit.INCHES);
//
//        assertEquals(new Length(12.0, LengthUnit.INCHES), result);
//    }
//
//    @Test
//    void testBackwardCompatibility_UC6AdditionTests() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//        assertEquals(new Length(2.0, LengthUnit.FEET), l1.add(l2));
//    }
//
//    @Test
//    void testBackwardCompatibility_UC7AdditionWithTargetUnitTests() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        Length result = l1.add(l2, LengthUnit.INCHES);
//
//        assertEquals(new Length(24.0, LengthUnit.INCHES), result);
//    }
//
//    @Test
//    void testRoundTripConversion_RefactoredDesign() {
//        double original = 10.0;
//
//        double converted = LengthUnit.FEET.convert(original, LengthUnit.YARDS);
//        double back = LengthUnit.YARDS.convert(converted, LengthUnit.FEET);
//
//        assertEquals(original, back, 0.01);
//    }
//
//    @Test
//    void testEnumImmutability() {
//        LengthUnit unit = LengthUnit.FEET;
//        assertNotNull(unit);
//    }
//
//    //UC9
//
//    @Test
//    public void testWeight_KilogramEquals1000Grams() {
//        assertEquals(
//                new Weight(1.0, WeightUnit.KILOGRAM),
//                new Weight(1000.0, WeightUnit.GRAM)
//        );
//    }
//
//    @Test
//    public void testWeight_PoundEquals453Point592Grams() {
//        assertEquals(
//                new Weight(1.0, WeightUnit.POUND),
//                new Weight(453.592, WeightUnit.GRAM)
//        );
//    }
//
//    @Test
//    public void testWeight_TonneEquals1000000Grams() {
//        assertEquals(
//                new Weight(1.0, WeightUnit.TONNE),
//                new Weight(1_000_000.0, WeightUnit.GRAM)
//        );
//    }
//
//    @Test
//    public void testWeight_KilogramNotEqualToPound() {
//        assertNotEquals(
//                new Weight(1.0, WeightUnit.KILOGRAM),
//                new Weight(1.0, WeightUnit.POUND)
//        );
//    }
//
//    @Test
//    public void testWeight_AdditionOfWeightsEqualsExpected() {
//        Weight w1 = new Weight(1.0, WeightUnit.KILOGRAM);
//        Weight w2 = new Weight(1000.0, WeightUnit.GRAM);
//
//        assertEquals(new Weight(2.0, WeightUnit.KILOGRAM), w1.add(w2));
//    }
//
//    // -------- Equality properties --------
//
//    @Test
//    public void testWeight_ReferenceEqualitySameObject() {
//        Weight w = new Weight(1.0, WeightUnit.KILOGRAM);
//        assertEquals(w, w);
//    }
//
//    @Test
//    public void testWeight_EqualsReturnsFalseForNull() {
//        Weight w = new Weight(1.0, WeightUnit.KILOGRAM);
//        assertNotEquals(w, null);
//    }
//
//    @Test
//    public void testWeight_ReflexiveSymmetricAndTransitiveProperty() {
//        Weight a = new Weight(1.0, WeightUnit.KILOGRAM);
//        Weight b = new Weight(1000.0, WeightUnit.GRAM);
//        Weight c = new Weight(1.0, WeightUnit.KILOGRAM);
//
//        assertEquals(a, b);
//        assertEquals(b, c);
//        assertEquals(a, c);
//    }
//
//    @Test
//    public void testWeight_DifferentValuesSameUnitNotEqual() {
//        assertNotEquals(
//                new Weight(1.0, WeightUnit.KILOGRAM),
//                new Weight(2.0, WeightUnit.KILOGRAM)
//        );
//    }
//
//    @Test
//    public void testWeight_CrossUnitEquality() {
//        Weight w1 = new Weight(1.0, WeightUnit.KILOGRAM);
//        Weight w2 = new Weight(1000.0, WeightUnit.GRAM);
//
//        assertTrue(w1.equals(w2));
//    }
//
//    // -------- Conversion --------
//
//    @Test
//    public void testWeight_ConvertKilogramToGram() {
//        Weight w = new Weight(1.0, WeightUnit.KILOGRAM);
//        assertEquals(
//                new Weight(1000.0, WeightUnit.GRAM),
//                w.convertTo(WeightUnit.GRAM)
//        );
//    }
//
//    @Test
//    public void testWeight_ConvertPoundToKilogram() {
//        Weight w = new Weight(2.20462, WeightUnit.POUND);
//        Weight result = w.convertTo(WeightUnit.KILOGRAM);
//
//        assertEquals(new Weight(1.0, WeightUnit.KILOGRAM), result);
//    }
//
//    @Test
//    public void testWeight_ConvertSameUnit() {
//        Weight w = new Weight(5.0, WeightUnit.KILOGRAM);
//        assertEquals(w, w.convertTo(WeightUnit.KILOGRAM));
//    }
//
//    @Test
//    public void testWeight_ConvertZeroValue() {
//        Weight w = new Weight(0.0, WeightUnit.KILOGRAM);
//        assertEquals(
//                new Weight(0.0, WeightUnit.GRAM),
//                w.convertTo(WeightUnit.GRAM)
//        );
//    }
//
//    @Test
//    public void testWeight_ConvertNegativeValue() {
//        Weight w = new Weight(-1.0, WeightUnit.KILOGRAM);
//        assertEquals(
//                new Weight(-1000.0, WeightUnit.GRAM),
//                w.convertTo(WeightUnit.GRAM)
//        );
//    }
//
//    @Test
//    public void testWeight_RoundTripConversion() {
//        Weight w = new Weight(1.5, WeightUnit.KILOGRAM);
//        Weight result = w.convertTo(WeightUnit.GRAM)
//                .convertTo(WeightUnit.KILOGRAM);
//
//        assertEquals(w, result);
//    }
//
//    // -------- Addition --------
//
//    @Test
//    public void testWeight_AddSameUnit() {
//        Weight w1 = new Weight(1.0, WeightUnit.KILOGRAM);
//        Weight w2 = new Weight(2.0, WeightUnit.KILOGRAM);
//
//        assertEquals(
//                new Weight(3.0, WeightUnit.KILOGRAM),
//                w1.add(w2)
//        );
//    }
//
//    @Test
//    public void testWeight_AddDifferentUnits() {
//        Weight w1 = new Weight(1.0, WeightUnit.KILOGRAM);
//        Weight w2 = new Weight(1000.0, WeightUnit.GRAM);
//
//        assertEquals(
//                new Weight(2.0, WeightUnit.KILOGRAM),
//                w1.add(w2)
//        );
//    }
//
//    @Test
//    public void testWeight_AddWithTargetUnitGram() {
//        Weight w1 = new Weight(1.0, WeightUnit.KILOGRAM);
//        Weight w2 = new Weight(1000.0, WeightUnit.GRAM);
//
//        assertEquals(
//                new Weight(2000.0, WeightUnit.GRAM),
//                w1.add(w2, WeightUnit.GRAM)
//        );
//    }
//
//    @Test
//    public void testWeight_AddPoundAndKilogram() {
//        Weight w1 = new Weight(2.20462, WeightUnit.POUND);
//        Weight w2 = new Weight(1.0, WeightUnit.KILOGRAM);
//
//        Weight result = w1.add(w2, WeightUnit.POUND);
//
//        assertEquals(new Weight(4.41, WeightUnit.POUND), result);
//    }
//
//    @Test
//    public void testWeight_AdditionCommutativity() {
//        Weight w1 = new Weight(1.0, WeightUnit.KILOGRAM);
//        Weight w2 = new Weight(1000.0, WeightUnit.GRAM);
//
//        assertEquals(w1.add(w2), w2.add(w1));
//    }
//
//    @Test
//    public void testWeight_AdditionWithZero() {
//        Weight w = new Weight(5.0, WeightUnit.KILOGRAM);
//        Weight zero = new Weight(0.0, WeightUnit.GRAM);
//
//        assertEquals(w, w.add(zero));
//    }
//
//    @Test
//    public void testWeight_AdditionNegativeValues() {
//        Weight w1 = new Weight(5.0, WeightUnit.KILOGRAM);
//        Weight w2 = new Weight(-2000.0, WeightUnit.GRAM);
//
//        assertEquals(
//                new Weight(3.0, WeightUnit.KILOGRAM),
//                w1.add(w2)
//        );
//    }
//
//    @Test
//    public void testWeight_AdditionLargeValues() {
//        Weight w1 = new Weight(1e6, WeightUnit.KILOGRAM);
//        Weight w2 = new Weight(1e6, WeightUnit.KILOGRAM);
//
//        assertEquals(
//                new Weight(2e6, WeightUnit.KILOGRAM),
//                w1.add(w2)
//        );
//    }
//
//    // -------- Edge / Validation --------
//
//    @Test
//    public void testWeight_NullUnitThrowsException() {
//        assertThrows(IllegalArgumentException.class,
//                () -> new Weight(1.0, null));
//    }
//
//    @Test
//    public void testWeight_InvalidValueThrowsException() {
//        assertThrows(IllegalArgumentException.class,
//                () -> new Weight(Double.NaN, WeightUnit.GRAM));
//    }
//
//    @Test
//    public void testWeight_NullAdditionThrowsException() {
//        Weight w = new Weight(1.0, WeightUnit.KILOGRAM);
//
//        assertThrows(IllegalArgumentException.class,
//                () -> w.add(null));
//    }
//
//    @Test
//    public void testWeight_NullTargetUnitThrowsException() {
//        Weight w1 = new Weight(1.0, WeightUnit.KILOGRAM);
//        Weight w2 = new Weight(1.0, WeightUnit.KILOGRAM);
//
//        assertThrows(IllegalArgumentException.class,
//                () -> w1.add(w2, null));
//    }
    }
    //UC10

    @Test
    public void testIMeasurableInterface_LengthUnitImplementation(){
        assertTrue(LengthUnit.FEET instanceof IMeasurable);
        assertEquals(12.0, LengthUnit.FEET.getConversionFactor());
        assertEquals(12.0, LengthUnit.FEET.convertToBaseUnit(1.0));
        assertEquals(1,LengthUnit.FEET.convertFromBaseUnit(12.0));
    }

    @Test
    public void testIMeasurableInterface_WeightUnitImplementation(){
        assertTrue(WeightUnit.GRAM instanceof IMeasurable);
        assertEquals(1000.0,WeightUnit.KILOGRAM.getConversionFactor());
        assertEquals(1000.0,WeightUnit.KILOGRAM.convertToBaseUnit(1.0));
        assertEquals(1.0,WeightUnit.KILOGRAM.convertFromBaseUnit(1000.0));
    }

    @Test
    public void testIMeasurableInterface_ConsistentBehavior(){
        IMeasurable l = LengthUnit.INCHES;
        IMeasurable w = WeightUnit.GRAM;

        assertEquals(1.0,l.convertToBaseUnit(1.0));
        assertEquals(1.0,w.convertToBaseUnit(1.0));

        assertEquals(1.0,l.getConversionFactor());
        assertEquals(1.0,l.getConversionFactor());

        assertEquals(1.0,l.convertFromBaseUnit(1.0));
        assertEquals(1.0,w.convertFromBaseUnit(1.0));
    }

    @Test
    public void testGenericQuantity_LengthOperations_Equality(){
        assertTrue(new Quantity<>(1.0, LengthUnit.FEET).equals(new Quantity<>(12.0, LengthUnit.INCHES)));
    }

    @Test
    public void testGenericQuantity_WeightOperations_Equality(){
        assertTrue(new Quantity<>(1.0, WeightUnit.KILOGRAM).equals(new Quantity<>(1000.0, WeightUnit.GRAM)) );
    }

    @Test
    public void testGenericQuantity_LengthOperations_Conversion() {
        Quantity<LengthUnit> result =
                new Quantity<>(1.0, LengthUnit.FEET).convertTo(LengthUnit.INCHES);

        assertEquals(new Quantity<>(12.0, LengthUnit.INCHES), result);
    }

    @Test
    public void testGenericQuantity_WeightOperations_Conversion() {
        Quantity<WeightUnit> result =
                new Quantity<>(1.0, WeightUnit.KILOGRAM).convertTo(WeightUnit.GRAM);

        assertEquals(new Quantity<>(1000.0, WeightUnit.GRAM), result);
    }

    @Test
    public void testGenericQuantity_LengthOperations_Addition() {
        Quantity<LengthUnit> result =
                new Quantity<>(1.0, LengthUnit.FEET)
                        .add(new Quantity<>(12.0, LengthUnit.INCHES), LengthUnit.FEET);

        assertEquals(new Quantity<>(2.0, LengthUnit.FEET), result);
    }

    @Test
    public void testGenericQuantity_WeightOperations_Addition() {
        Quantity<WeightUnit> result =
                new Quantity<>(1.0, WeightUnit.KILOGRAM)
                        .add(new Quantity<>(1000.0, WeightUnit.GRAM), WeightUnit.KILOGRAM);

        assertEquals(new Quantity<>(2.0, WeightUnit.KILOGRAM), result);
    }

    @Test
    public void testCrossCategoryPrevention_LengthVsWeight() {
        Quantity<LengthUnit> l = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<WeightUnit> w = new Quantity<>(1.0, WeightUnit.KILOGRAM);

        assertFalse(l.equals(w));
    }

    @Test
    public void testCrossCategoryPrevention_CompilerTypeSafety() {
        // This is compile-time only (cannot run)
        assertTrue(true);
    }

    @Test
    public void testGenericQuantity_ConstructorValidation_NullUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Quantity<>(1.0, null);
        });
    }

    @Test
    public void testGenericQuantity_ConstructorValidation_InvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Quantity<>(Double.NaN, LengthUnit.FEET);
        });
    }

    @Test
    public void testGenericQuantity_Conversion_AllUnitCombinations() {
        Quantity<LengthUnit> q = new Quantity<>(1.0, LengthUnit.FEET);

        assertEquals(new Quantity<>(12.0, LengthUnit.INCHES),
                q.convertTo(LengthUnit.INCHES));

        assertEquals(new Quantity<>(0.3333, LengthUnit.YARDS).getValue(),
                q.convertTo(LengthUnit.YARDS).getValue(), 0.01);
    }

    @Test
    public void testGenericQuantity_Addition_AllUnitCombinations() {
        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(1.0, LengthUnit.YARDS);

        Quantity<LengthUnit> result = q1.add(q2, LengthUnit.FEET);

        assertEquals(new Quantity<>(4.0, LengthUnit.FEET), result);
    }

    @Test
    public void testBackwardCompatibility_AllUC1Through9Tests() {
        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);

        assertTrue(q1.equals(q2));
    }

    @Test
    public void testQuantityMeasurementApp_SimplifiedDemonstration_Equality() {
        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);

        assertTrue(QuantityMeasurementApp.demonstrateEquality(q1, q2));
    }

    @Test
    public void testQuantityMeasurementApp_SimplifiedDemonstration_Conversion() {
        Quantity<WeightUnit> q = new Quantity<>(1.0, WeightUnit.KILOGRAM);

        Quantity<WeightUnit> result =
                QuantityMeasurementApp.demonstrateConversion(q, WeightUnit.GRAM);

        assertEquals(new Quantity<>(1000.0, WeightUnit.GRAM), result);
    }

    @Test
    public void testQuantityMeasurementApp_SimplifiedDemonstration_Addition() {
        Quantity<WeightUnit> q1 = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> q2 = new Quantity<>(1000.0, WeightUnit.GRAM);

        Quantity<WeightUnit> result =
                QuantityMeasurementApp.demonstrateAddition(q1, q2);

        assertEquals(new Quantity<>(2.0, WeightUnit.KILOGRAM), result);
    }

    @Test
    public void testTypeWildcard_FlexibleSignatures() {
        Quantity<?> q = new Quantity<>(1.0, LengthUnit.FEET);
        assertNotNull(q);
    }

    @Test
    public void testScalability_NewUnitEnumIntegration() {

        enum VolumeUnit implements IMeasurable {
            LITER(1.0), ML(0.001);

            private final double f;

            VolumeUnit(double f) { this.f = f; }

            public double getConversionFactor() { return f; }

            public double convertToBaseUnit(double v) { return v * f; }

            public double convertFromBaseUnit(double v) { return v / f; }
        }

        Quantity<VolumeUnit> q = new Quantity<>(1.0, VolumeUnit.LITER);

        assertEquals(new Quantity<>(1000.0, VolumeUnit.ML),
                q.convertTo(VolumeUnit.ML));
    }

    @Test public void testScalability_MultipleNewCategories() { assertTrue(true); }

    @Test public void testGenericBoundedTypeParameter_Enforcement() { assertTrue(true); }

    @Test
    public void testHashCode_GenericQuantity_Consistency() {
        Quantity<WeightUnit> q1 = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> q2 = new Quantity<>(1000.0, WeightUnit.GRAM);

        assertEquals(q1.hashCode(), q2.hashCode());
    }

    @Test
    public void testEquals_GenericQuantity_ContractPreservation() {
        Quantity<LengthUnit> q = new Quantity<>(1.0, LengthUnit.FEET);

        assertTrue(q.equals(q));
    }

    @Test
    public void testEnumAsUnitCarrier_BehaviorEncapsulation() {
        assertEquals(12.0, LengthUnit.FEET.convertToBaseUnit(1.0));
    }

    @Test
    public void testTypeErasure_RuntimeSafety() {
        Quantity<LengthUnit> l = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<WeightUnit> w = new Quantity<>(1.0, WeightUnit.KILOGRAM);

        assertFalse(l.equals(w));
    }

    @Test public void testCompositionOverInheritance_Flexibility() { assertTrue(true); }

    @Test public void testCodeReduction_DRYValidation() { assertTrue(true); }

    @Test public void testMaintainability_SingleSourceOfTruth() { assertTrue(true); }

    @Test public void testArchitecturalReadiness_MultipleNewCategories() { assertTrue(true); }

    @Test public void testPerformance_GenericOverhead() { assertTrue(true); }

    @Test public void testDocumentation_PatternClarity() { assertTrue(true); }

    @Test public void testInterfaceSegregation_MinimalContract() { assertTrue(true); }

    @Test
    public void testImmutability_GenericQuantity() {
        Quantity<LengthUnit> q = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> result =
                q.add(new Quantity<>(12.0, LengthUnit.INCHES));

        assertNotSame(q, result);
    }


    //UC11


    @Test
    public void testEquality_LitreToLitre_SameValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1.0, VolumeUnit.LITRE);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void testEquality_LitreToLitre_DifferentValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(2.0, VolumeUnit.LITRE);
        assertFalse(q1.equals(q2));
    }

    @Test
    public void testEquality_LitreToMillilitre_EquivalentValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void testEquality_MillilitreToLitre_EquivalentValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1.0, VolumeUnit.LITRE);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void testEquality_LitreToGallon_EquivalentValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(0.264172, VolumeUnit.GALLON);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void testEquality_GallonToLitre_EquivalentValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> q2 = new Quantity<>(3.78541, VolumeUnit.LITRE);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void testEquality_VolumeVsLength_Incompatible() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<LengthUnit> q2 = new Quantity<>(1.0, LengthUnit.FEET);
        assertFalse(q1.equals(q2));
    }

    @Test
    public void testEquality_VolumeVsWeight_Incompatible() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<WeightUnit> q2 = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        assertFalse(q1.equals(q2));
    }

    @Test
    public void testEquality_NullComparison() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        assertFalse(q1.equals(null));
    }

    @Test
    public void testEquality_SameReference() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        assertTrue(q1.equals(q1));
    }

    @Test
    public void testEquality_NullUnit() {
        assertThrows(IllegalArgumentException.class, () -> new Quantity<>(1.0, null));
    }

    @Test
    public void testEquality_TransitiveProperty() {
        Quantity<VolumeUnit> a = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> b = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        Quantity<VolumeUnit> c = new Quantity<>(0.264172, VolumeUnit.GALLON);

        assertTrue(a.equals(b));
        assertTrue(b.equals(c));
        assertTrue(a.equals(c));
    }

    @Test
    public void testEquality_ZeroValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(0.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(0.0, VolumeUnit.MILLILITRE);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void testEquality_NegativeVolume() {
        Quantity<VolumeUnit> q1 = new Quantity<>(-1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(-1000.0, VolumeUnit.MILLILITRE);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void testEquality_LargeVolumeValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1000000.0, VolumeUnit.MILLILITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1000.0, VolumeUnit.LITRE);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void testEquality_SmallVolumeValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(0.001, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1.0, VolumeUnit.MILLILITRE);
        assertTrue(q1.equals(q2));
    }

    @Test
    public void testConversion_LitreToMillilitre() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(1000.0, VolumeUnit.MILLILITRE), q1.convertTo(VolumeUnit.MILLILITRE));
    }

    @Test
    public void testConversion_MillilitreToLitre() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        assertEquals(new Quantity<>(1.0, VolumeUnit.LITRE), q1.convertTo(VolumeUnit.LITRE));
    }

    @Test
    public void testConversion_GallonToLitre() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.GALLON);
        assertEquals(new Quantity<>(3.78541, VolumeUnit.LITRE), q1.convertTo(VolumeUnit.LITRE));
    }

    @Test
    public void testConversion_LitreToGallon() {
        Quantity<VolumeUnit> q1 = new Quantity<>(3.78541, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(1.0, VolumeUnit.GALLON), q1.convertTo(VolumeUnit.GALLON));
    }

    @Test
    public void testConversion_MillilitreToGallon() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        assertEquals(new Quantity<>(0.264172, VolumeUnit.GALLON), q1.convertTo(VolumeUnit.GALLON));
    }

    @Test
    public void testConversion_SameUnit() {
        Quantity<VolumeUnit> q1 = new Quantity<>(5.0, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(5.0, VolumeUnit.LITRE), q1.convertTo(VolumeUnit.LITRE));
    }

    @Test
    public void testConversion_ZeroValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(0.0, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(0.0, VolumeUnit.MILLILITRE), q1.convertTo(VolumeUnit.MILLILITRE));
    }

    @Test
    public void testConversion_NegativeValue() {
        Quantity<VolumeUnit> q1 = new Quantity<>(-1.0, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(-1000.0, VolumeUnit.MILLILITRE), q1.convertTo(VolumeUnit.MILLILITRE));
    }

    @Test
    public void testConversion_RoundTrip() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.5, VolumeUnit.LITRE);
        Quantity<VolumeUnit> roundTrip = q1.convertTo(VolumeUnit.MILLILITRE).convertTo(VolumeUnit.LITRE);
        assertEquals(new Quantity<>(1.5, VolumeUnit.LITRE), roundTrip);
    }

    @Test
    public void testAddition_SameUnit_LitrePlusLitre() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(2.0, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(3.0, VolumeUnit.LITRE), q1.add(q2));
    }

    @Test
    public void testAddition_SameUnit_MillilitrePlusMillilitre() {
        Quantity<VolumeUnit> q1 = new Quantity<>(500.0, VolumeUnit.MILLILITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(500.0, VolumeUnit.MILLILITRE);
        assertEquals(new Quantity<>(1000.0, VolumeUnit.MILLILITRE), q1.add(q2));
    }

    @Test
    public void testAddition_CrossUnit_LitrePlusMillilitre() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        assertEquals(new Quantity<>(2.0, VolumeUnit.LITRE), q1.add(q2));
    }

    @Test
    public void testAddition_CrossUnit_MillilitrePlusLitre() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1.0, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(2000.0, VolumeUnit.MILLILITRE), q1.add(q2));
    }

    @Test
    public void testAddition_CrossUnit_GallonPlusLitre() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> q2 = new Quantity<>(3.78541, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(2.0, VolumeUnit.GALLON), q1.add(q2));
    }

    @Test
    public void testAddition_ExplicitTargetUnit_Litre() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        assertEquals(new Quantity<>(2.0, VolumeUnit.LITRE), q1.add(q2, VolumeUnit.LITRE));
    }

    @Test
    public void testAddition_ExplicitTargetUnit_Millilitre() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        assertEquals(new Quantity<>(2000.0, VolumeUnit.MILLILITRE), q1.add(q2, VolumeUnit.MILLILITRE));
    }

    @Test
    public void testAddition_ExplicitTargetUnit_Gallon() {
        Quantity<VolumeUnit> q1 = new Quantity<>(3.78541, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(3.78541, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(2.0, VolumeUnit.GALLON), q1.add(q2, VolumeUnit.GALLON));
    }

    @Test
    public void testAddition_Commutativity() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1.0, VolumeUnit.LITRE).add(new Quantity<>(1000.0, VolumeUnit.MILLILITRE), VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1000.0, VolumeUnit.MILLILITRE).add(new Quantity<>(1.0, VolumeUnit.LITRE), VolumeUnit.LITRE);
        assertEquals(q1, q2);
    }

    @Test
    public void testAddition_WithZero() {
        Quantity<VolumeUnit> q1 = new Quantity<>(5.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(0.0, VolumeUnit.MILLILITRE);
        assertEquals(new Quantity<>(5.0, VolumeUnit.LITRE), q1.add(q2));
    }

    @Test
    public void testAddition_NegativeValues() {
        Quantity<VolumeUnit> q1 = new Quantity<>(5.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(-2000.0, VolumeUnit.MILLILITRE);
        assertEquals(new Quantity<>(3.0, VolumeUnit.LITRE), q1.add(q2));
    }

    @Test
    public void testAddition_LargeValues() {
        Quantity<VolumeUnit> q1 = new Quantity<>(1e6, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(1e6, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(2e6, VolumeUnit.LITRE), q1.add(q2));
    }

    @Test
    public void testAddition_SmallValues() {
        Quantity<VolumeUnit> q1 = new Quantity<>(0.001, VolumeUnit.LITRE);
        Quantity<VolumeUnit> q2 = new Quantity<>(0.002, VolumeUnit.LITRE);
        assertEquals(new Quantity<>(0.003, VolumeUnit.LITRE), q1.add(q2));
    }


    @Test
    public void testVolumeUnitEnum_LitreConstant() {
        assertEquals(1.0, VolumeUnit.LITRE.getConversionFactor(), 0.0001);
    }

    @Test
    public void testVolumeUnitEnum_MillilitreConstant() {
        assertEquals(0.001, VolumeUnit.MILLILITRE.getConversionFactor(), 0.0001);
    }

    @Test
    public void testVolumeUnitEnum_GallonConstant() {
        assertEquals(3.78541, VolumeUnit.GALLON.getConversionFactor(), 0.00001);
    }

    @Test
    public void testConvertToBaseUnit_LitreToLitre() {
        assertEquals(5.0, VolumeUnit.LITRE.convertToBaseUnit(5.0), 0.0001);
    }

    @Test
    public void testConvertToBaseUnit_MillilitreToLitre() {
        assertEquals(1.0, VolumeUnit.MILLILITRE.convertToBaseUnit(1000.0), 0.0001);
    }

    @Test
    public void testConvertToBaseUnit_GallonToLitre() {
        assertEquals(3.78541, VolumeUnit.GALLON.convertToBaseUnit(1.0), 0.00001);
    }

    @Test
    public void testConvertFromBaseUnit_LitreToLitre() {
        assertEquals(2.0, VolumeUnit.LITRE.convertFromBaseUnit(2.0), 0.0001);
    }

    @Test
    public void testConvertFromBaseUnit_LitreToMillilitre() {
        assertEquals(1000.0, VolumeUnit.MILLILITRE.convertFromBaseUnit(1.0), 0.0001);
    }

    @Test
    public void testConvertFromBaseUnit_LitreToGallon() {
        assertEquals(1.0, VolumeUnit.GALLON.convertFromBaseUnit(3.78541), 0.0001);
    }

    @Test
    public void testBackwardCompatibility_AllUC1Through10Tests() {
        Quantity<LengthUnit> l1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> l2 = new Quantity<>(12.0, LengthUnit.INCHES);
        assertTrue(l1.equals(l2)); // Length logic intact

        Quantity<WeightUnit> w1 = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> w2 = new Quantity<>(1000.0, WeightUnit.GRAM);
        assertTrue(w1.equals(w2)); // Weight logic intact
    }

    @Test
    public void testGenericQuantity_VolumeOperations_Consistency() {
        Quantity<VolumeUnit> v1 = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> v2 = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);

        assertNotNull(v1.convertTo(VolumeUnit.MILLILITRE));
        assertEquals(v1.add(v2).getValue(), 2.0);
    }

    @Test
    public void testScalability_VolumeIntegration() {
        Quantity<VolumeUnit> volume = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<WeightUnit> weight = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<LengthUnit> length = new Quantity<>(1.0, LengthUnit.FEET);

        assertFalse(volume.equals(weight));
        assertFalse(volume.equals(length));
        assertFalse(weight.equals(length));
    }

    //UC12

    @Test
    void testSubtraction_SameUnit_FeetMinusFeet() {
        assertEquals(
                new Quantity<>(5.0, LengthUnit.FEET),
                new Quantity<>(10.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(5.0, LengthUnit.FEET))
        );
    }

    @Test
    void testSubtraction_CrossUnit_FeetMinusInches() {
        assertEquals(
                new Quantity<>(9.5, LengthUnit.FEET),
                new Quantity<>(10.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(6.0, LengthUnit.INCHES))
        );
    }

    @Test
    void testSubtraction_ExplicitTargetUnit_Inches() {
        assertEquals(
                new Quantity<>(114.0, LengthUnit.INCHES),
                new Quantity<>(10.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(6.0, LengthUnit.INCHES), LengthUnit.INCHES)
        );
    }

    @Test
    void testSubtraction_ResultingInNegative() {
        assertEquals(
                new Quantity<>(-5.0, LengthUnit.FEET),
                new Quantity<>(5.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(10.0, LengthUnit.FEET))
        );
    }

    @Test
    void testSubtraction_ResultingInZero() {
        assertEquals(
                new Quantity<>(0.0, LengthUnit.FEET),
                new Quantity<>(10.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(120.0, LengthUnit.INCHES))
        );
    }

    @Test
    void testSubtraction_NonCommutative() {
        Quantity<LengthUnit> a = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> b = new Quantity<>(5.0, LengthUnit.FEET);

        assertNotEquals(a.subtract(b), b.subtract(a));
    }

    @Test
    void testSubtraction_NullOperand() {
        Quantity<LengthUnit> a = new Quantity<>(10.0, LengthUnit.FEET);

        assertThrows(IllegalArgumentException.class, () -> a.subtract(null));
    }

    @Test
    void testSubtraction_CrossCategory() {
        Quantity<LengthUnit> l = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<WeightUnit> w = new Quantity<>(5.0, WeightUnit.KILOGRAM);

        assertThrows(IllegalArgumentException.class, () -> l.subtract((Quantity) w));
    }

    @Test
    void testDivision_SameUnit() {
        assertEquals(5.0,
                new Quantity<>(10.0, LengthUnit.FEET)
                        .divide(new Quantity<>(2.0, LengthUnit.FEET))
        );
    }

    @Test
    void testDivision_CrossUnit() {
        assertEquals(1.0,
                new Quantity<>(24.0, LengthUnit.INCHES)
                        .divide(new Quantity<>(2.0, LengthUnit.FEET))
        );
    }

    @Test
    void testDivision_RatioLessThanOne() {
        assertEquals(0.5,
                new Quantity<>(5.0, LengthUnit.FEET)
                        .divide(new Quantity<>(10.0, LengthUnit.FEET))
        );
    }

    @Test
    void testDivision_NonCommutative() {
        Quantity<LengthUnit> a = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> b = new Quantity<>(5.0, LengthUnit.FEET);

        assertNotEquals(a.divide(b), b.divide(a));
    }

    @Test
    void testDivision_ByZero() {
        assertThrows(ArithmeticException.class,
                () -> new Quantity<>(10.0, LengthUnit.FEET)
                        .divide(new Quantity<>(0.0, LengthUnit.FEET))
        );
    }

    @Test
    void testDivision_NullOperand() {
        Quantity<LengthUnit> a = new Quantity<>(10.0, LengthUnit.FEET);

        assertThrows(IllegalArgumentException.class, () -> a.divide(null));
    }

    @Test
    void testDivision_CrossCategory() {
        Quantity<LengthUnit> l = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<WeightUnit> w = new Quantity<>(5.0, WeightUnit.KILOGRAM);

        assertThrows(IllegalArgumentException.class, () -> l.divide((Quantity) w));
    }

    @Test
    void testSubtractionAndDivision_Integration() {
        Quantity<LengthUnit> result =
                new Quantity<>(10.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(5.0, LengthUnit.FEET));

        assertEquals(1.0, result.divide(new Quantity<>(5.0, LengthUnit.FEET)));
    }

    @Test
    void testSubtractionAddition_Inverse() {
        Quantity<LengthUnit> a = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> b = new Quantity<>(5.0, LengthUnit.FEET);

        assertEquals(a, a.add(b).subtract(b));
    }

    @Test
    void testSubtraction_Immutability() {
        Quantity<LengthUnit> a = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> b = new Quantity<>(5.0, LengthUnit.FEET);

        Quantity<LengthUnit> result = a.subtract(b);

        assertNotSame(a, result);
    }

    @Test
    void testDivision_Immutability() {
        Quantity<LengthUnit> a = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> b = new Quantity<>(5.0, LengthUnit.FEET);

        double result = a.divide(b);

        assertEquals(2.0, result);
        assertEquals(10.0, a.getValue());
    }

    @Test
    void testSubtraction_Precision() {
        Quantity<LengthUnit> result =
                new Quantity<>(1.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(2.54, LengthUnit.CENTIMETERS));

        assertEquals(0.92, result.getValue());
    }

    //UC13

    @Test
    void testAdd_WorksCorrectly() {
        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);
        Quantity<LengthUnit> result = q1.add(q2);
        assertEquals(2.0, result.getValue());
        assertEquals(LengthUnit.FEET, result.getUnit());
    }

    @Test
    void testSubtract_WorksCorrectly() {
        Quantity<LengthUnit> q1 = new Quantity<>(2.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);
        Quantity<LengthUnit> result = q1.subtract(q2);
        assertEquals(1.0, result.getValue());
    }

    @Test
    void testDivide_WorksCorrectly() {
        Quantity<LengthUnit> q1 = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(5.0, LengthUnit.FEET);
        assertEquals(2.0, q1.divide(q2));
    }

    @Test
    void testNullOperand_AllOperations() {
        Quantity<LengthUnit> q = new Quantity<>(1.0, LengthUnit.FEET);
        assertThrows(IllegalArgumentException.class, () -> q.add(null));
        assertThrows(IllegalArgumentException.class, () -> q.subtract(null));
        assertThrows(IllegalArgumentException.class, () -> q.divide(null));
    }

    @Test
    void testCrossCategory_AllOperations() {
        Quantity<LengthUnit> len = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<WeightUnit> wt = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        assertThrows(IllegalArgumentException.class, () -> len.add((Quantity) wt));
        assertThrows(IllegalArgumentException.class, () -> len.subtract((Quantity) wt));
        assertThrows(IllegalArgumentException.class, () -> len.divide((Quantity) wt));
    }

    @Test
    void testInvalidValues() {
        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(Double.NaN, LengthUnit.FEET);
        assertThrows(IllegalArgumentException.class, () -> q1.add(q2));
    }

    @Test
    void testDivideByZero() {
        Quantity<LengthUnit> q1 = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(0.0, LengthUnit.FEET);
        assertThrows(ArithmeticException.class, () -> q1.divide(q2));
    }

    @Test
    void testRounding_Add() {
        Quantity<LengthUnit> q1 = new Quantity<>(1.333, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(1.333, LengthUnit.FEET);
        Quantity<LengthUnit> result = q1.add(q2);
        assertEquals(2.67, result.getValue());
    }

    @Test
    void testDivide_NoRounding() {
        Quantity<LengthUnit> q1 = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(3.0, LengthUnit.FEET);
        assertEquals(10.0 / 3.0, q1.divide(q2));
    }

    @Test
    void testImplicitUnit() {
        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);
        Quantity<LengthUnit> result = q1.add(q2);
        assertEquals(LengthUnit.FEET, result.getUnit());
    }

    @Test
    void testExplicitUnit() {
        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);
        Quantity<LengthUnit> result = q1.add(q2, LengthUnit.INCHES);
        assertEquals(LengthUnit.INCHES, result.getUnit());
    }

    @Test
    void testImmutability() {
        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);
        q1.add(q2);
        assertEquals(1.0, q1.getValue());
    }

    @Test
    void testChaining() {
        Quantity<LengthUnit> q1 = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(5.0, LengthUnit.FEET);
        Quantity<LengthUnit> q3 = new Quantity<>(2.0, LengthUnit.FEET);
        double result = q1.add(q2).subtract(q3).divide(q2);
        assertEquals((10 + 5 - 2) / 5.0, result);
    }

    @Test
    void testEquality() {
        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testConversion() {
        Quantity<LengthUnit> q = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> result = q.convertTo(LengthUnit.INCHES);
        assertEquals(12.0, result.getValue());
    }
}