package com.apps.quantitymeasurementapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "quantity_measurement_entity")

public class QuantityMeasurementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double thisValue;

    private String thisUnit;

    private String thisMeasurementType;

    private double thatValue;

    private String thatUnit;

    private String thatMeasurementType;

    private String operation;

    private double resultValue;

    private String resultUnit;

    private String resultMeasurementType;

    @Column(length = 1000)
    private String resultString;

    private boolean isError;

    @Column(length = 1000)
    private String errorMessage;

    public QuantityMeasurementEntity() {
    }

}