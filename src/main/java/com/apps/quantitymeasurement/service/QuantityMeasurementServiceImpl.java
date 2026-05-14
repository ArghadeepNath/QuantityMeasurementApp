package com.apps.quantitymeasurement.service;

import com.apps.quantitymeasurement.entity.QuantityMeasurementEntity;
import com.apps.quantitymeasurement.entity.QuantityModel;
import com.apps.quantitymeasurement.exception.QuantityMeasurementException;
import com.apps.quantitymeasurement.repository.IQuantityMeasurementRepository;
import com.apps.quantitymeasurement.unit.IMeasurable;

import java.util.List;

public class QuantityMeasurementServiceImpl
        implements IQuantityMeasurementService {

    private final IQuantityMeasurementRepository repository;

    public QuantityMeasurementServiceImpl(
            IQuantityMeasurementRepository repository
    ) {

        this.repository = repository;
    }

    @Override
    public <U extends IMeasurable>
    QuantityModel<U> convert(
            QuantityModel<U> source,
            U targetUnit
    ) {

        validateSingle(source, targetUnit);

        double baseValue =
                source.getUnit()
                        .convertToBaseUnit(
                                source.getValue()
                        );

        double convertedValue =
                targetUnit.convertFromBaseUnit(
                        baseValue
                );

        QuantityModel<U> result =
                new QuantityModel<>(
                        roundOff(convertedValue),
                        targetUnit
                );

        saveEntity(
                source,
                null,
                "CONVERT",
                result
        );

        return result;
    }

    @Override
    public <U extends IMeasurable>
    boolean areEqual(
            QuantityModel<U> q1,
            QuantityModel<U> q2
    ) {

        validateOperands(q1, q2);

        double a =
                q1.getUnit()
                        .convertToBaseUnit(
                                q1.getValue()
                        );

        double b =
                q2.getUnit()
                        .convertToBaseUnit(
                                q2.getValue()
                        );

        boolean result =
                Math.abs(a - b) < 0.0001;

        saveEntity(
                q1,
                q2,
                "EQUALS",
                null
        );

        return result;
    }

    @Override
    public <U extends IMeasurable>
    QuantityModel<U> add(
            QuantityModel<U> q1,
            QuantityModel<U> q2
    ) {

        validateOperands(q1, q2);

        double a =
                q1.getUnit()
                        .convertToBaseUnit(
                                q1.getValue()
                        );

        double b =
                q2.getUnit()
                        .convertToBaseUnit(
                                q2.getValue()
                        );

        double resultBase = a + b;

        double resultValue =
                q1.getUnit()
                        .convertFromBaseUnit(
                                resultBase
                        );

        QuantityModel<U> result =
                new QuantityModel<>(
                        roundOff(resultValue),
                        q1.getUnit()
                );

        saveEntity(
                q1,
                q2,
                "ADD",
                result
        );

        return result;
    }

    @Override
    public <U extends IMeasurable>
    QuantityModel<U> subtract(
            QuantityModel<U> q1,
            QuantityModel<U> q2
    ) {

        validateOperands(q1, q2);

        double a =
                q1.getUnit()
                        .convertToBaseUnit(
                                q1.getValue()
                        );

        double b =
                q2.getUnit()
                        .convertToBaseUnit(
                                q2.getValue()
                        );

        double resultBase = a - b;

        double resultValue =
                q1.getUnit()
                        .convertFromBaseUnit(
                                resultBase
                        );

        QuantityModel<U> result =
                new QuantityModel<>(
                        roundOff(resultValue),
                        q1.getUnit()
                );

        saveEntity(
                q1,
                q2,
                "SUBTRACT",
                result
        );

        return result;
    }

    @Override
    public <U extends IMeasurable>
    double divide(
            QuantityModel<U> q1,
            QuantityModel<U> q2
    ) {

        validateOperands(q1, q2);

        if (q2.getValue() == 0) {

            throw new QuantityMeasurementException(
                    "Cannot divide by zero"
            );
        }

        double result =
                q1.getValue() / q2.getValue();

        saveEntity(
                q1,
                q2,
                "DIVIDE",
                null
        );

        return roundOff(result);
    }

    @Override
    public List<QuantityMeasurementEntity>
    getHistory() {

        return repository.findAll();
    }

    private <U extends IMeasurable>
    void validateSingle(
            QuantityModel<U> q,
            U targetUnit
    ) {

        if (q == null || targetUnit == null) {

            throw new QuantityMeasurementException(
                    "Quantity or target unit cannot be null"
            );
        }
    }

    private <U extends IMeasurable>
    void validateOperands(
            QuantityModel<U> q1,
            QuantityModel<U> q2
    ) {

        if (q1 == null || q2 == null) {

            throw new QuantityMeasurementException(
                    "Quantities cannot be null"
            );
        }

        if (
                !q1.getUnit()
                        .getClass()
                        .equals(
                                q2.getUnit().getClass()
                        )
        ) {

            throw new QuantityMeasurementException(
                    "Units are different"
            );
        }
    }

    private double roundOff(
            double value
    ) {

        return Math.round(value * 100.0)
                / 100.0;
    }

    private <U extends IMeasurable>
    void saveEntity(
            QuantityModel<U> thisQuantity,
            QuantityModel<U> thatQuantity,
            String operation,
            QuantityModel<U> result
    ) {

        try {

            QuantityMeasurementEntity entity =
                    new QuantityMeasurementEntity();

            entity.setThisValue(
                    thisQuantity.getValue()
            );

            entity.setThisUnit(
                    thisQuantity.getUnit().toString()
            );

            entity.setThisMeasurementType(
                    thisQuantity.getUnit()
                            .getClass()
                            .getSimpleName()
            );

            if (thatQuantity != null) {

                entity.setThatValue(
                        thatQuantity.getValue()
                );

                entity.setThatUnit(
                        thatQuantity.getUnit().toString()
                );

                entity.setThatMeasurementType(
                        thatQuantity.getUnit()
                                .getClass()
                                .getSimpleName()
                );
            }

            entity.setOperation(operation);

            if (result != null) {

                entity.setResultValue(
                        result.getValue()
                );

                entity.setResultUnit(
                        result.getUnit().toString()
                );

                entity.setResultMeasurementType(
                        result.getUnit()
                                .getClass()
                                .getSimpleName()
                );

                entity.setResultString(
                        result.toString()
                );
            }

            repository.save(entity);

        } catch (Exception e) {

            throw new QuantityMeasurementException(
                    "Failed to persist quantity measurement",
                    e
            );
        }
    }
}