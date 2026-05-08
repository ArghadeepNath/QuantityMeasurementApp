package com.apps.quantitymeasurement.service;

import com.apps.quantitymeasurement.entity.QuantityEntity;
import com.apps.quantitymeasurement.model.QuantityModel;
import com.apps.quantitymeasurement.repository.QuantityRepository;
import com.apps.quantitymeasurement.unit.IMeasurable;

import java.util.List;

public class QuantityService {

    private final QuantityRepository repository;

    public QuantityService(
            QuantityRepository repository
    ) {
        this.repository = repository;
    }

    public <U extends IMeasurable> QuantityModel<U> convert(
            QuantityModel<U> source,
            U targetUnit
    ) {

        validateSingle(source, targetUnit);

        double baseValue =
                source.getUnit().convertToBaseUnit(source.getValue());

        double convertedValue =
                targetUnit.convertFromBaseUnit(baseValue);

        convertedValue = roundOff(convertedValue);

        QuantityEntity entity =
                new QuantityEntity(
                        System.currentTimeMillis(),
                        convertedValue,
                        targetUnit.toString(),
                        "CONVERT"
                );

        repository.save(entity);

        return new QuantityModel<>(
                convertedValue,
                targetUnit
        );
    }

    public <U extends IMeasurable> boolean areEqual(
            QuantityModel<U> q1,
            QuantityModel<U> q2
    ) {

        validateOperands(q1, q2);

        double a =
                q1.getUnit().convertToBaseUnit(q1.getValue());

        double b =
                q2.getUnit().convertToBaseUnit(q2.getValue());

        return Math.abs(a - b) < 0.0001;
    }

    public <U extends IMeasurable> QuantityModel<U> add(
            QuantityModel<U> q1,
            QuantityModel<U> q2
    ) {

        validateOperands(q1, q2);

        q1.getUnit().validateOperationSupport("ADD");
        q2.getUnit().validateOperationSupport("ADD");

        double a =
                q1.getUnit().convertToBaseUnit(q1.getValue());

        double b =
                q2.getUnit().convertToBaseUnit(q2.getValue());

        double resultBase = a + b;

        double result =
                q1.getUnit().convertFromBaseUnit(resultBase);

        result = roundOff(result);

        QuantityEntity entity =
                new QuantityEntity(
                        System.currentTimeMillis(),
                        result,
                        q1.getUnit().toString(),
                        "ADD"
                );

        repository.save(entity);

        return new QuantityModel<>(
                result,
                q1.getUnit()
        );
    }

    public <U extends IMeasurable> QuantityModel<U> subtract(
            QuantityModel<U> q1,
            QuantityModel<U> q2
    ) {

        validateOperands(q1, q2);

        q1.getUnit().validateOperationSupport("SUBTRACT");
        q2.getUnit().validateOperationSupport("SUBTRACT");

        double a =
                q1.getUnit().convertToBaseUnit(q1.getValue());

        double b =
                q2.getUnit().convertToBaseUnit(q2.getValue());

        double resultBase = a - b;

        double result =
                q1.getUnit().convertFromBaseUnit(resultBase);

        result = roundOff(result);

        QuantityEntity entity =
                new QuantityEntity(
                        System.currentTimeMillis(),
                        result,
                        q1.getUnit().toString(),
                        "SUBTRACT"
                );

        repository.save(entity);

        return new QuantityModel<>(
                result,
                q1.getUnit()
        );
    }

    public <U extends IMeasurable> double divide(
            QuantityModel<U> q1,
            QuantityModel<U> q2
    ) {

        validateOperands(q1, q2);

        q1.getUnit().validateOperationSupport("DIVIDE");
        q2.getUnit().validateOperationSupport("DIVIDE");

        double a =
                q1.getUnit().convertToBaseUnit(q1.getValue());

        double b =
                q2.getUnit().convertToBaseUnit(q2.getValue());

        if (b == 0.0) {
            throw new ArithmeticException(
                    "Division by zero"
            );
        }

        double result = a / b;

        QuantityEntity entity =
                new QuantityEntity(
                        System.currentTimeMillis(),
                        result,
                        q1.getUnit().toString(),
                        "DIVIDE"
                );

        repository.save(entity);

        return result;
    }

    public List<QuantityEntity> getHistory() {
        return repository.findAll();
    }

    private <U extends IMeasurable> void validateSingle(
            QuantityModel<U> q,
            U targetUnit
    ) {

        if (q == null || targetUnit == null)
            throw new IllegalArgumentException(
                    "Quantity or target unit cannot be null"
            );
    }

    private <U extends IMeasurable> void validateOperands(
            QuantityModel<U> q1,
            QuantityModel<U> q2
    ) {

        if (q1 == null || q2 == null)
            throw new IllegalArgumentException(
                    "Quantities cannot be null"
            );

        if (!q1.getUnit().getClass()
                .equals(q2.getUnit().getClass())) {

            throw new IllegalArgumentException(
                    "Units are different"
            );
        }
    }

    private double roundOff(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}