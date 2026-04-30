package com.apps.quantitymeasurement;

import java.util.function.DoubleBinaryOperator;

public class Quantity<U extends IMeasurable> {

    private double value;
    private U unit;

    public Quantity(double value, U unit) {

        if (unit == null)
            throw new IllegalArgumentException("Unit cannot be null");

        if (Double.isNaN(value) || Double.isInfinite(value))
            throw new IllegalArgumentException("Invalid value: must be a finite number");

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public U getUnit() {
        return unit;
    }

    public Quantity<U> convertTo(U targetUnit) {
        if (targetUnit == null)
            throw new IllegalArgumentException("Target unit cannot be null");

        double base = unit.convertToBaseUnit(value);
        double converted = targetUnit.convertFromBaseUnit(base);

        return new Quantity<>(converted, targetUnit);
    }

    public Quantity<U> add(Quantity<U> other) {
        return performOperation(other, this.unit, ArithmeticOperation.ADD, true);
    }

    public Quantity<U> add(Quantity<U> other, U targetUnit) {
        return performOperation(other, targetUnit, ArithmeticOperation.ADD, true);
    }

    public Quantity<U> subtract(Quantity<U> other) {
        return performOperation(other, this.unit, ArithmeticOperation.SUBTRACT, true);
    }

    public Quantity<U> subtract(Quantity<U> other, U targetUnit) {
        return performOperation(other, targetUnit, ArithmeticOperation.SUBTRACT, true);
    }

    public double divide(Quantity<U> other) {
        validateOperands(other, null, false);

        double a = unit.convertToBaseUnit(this.value);
        double b = other.unit.convertToBaseUnit(other.value);

        return ArithmeticOperation.DIVIDE.compute(a, b);
    }

    private enum ArithmeticOperation {
        ADD((a, b) -> a + b),
        SUBTRACT((a, b) -> a - b),
        DIVIDE((a, b) -> {
            if (b == 0.0)
                throw new ArithmeticException("Division by zero");
            return a / b;
        });

        private final DoubleBinaryOperator operation;

        ArithmeticOperation(DoubleBinaryOperator operation) {
            this.operation = operation;
        }

        public double compute(double a, double b) {
            return operation.applyAsDouble(a, b);
        }
    }

    private void validateOperands(Quantity<U> other, U targetUnit, boolean targetRequired) {

        if (other == null)
            throw new IllegalArgumentException("Units cannot be null");

        if (targetRequired && targetUnit == null)
            throw new IllegalArgumentException("Units cannot be null");

        if (!this.unit.getClass().equals(other.unit.getClass()))
            throw new IllegalArgumentException("Units are different");

        if (!Double.isFinite(this.value) || !Double.isFinite(other.value))
            throw new IllegalArgumentException("Invalid values");
    }

    private Quantity<U> performOperation(Quantity<U> other, U targetUnit, ArithmeticOperation operation, boolean roundResult) {

        validateOperands(other, targetUnit, true);

        double a = unit.convertToBaseUnit(this.value);
        double b = other.unit.convertToBaseUnit(other.value);

        double resultBase = operation.compute(a, b);

        double result = targetUnit.convertFromBaseUnit(resultBase);

        if (roundResult) {
            result = roundOff(result);
        }

        return new Quantity<>(result, targetUnit);
    }

    @Override
    public int hashCode() {
        double base = unit.convertToBaseUnit(value);
        return Double.valueOf(base).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Quantity<?> other = (Quantity<?>) obj;

        if (!this.getUnit().getClass().equals(other.getUnit().getClass())) {
            return false;
        }

        double a = this.getUnit().convertToBaseUnit(this.getValue());
        double b = other.getUnit().convertToBaseUnit((other.getValue()));

        return Double.compare(a, b) == 0;
    }

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit + ")";
    }

    private double roundOff(double val) {
        return Math.round(val * 100.0) / 100.0;
    }
}