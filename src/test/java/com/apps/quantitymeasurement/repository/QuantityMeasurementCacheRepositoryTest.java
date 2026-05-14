package com.apps.quantitymeasurement.repository;

import com.apps.quantitymeasurement.entity.QuantityMeasurementEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementCacheRepositoryTest {

    private QuantityMeasurementCacheRepository repository;

    @BeforeEach
    void setup() {

        repository =
                new QuantityMeasurementCacheRepository();
    }

    @Test
    void testSaveMeasurement() {

        QuantityMeasurementEntity entity =
                new QuantityMeasurementEntity();

        entity.setThisValue(1.0);

        entity.setThisUnit("FEET");

        repository.save(entity);

        List<QuantityMeasurementEntity>
                entities =
                repository.findAll();

        assertEquals(
                1,
                entities.size()
        );
    }

    @Test
    void testFindAllInitiallyEmpty() {

        List<QuantityMeasurementEntity>
                entities =
                repository.findAll();

        assertTrue(entities.isEmpty());
    }

    @Test
    void testMultipleEntitiesStored() {

        QuantityMeasurementEntity e1 =
                new QuantityMeasurementEntity();

        QuantityMeasurementEntity e2 =
                new QuantityMeasurementEntity();

        repository.save(e1);

        repository.save(e2);

        assertEquals(
                2,
                repository.findAll().size()
        );
    }
}