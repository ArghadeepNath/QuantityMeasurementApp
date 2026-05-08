package com.apps.quantitymeasurement.repository;

import com.apps.quantitymeasurement.entity.QuantityEntity;

import java.util.ArrayList;
import java.util.List;

public class InMemoryQuantityRepository
        implements QuantityRepository {

    private final List<QuantityEntity> storage =
            new ArrayList<>();

    @Override
    public void save(QuantityEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException(
                    "Entity cannot be null"
            );
        }

        storage.add(entity);
    }

    @Override
    public List<QuantityEntity> findAll() {
        return new ArrayList<>(storage);
    }
}