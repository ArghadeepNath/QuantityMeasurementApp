package com.apps.quantitymeasurement.service;

import com.apps.quantitymeasurement.entity.QuantityModel;
import com.apps.quantitymeasurement.repository.QuantityMeasurementCacheRepository;
import com.apps.quantitymeasurement.unit.LengthUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementServiceImplTest {

    private QuantityMeasurementServiceImpl service;

    @BeforeEach
    void setup() {

        service =
                new QuantityMeasurementServiceImpl(
                        new QuantityMeasurementCacheRepository()
                );
    }

    @Test
    void testAreEqual() {

        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(
                        1.0,
                        LengthUnit.FEET
                );

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(
                        12.0,
                        LengthUnit.INCHES
                );

        assertTrue(
                service.areEqual(q1, q2)
        );
    }

    @Test
    void testAdd() {

        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(
                        1.0,
                        LengthUnit.FEET
                );

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(
                        12.0,
                        LengthUnit.INCHES
                );

        QuantityModel<LengthUnit> result =
                service.add(q1, q2);

        assertEquals(
                2.0,
                result.getValue()
        );
    }

    @Test
    void testDivide() {

        QuantityModel<LengthUnit> q1 =
                new QuantityModel<>(
                        12.0,
                        LengthUnit.INCHES
                );

        QuantityModel<LengthUnit> q2 =
                new QuantityModel<>(
                        6.0,
                        LengthUnit.INCHES
                );

        double result =
                service.divide(q1, q2);

        assertEquals(2.0, result);
    }
}