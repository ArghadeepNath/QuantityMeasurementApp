package com.apps.quantitymeasurement.repository;

import com.apps.quantitymeasurement.entity.QuantityEntity;

import java.util.List;

public interface QuantityRepository {

    void save(QuantityEntity entity);

    List<QuantityEntity> findAll();
}