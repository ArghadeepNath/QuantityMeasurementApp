package com.apps.quantitymeasurementapp.controller;

import com.apps.quantitymeasurementapp.entity.QuantityDTO;
import com.apps.quantitymeasurementapp.entity.QuantityMeasurementEntity;
import com.apps.quantitymeasurementapp.entity.QuantityModel;
import com.apps.quantitymeasurementapp.service.IQuantityMeasurementService;
import com.apps.quantitymeasurementapp.unit.IMeasurable;
import com.apps.quantitymeasurementapp.util.UnitFactory;
import com.apps.quantitymeasurementapp.entity.QuantityOperationRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quantity")
@CrossOrigin(origins = "http://localhost:5173")
public class QuantityMeasurementController {

    private final IQuantityMeasurementService service;

    public QuantityMeasurementController(
            IQuantityMeasurementService service
    ) {
        this.service = service;
    }

    @PostMapping("/convert")
    public QuantityDTO convert(
            @RequestBody QuantityOperationRequest request
    )
    {
        QuantityModel<IMeasurable> sourceModel =
                toModel(request.getQ1());

        IMeasurable target =
                UnitFactory.getUnit(
                        request.getQ2().getUnit()
                );

        QuantityModel<IMeasurable> result =
                service.convert(sourceModel, target);

        return toDTO(result);
    }

    @PostMapping("/compare")
    public boolean areEqual(
            @RequestBody List<QuantityDTO> dtos
    ) {

        QuantityModel<IMeasurable> model1 =
                toModel(dtos.get(0));

        QuantityModel<IMeasurable> model2 =
                toModel(dtos.get(1));

        return service.areEqual(model1, model2);
    }

    @PostMapping("/add")
    public QuantityDTO add(
            @RequestBody List<QuantityDTO> dtos
    ) {

        QuantityModel<IMeasurable> model1 =
                toModel(dtos.get(0));

        QuantityModel<IMeasurable> model2 =
                toModel(dtos.get(1));

        QuantityModel<IMeasurable> result =
                service.add(model1, model2);

        return toDTO(result);
    }

    @PostMapping("/subtract")
    public QuantityDTO subtract(
            @RequestBody List<QuantityDTO> dtos
    ) {

        QuantityModel<IMeasurable> model1 =
                toModel(dtos.get(0));

        QuantityModel<IMeasurable> model2 =
                toModel(dtos.get(1));

        QuantityModel<IMeasurable> result =
                service.subtract(model1, model2);

        return toDTO(result);
    }

    @PostMapping("/divide")
    public double divide(
            @RequestBody List<QuantityDTO> dtos
    ) {

        QuantityModel<IMeasurable> model1 =
                toModel(dtos.get(0));

        QuantityModel<IMeasurable> model2 =
                toModel(dtos.get(1));

        return service.divide(model1, model2);
    }

    @GetMapping("/history")
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