package com.apps.quantitymeasurement.mapper;

import com.apps.quantitymeasurement.dto.QuantityDTO;
import com.apps.quantitymeasurement.model.QuantityModel;
import com.apps.quantitymeasurement.unit.IMeasurable;
import com.apps.quantitymeasurement.util.UnitFactory;

public class QuantityMapper {

    public static QuantityModel<IMeasurable> toModel(
            QuantityDTO dto
    ) {

        if (dto == null) {
            throw new IllegalArgumentException(
                    "DTO cannot be null"
            );
        }

        IMeasurable unit =
                UnitFactory.getUnit(dto.getUnit());

        return new QuantityModel<>(
                dto.getValue(),
                unit
        );
    }

    public static QuantityDTO toDTO(
            QuantityModel<? extends IMeasurable> model
    ) {

        if (model == null) {
            throw new IllegalArgumentException(
                    "Model cannot be null"
            );
        }

        return new QuantityDTO(
                model.getValue(),
                model.getUnit().toString()
        );
    }
}