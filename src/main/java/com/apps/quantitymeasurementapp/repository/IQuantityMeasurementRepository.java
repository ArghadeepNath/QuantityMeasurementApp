package com.apps.quantitymeasurementapp.repository;

import com.apps.quantitymeasurementapp.entity.QuantityMeasurementEntity;

import java.util.List;

public interface IQuantityMeasurementRepository {

    void save(QuantityMeasurementEntity entity);

    List<QuantityMeasurementEntity> findAll();
}