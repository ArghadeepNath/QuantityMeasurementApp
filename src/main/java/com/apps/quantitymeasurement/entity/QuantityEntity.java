package com.apps.quantitymeasurement.entity;

public class QuantityEntity {

    private Long id;

    private double value;

    private String unit;

    private String operation;

    public QuantityEntity(
            Long id,
            double value,
            String unit,
            String operation
    ) {
        this.id = id;
        this.value = value;
        this.unit = unit;
        this.operation = operation;
    }

    public Long getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public String getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        return "QuantityEntity{" +
                "id=" + id +
                ", value=" + value +
                ", unit='" + unit + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}