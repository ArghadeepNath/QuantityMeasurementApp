package com.apps.quantitymeasurement.repository;

import com.apps.quantitymeasurement.entity.QuantityMeasurementEntity;

import java.util.ArrayList;
import java.util.List;

public class QuantityMeasurementCacheRepository
        implements IQuantityMeasurementRepository {

    private final List<QuantityMeasurementEntity> storage =
            new ArrayList<>();

    @Override
    public void save(QuantityMeasurementEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException(
                    "Entity cannot be null"
            );
        }

        storage.add(entity);
    }

    @Override
    public List<QuantityMeasurementEntity> findAll() {
        return new ArrayList<>(storage);
    }
}