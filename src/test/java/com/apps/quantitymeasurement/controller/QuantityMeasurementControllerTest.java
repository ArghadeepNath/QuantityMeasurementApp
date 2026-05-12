package com.apps.quantitymeasurement.controller;

import com.apps.quantitymeasurement.entity.QuantityDTO;
import com.apps.quantitymeasurement.repository.QuantityMeasurementCacheRepository;
import com.apps.quantitymeasurement.service.QuantityMeasurementServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementControllerTest {

    private QuantityMeasurementController controller;

    @BeforeEach
    void setup() {

        controller =
                new QuantityMeasurementController(
                        new QuantityMeasurementServiceImpl(
                                new QuantityMeasurementCacheRepository()
                        )
                );
    }

    @Test
    void testCompare() {

        QuantityDTO q1 =
                new QuantityDTO(
                        1.0,
                        "FEET"
                );

        QuantityDTO q2 =
                new QuantityDTO(
                        12.0,
                        "INCHES"
                );

        assertTrue(
                controller.areEqual(q1, q2)
        );
    }

    @Test
    void testConvert() {

        QuantityDTO q1 =
                new QuantityDTO(
                        1.0,
                        "FEET"
                );

        QuantityDTO result =
                controller.convert(
                        q1,
                        "INCHES"
                );

        assertEquals(
                12.0,
                result.getValue()
        );
    }
}