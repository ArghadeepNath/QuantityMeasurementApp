package com.apps.quantitymeasurementapp.service;

import com.apps.quantitymeasurementapp.entity.QuantityMeasurementEntity;
import com.apps.quantitymeasurementapp.entity.QuantityModel;
import com.apps.quantitymeasurementapp.unit.IMeasurable;

import java.util.List;

public interface IQuantityMeasurementService {

    <U extends IMeasurable> QuantityModel<U> convert(QuantityModel<U> source,U targetUnit);

    <U extends IMeasurable> boolean areEqual(QuantityModel<U> q1,QuantityModel<U> q2);

    <U extends IMeasurable> QuantityModel<U> add(QuantityModel<U> q1,QuantityModel<U> q2);

    <U extends IMeasurable> QuantityModel<U> subtract(QuantityModel<U> q1,QuantityModel<U> q2);

    <U extends IMeasurable> double divide(QuantityModel<U> q1,QuantityModel<U> q2);

    List<QuantityMeasurementEntity> getHistory();
}