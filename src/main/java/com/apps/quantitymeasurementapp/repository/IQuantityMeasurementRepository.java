package com.apps.quantitymeasurementapp.repository;

import com.apps.quantitymeasurementapp.entity.QuantityMeasurementEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuantityMeasurementRepository
        extends JpaRepository<QuantityMeasurementEntity, Long> {

}