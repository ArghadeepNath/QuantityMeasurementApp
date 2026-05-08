package com.apps.quantitymeasurement.app;

import com.apps.quantitymeasurement.controller.QuantityController;
import com.apps.quantitymeasurement.dto.QuantityDTO;
import com.apps.quantitymeasurement.repository.InMemoryQuantityRepository;
import com.apps.quantitymeasurement.repository.QuantityRepository;
import com.apps.quantitymeasurement.service.QuantityService;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityRepository repository =
                new InMemoryQuantityRepository();

        QuantityService service =
                new QuantityService(repository);

        QuantityController controller =
                new QuantityController(service);

        QuantityDTO q1 =
                new QuantityDTO(1.0, "FEET");

        QuantityDTO q2 =
                new QuantityDTO(12.0, "INCHES");

        System.out.println(
                "Equal: " +
                        controller.areEqual(q1, q2)
        );

        System.out.println(
                "Addition: " +
                        controller.add(q1, q2)
        );

        System.out.println(
                "Subtraction: " +
                        controller.subtract(q1, q2)
        );

        System.out.println(
                "Division: " +
                        controller.divide(q1, q2)
        );

        System.out.println(
                "Conversion: " +
                        controller.convert(q1, "INCHES")
        );

        System.out.println("\nHistory:");

        controller.getHistory()
                .forEach(System.out::println);
    }
}