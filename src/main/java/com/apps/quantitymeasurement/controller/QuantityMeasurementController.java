package com.apps.quantitymeasurement.controller;

import com.apps.quantitymeasurement.entity.QuantityDTO;
import com.apps.quantitymeasurement.entity.QuantityMeasurementEntity;
import com.apps.quantitymeasurement.entity.QuantityModel;
import com.apps.quantitymeasurement.service.IQuantityMeasurementService;
import com.apps.quantitymeasurement.unit.IMeasurable;
import com.apps.quantitymeasurement.util.UnitFactory;

import java.util.List;

public class QuantityMeasurementController {

    private final IQuantityMeasurementService service;

    public QuantityMeasurementController(
            IQuantityMeasurementService service
    ) {
        this.service = service;
    }

    public QuantityDTO convert(
            QuantityDTO sourceDTO,
            String targetUnitName
    ) {

        QuantityModel<IMeasurable> sourceModel =
                toModel(sourceDTO);

        IMeasurable targetUnit =
                UnitFactory.getUnit(targetUnitName);

        QuantityModel<IMeasurable> result =
                service.convert(sourceModel, targetUnit);

        return toDTO(result);
    }

    public boolean areEqual(
            QuantityDTO dto1,
            QuantityDTO dto2
    ) {

        QuantityModel<IMeasurable> model1 =
                toModel(dto1);

        QuantityModel<IMeasurable> model2 =
                toModel(dto2);

        return service.areEqual(model1, model2);
    }

    public QuantityDTO add(
            QuantityDTO dto1,
            QuantityDTO dto2
    ) {

        QuantityModel<IMeasurable> model1 =
                toModel(dto1);

        QuantityModel<IMeasurable> model2 =
                toModel(dto2);

        QuantityModel<IMeasurable> result =
                service.add(model1, model2);

        return toDTO(result);
    }

    public QuantityDTO subtract(
            QuantityDTO dto1,
            QuantityDTO dto2
    ) {

        QuantityModel<IMeasurable> model1 =
                toModel(dto1);

        QuantityModel<IMeasurable> model2 =
                toModel(dto2);

        QuantityModel<IMeasurable> result =
                service.subtract(model1, model2);

        return toDTO(result);
    }

    public double divide(
            QuantityDTO dto1,
            QuantityDTO dto2
    ) {

        QuantityModel<IMeasurable> model1 =
                toModel(dto1);

        QuantityModel<IMeasurable> model2 =
                toModel(dto2);

        return service.divide(model1, model2);
    }

    public List<QuantityMeasurementEntity> getHistory() {
        return service.getHistory();
    }

    private QuantityModel<IMeasurable> toModel(
            QuantityDTO dto
    ) {

        return new QuantityModel<>(
                dto.getValue(),
                UnitFactory.getUnit(dto.getUnit())
        );
    }

    private QuantityDTO toDTO(
            QuantityModel<IMeasurable> model
    ) {

        return new QuantityDTO(
                model.getValue(),
                model.getUnit().toString()
        );
    }
}