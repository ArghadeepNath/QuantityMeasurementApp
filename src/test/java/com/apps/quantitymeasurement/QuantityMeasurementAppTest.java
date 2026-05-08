package com.apps.quantitymeasurement;

import com.apps.quantitymeasurement.dto.QuantityDTO;
import com.apps.quantitymeasurement.entity.QuantityEntity;
import com.apps.quantitymeasurement.repository.InMemoryQuantityRepository;
import com.apps.quantitymeasurement.repository.QuantityRepository;
import com.apps.quantitymeasurement.service.QuantityService;
import com.apps.quantitymeasurement.model.QuantityModel;
import com.apps.quantitymeasurement.unit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    private QuantityService service;

    @BeforeEach
    void setUp() {
        QuantityRepository repository =
                new InMemoryQuantityRepository();

        service = new QuantityService(repository);
    }

    // ---------------- EQUALITY TESTS ----------------

    @Test
    void shouldReturnTrueForFeetAndInches() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(1, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(12, LengthUnit.INCHES);

        assertTrue(service.areEqual(q1, q2));
    }

    @Test
    void shouldReturnTrueForYardsAndFeet() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(1, LengthUnit.YARDS);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(3, LengthUnit.FEET);

        assertTrue(service.areEqual(q1, q2));
    }

    @Test
    void shouldReturnFalseForDifferentLengths() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(1, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(11, LengthUnit.INCHES);

        assertFalse(service.areEqual(q1, q2));
    }

    @Test
    void shouldReturnTrueForKilogramAndGram() {
        QuantityModel<WeightUnit> q1 =
                new QuantityModel<>(1, WeightUnit.KILOGRAM);

        QuantityModel<WeightUnit> q2 =
                new QuantityModel<>(1000, WeightUnit.GRAM);

        assertTrue(service.areEqual(q1, q2));
    }

    @Test
    void shouldReturnTrueForLitreAndMillilitre() {
        QuantityModel<VolumeUnit> q1 =
                new QuantityModel<>(1, VolumeUnit.LITRE);

        QuantityModel<VolumeUnit> q2 =
                new QuantityModel<>(1000, VolumeUnit.MILLILITRE);

        assertTrue(service.areEqual(q1, q2));
    }

    @Test
    void shouldReturnTrueForTemperatureEquality() {
        QuantityModel<TemperatureUnit> t1 =
                new QuantityModel<>(0, TemperatureUnit.CELSIUS);

        QuantityModel<TemperatureUnit> t2 =
                new QuantityModel<>(32, TemperatureUnit.FAHRENHEIT);

        assertTrue(service.areEqual(t1, t2));
    }

    @Test
    void shouldReturnFalseForDifferentTemperatures() {
        QuantityModel<TemperatureUnit> t1 =
                new QuantityModel<>(0, TemperatureUnit.CELSIUS);

        QuantityModel<TemperatureUnit> t2 =
                new QuantityModel<>(40, TemperatureUnit.FAHRENHEIT);

        assertFalse(service.areEqual(t1, t2));
    }

    @Test
    void shouldReturnTrueForSameValues() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(5, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(5, LengthUnit.FEET);

        assertTrue(service.areEqual(q1, q2));
    }

    @Test
    void shouldReturnFalseForDifferentUnits() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(5, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(6, LengthUnit.FEET);

        assertFalse(service.areEqual(q1, q2));
    }

    @Test
    void shouldHandleZeroEquality() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(0, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(0, LengthUnit.INCHES);

        assertTrue(service.areEqual(q1, q2));
    }

    // ---------------- CONVERSION TESTS ----------------

    @Test
    void shouldConvertFeetToInches() {
        QuantityModel<LengthUnit> q =
                new QuantityModel<>(1, LengthUnit.FEET);

        QuantityModel<LengthUnit> result =
                service.convert(q, LengthUnit.INCHES);

        assertEquals(12.0, result.getValue());
    }

    @Test
    void shouldConvertInchesToFeet() {
        QuantityModel<LengthUnit> q =
                new QuantityModel<>(24, LengthUnit.INCHES);

        QuantityModel<LengthUnit> result =
                service.convert(q, LengthUnit.FEET);

        assertEquals(2.0, result.getValue());
    }

    @Test
    void shouldConvertYardsToFeet() {
        QuantityModel<LengthUnit> q =
                new QuantityModel<>(1, LengthUnit.YARDS);

        QuantityModel<LengthUnit> result =
                service.convert(q, LengthUnit.FEET);

        assertEquals(3.0, result.getValue());
    }

    @Test
    void shouldConvertKilogramToGram() {
        QuantityModel<WeightUnit> q =
                new QuantityModel<>(1, WeightUnit.KILOGRAM);

        QuantityModel<WeightUnit> result =
                service.convert(q, WeightUnit.GRAM);

        assertEquals(1000.0, result.getValue());
    }

    @Test
    void shouldConvertGramToKilogram() {
        QuantityModel<WeightUnit> q =
                new QuantityModel<>(5000, WeightUnit.GRAM);

        QuantityModel<WeightUnit> result =
                service.convert(q, WeightUnit.KILOGRAM);

        assertEquals(5.0, result.getValue());
    }

    @Test
    void shouldConvertLitreToMillilitre() {
        QuantityModel<VolumeUnit> q =
                new QuantityModel<>(1, VolumeUnit.LITRE);

        QuantityModel<VolumeUnit> result =
                service.convert(q, VolumeUnit.MILLILITRE);

        assertEquals(1000.0, result.getValue());
    }

    @Test
    void shouldConvertFahrenheitToCelsius() {
        QuantityModel<TemperatureUnit> q =
                new QuantityModel<>(32, TemperatureUnit.FAHRENHEIT);

        QuantityModel<TemperatureUnit> result =
                service.convert(q, TemperatureUnit.CELSIUS);

        assertEquals(0.0, result.getValue());
    }

    @Test
    void shouldConvertCelsiusToKelvin() {
        QuantityModel<TemperatureUnit> q =
                new QuantityModel<>(0, TemperatureUnit.CELSIUS);

        QuantityModel<TemperatureUnit> result =
                service.convert(q, TemperatureUnit.KELVIN);

        assertEquals(273.15, result.getValue());
    }

    @Test
    void shouldConvertKelvinToCelsius() {
        QuantityModel<TemperatureUnit> q =
                new QuantityModel<>(273.15, TemperatureUnit.KELVIN);

        QuantityModel<TemperatureUnit> result =
                service.convert(q, TemperatureUnit.CELSIUS);

        assertEquals(0.0, result.getValue());
    }

    @Test
    void shouldConvertPoundsToGrams() {
        QuantityModel<WeightUnit> q =
                new QuantityModel<>(1, WeightUnit.POUND);

        QuantityModel<WeightUnit> result =
                service.convert(q, WeightUnit.GRAM);

        assertEquals(453.59, result.getValue());
    }

    // ---------------- ADDITION TESTS ----------------

    @Test
    void shouldAddFeetAndInches() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(1, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(12, LengthUnit.INCHES);

        QuantityModel<LengthUnit> result =
                service.add(q1, q2);

        assertEquals(2.0, result.getValue());
    }

    @Test
    void shouldAddFeetAndFeet() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(5, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(5, LengthUnit.FEET);

        QuantityModel<LengthUnit> result =
                service.add(q1, q2);

        assertEquals(10.0, result.getValue());
    }

    @Test
    void shouldAddKilograms() {
        QuantityModel<WeightUnit> q1 =
                new QuantityModel<>(1, WeightUnit.KILOGRAM);

        QuantityModel<WeightUnit> q2 =
                new QuantityModel<>(2, WeightUnit.KILOGRAM);

        QuantityModel<WeightUnit> result =
                service.add(q1, q2);

        assertEquals(3.0, result.getValue());
    }

    @Test
    void shouldAddLitres() {
        QuantityModel<VolumeUnit> q1 =
                new QuantityModel<>(1, VolumeUnit.LITRE);

        QuantityModel<VolumeUnit> q2 =
                new QuantityModel<>(2, VolumeUnit.LITRE);

        QuantityModel<VolumeUnit> result =
                service.add(q1, q2);

        assertEquals(3.0, result.getValue());
    }

    @Test
    void shouldAddMillilitresAndLitres() {
        QuantityModel<VolumeUnit> q1 =
                new QuantityModel<>(500, VolumeUnit.MILLILITRE);

        QuantityModel<VolumeUnit> q2 =
                new QuantityModel<>(1, VolumeUnit.LITRE);

        QuantityModel<VolumeUnit> result =
                service.add(q1, q2);

        assertEquals(1500.0, result.getValue());
    }

    @Test
    void shouldAddZeroCorrectly() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(0, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(5, LengthUnit.FEET);

        QuantityModel<LengthUnit> result =
                service.add(q1, q2);

        assertEquals(5.0, result.getValue());
    }

    @Test
    void shouldAddNegativeValues() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(-5, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(10, LengthUnit.FEET);

        QuantityModel<LengthUnit> result =
                service.add(q1, q2);

        assertEquals(5.0, result.getValue());
    }

    @Test
    void shouldRoundAdditionResult() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(1.333, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(1.333, LengthUnit.FEET);

        QuantityModel<LengthUnit> result =
                service.add(q1, q2);

        assertEquals(2.67, result.getValue());
    }

    @Test
    void shouldStoreAdditionHistory() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(1, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(1, LengthUnit.FEET);

        service.add(q1, q2);

        List<QuantityEntity> history = service.getHistory();

        assertEquals(1, history.size());
    }

    @Test
    void shouldStoreCorrectOperationType() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(1, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(1, LengthUnit.FEET);

        service.add(q1, q2);

        List<QuantityEntity> history = service.getHistory();

        assertEquals("ADD", history.get(0).getOperation());
    }

    // ---------------- SUBTRACTION TESTS ----------------

    @Test
    void shouldSubtractFeetCorrectly() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(10, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(5, LengthUnit.FEET);

        QuantityModel<LengthUnit> result =
                service.subtract(q1, q2);

        assertEquals(5.0, result.getValue());
    }

    @Test
    void shouldSubtractInchesFromFeet() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(1, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(6, LengthUnit.INCHES);

        QuantityModel<LengthUnit> result =
                service.subtract(q1, q2);

        assertEquals(0.5, result.getValue());
    }

    @Test
    void shouldSubtractLitres() {
        QuantityModel<VolumeUnit> q1 =
                new QuantityModel<>(5, VolumeUnit.LITRE);

        QuantityModel<VolumeUnit> q2 =
                new QuantityModel<>(2, VolumeUnit.LITRE);

        QuantityModel<VolumeUnit> result =
                service.subtract(q1, q2);

        assertEquals(3.0, result.getValue());
    }

    @Test
    void shouldSubtractKilograms() {
        QuantityModel<WeightUnit> q1 =
                new QuantityModel<>(10, WeightUnit.KILOGRAM);

        QuantityModel<WeightUnit> q2 =
                new QuantityModel<>(5, WeightUnit.KILOGRAM);

        QuantityModel<WeightUnit> result =
                service.subtract(q1, q2);

        assertEquals(5.0, result.getValue());
    }

    @Test
    void shouldSubtractToNegativeValue() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(2, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(5, LengthUnit.FEET);

        QuantityModel<LengthUnit> result =
                service.subtract(q1, q2);

        assertEquals(-3.0, result.getValue());
    }

    @Test
    void shouldSubtractZeroCorrectly() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(5, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(0, LengthUnit.FEET);

        QuantityModel<LengthUnit> result =
                service.subtract(q1, q2);

        assertEquals(5.0, result.getValue());
    }

    @Test
    void shouldStoreSubtractionHistory() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(5, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(2, LengthUnit.FEET);

        service.subtract(q1, q2);

        assertEquals(1, service.getHistory().size());
    }

    @Test
    void shouldStoreSubtractOperationType() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(5, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(2, LengthUnit.FEET);

        service.subtract(q1, q2);

        assertEquals(
                "SUBTRACT",
                service.getHistory().get(0).getOperation()
        );
    }

    // ---------------- DIVISION TESTS ----------------

    @Test
    void shouldDivideFeetCorrectly() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(10, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(5, LengthUnit.FEET);

        assertEquals(2.0, service.divide(q1, q2));
    }

    @Test
    void shouldDivideInchesCorrectly() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(24, LengthUnit.INCHES);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(12, LengthUnit.INCHES);

        assertEquals(2.0, service.divide(q1, q2));
    }

    @Test
    void shouldDivideWeightsCorrectly() {
        QuantityModel<WeightUnit> q1 =
                new QuantityModel<>(10, WeightUnit.KILOGRAM);

        QuantityModel<WeightUnit> q2 =
                new QuantityModel<>(2, WeightUnit.KILOGRAM);

        assertEquals(5.0, service.divide(q1, q2));
    }

    @Test
    void shouldDivideVolumesCorrectly() {
        QuantityModel<VolumeUnit> q1 =
                new QuantityModel<>(10, VolumeUnit.LITRE);

        QuantityModel<VolumeUnit> q2 =
                new QuantityModel<>(2, VolumeUnit.LITRE);

        assertEquals(5.0, service.divide(q1, q2));
    }

    @Test
    void shouldThrowExceptionForDivisionByZero() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(10, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(0, LengthUnit.FEET);

        assertThrows(
                ArithmeticException.class,
                () -> service.divide(q1, q2)
        );
    }

    @Test
    void shouldStoreDivisionHistory() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(10, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(5, LengthUnit.FEET);

        service.divide(q1, q2);

        assertEquals(1, service.getHistory().size());
    }

    @Test
    void shouldStoreDivideOperationType() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(10, LengthUnit.FEET);

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(5, LengthUnit.FEET);

        service.divide(q1, q2);

        assertEquals(
                "DIVIDE",
                service.getHistory().get(0).getOperation()
        );
    }

    // ---------------- EXCEPTION TESTS ----------------

    @Test
    void shouldThrowExceptionForNullUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityModel<>(10, null)
        );
    }

    @Test
    void shouldThrowExceptionForNullOperands() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(1, LengthUnit.FEET);

        assertThrows(
                IllegalArgumentException.class,
                () -> service.add(q1, null)
        );
    }

    @Test
    void shouldThrowExceptionForDifferentUnitCategories() {
        QuantityModel<IMeasurable> q1 =
                new QuantityModel<>(1, LengthUnit.FEET);

        QuantityModel<IMeasurable> q2 =
                new QuantityModel<>(1, WeightUnit.KILOGRAM);

        assertThrows(
                IllegalArgumentException.class,
                () -> service.areEqual(q1, q2)
        );
    }

    @Test
    void shouldThrowExceptionForTemperatureAddition() {
        QuantityModel<TemperatureUnit> t1 =
                new QuantityModel<>(0, TemperatureUnit.CELSIUS);

        QuantityModel<TemperatureUnit> t2 =
                new QuantityModel<>(32, TemperatureUnit.FAHRENHEIT);

        assertThrows(
                UnsupportedOperationException.class,
                () -> service.add(t1, t2)
        );
    }

    @Test
    void shouldThrowExceptionForTemperatureSubtraction() {
        QuantityModel<TemperatureUnit> t1 =
                new QuantityModel<>(0, TemperatureUnit.CELSIUS);

        QuantityModel<TemperatureUnit> t2 =
                new QuantityModel<>(32, TemperatureUnit.FAHRENHEIT);

        assertThrows(
                UnsupportedOperationException.class,
                () -> service.subtract(t1, t2)
        );
    }

    @Test
    void shouldThrowExceptionForTemperatureDivision() {
        QuantityModel<TemperatureUnit> t1 =
                new QuantityModel<>(0, TemperatureUnit.CELSIUS);

        QuantityModel<TemperatureUnit> t2 =
                new QuantityModel<>(32, TemperatureUnit.FAHRENHEIT);

        assertThrows(
                UnsupportedOperationException.class,
                () -> service.divide(t1, t2)
        );
    }

    @Test
    void shouldThrowExceptionForNullConversionTarget() {
        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(1, LengthUnit.FEET);

        assertThrows(
                IllegalArgumentException.class,
                () -> service.convert(q1, null)
        );
    }

    @Test
    void shouldThrowExceptionForNullQuantityInConversion() {
        assertThrows(
                IllegalArgumentException.class,
                () -> service.convert(null, LengthUnit.FEET)
        );
    }

    // ---------------- DTO TESTS ----------------

    @Test
    void shouldCreateValidDTO() {
        QuantityDTO dto =
                new QuantityDTO(10, "FEET");

        assertEquals(10, dto.getValue());
        assertEquals("FEET", dto.getUnit());
    }

    @Test
    void shouldThrowExceptionForInvalidDTOValue() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityDTO(Double.NaN, "FEET")
        );
    }

    @Test
    void shouldThrowExceptionForNullDTOUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityDTO(10, null)
        );
    }

    @Test
    void shouldThrowExceptionForBlankDTOUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityDTO(10, "")
        );
    }
}
