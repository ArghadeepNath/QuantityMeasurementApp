package com.apps.quantitymeasurement.controller;

import com.apps.quantitymeasurement.dto.QuantityDTO;
import com.apps.quantitymeasurement.entity.QuantityEntity;
import com.apps.quantitymeasurement.mapper.QuantityMapper;
import com.apps.quantitymeasurement.model.QuantityModel;
import com.apps.quantitymeasurement.service.QuantityService;
import com.apps.quantitymeasurement.unit.IMeasurable;
import com.apps.quantitymeasurement.util.UnitFactory;

import java.util.List;

public class QuantityController {

    private final QuantityService service;

    public QuantityController(
            QuantityService service
    ) {
        this.service = service;
    }

    public QuantityDTO convert(
            QuantityDTO sourceDTO,
            String targetUnitName
    ) {

        QuantityModel<IMeasurable> sourceModel =
                QuantityMapper.toModel(sourceDTO);

        IMeasurable targetUnit =
                UnitFactory.getUnit(targetUnitName);

        QuantityModel<IMeasurable> result =
                service.convert(sourceModel, targetUnit);

        return QuantityMapper.toDTO(result);
    }

    public boolean areEqual(
            QuantityDTO dto1,
            QuantityDTO dto2
    ) {

        QuantityModel<IMeasurable> model1 =
                QuantityMapper.toModel(dto1);

        QuantityModel<IMeasurable> model2 =
                QuantityMapper.toModel(dto2);

        return service.areEqual(model1, model2);
    }

    public QuantityDTO add(
            QuantityDTO dto1,
            QuantityDTO dto2
    ) {

        QuantityModel<IMeasurable> model1 =
                QuantityMapper.toModel(dto1);

        QuantityModel<IMeasurable> model2 =
                QuantityMapper.toModel(dto2);

        QuantityModel<IMeasurable> result =
                service.add(model1, model2);

        return QuantityMapper.toDTO(result);
    }

    public QuantityDTO subtract(
            QuantityDTO dto1,
            QuantityDTO dto2
    ) {

        QuantityModel<IMeasurable> model1 =
                QuantityMapper.toModel(dto1);

        QuantityModel<IMeasurable> model2 =
                QuantityMapper.toModel(dto2);

        QuantityModel<IMeasurable> result =
                service.subtract(model1, model2);

        return QuantityMapper.toDTO(result);
    }

    public double divide(
            QuantityDTO dto1,
            QuantityDTO dto2
    ) {

        QuantityModel<IMeasurable> model1 =
                QuantityMapper.toModel(dto1);

        QuantityModel<IMeasurable> model2 =
                QuantityMapper.toModel(dto2);

        return service.divide(model1, model2);
    }

    public List<QuantityEntity> getHistory() {
        return service.getHistory();
    }
}