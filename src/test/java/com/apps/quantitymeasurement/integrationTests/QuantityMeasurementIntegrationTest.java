package com.apps.quantitymeasurement.integrationTests;

import com.apps.quantitymeasurement.controller.QuantityMeasurementController;
import com.apps.quantitymeasurement.entity.QuantityDTO;
import com.apps.quantitymeasurement.repository.QuantityMeasurementDatabaseRepository;
import com.apps.quantitymeasurement.service.QuantityMeasurementServiceImpl;
import com.apps.quantitymeasurement.util.ConnectionPool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityMeasurementIntegrationTest {

    @BeforeEach
    void setup() throws Exception {

        try (
                Connection connection =
                        ConnectionPool.getConnection();

                Statement statement =
                        connection.createStatement()
        ) {

            String sql =
                    Files.readString(
                            Paths.get(
                                    "src/main/resources/db/schema.sql"
                            )
                    );

            statement.execute(sql);

            statement.execute(
                    "DELETE FROM quantity_measurement_history"
            );

            statement.execute(
                    "DELETE FROM quantity_measurement_entity"
            );
        }
    }

    @Test
    void testFullFlow() {

        QuantityMeasurementController controller =
                new QuantityMeasurementController(
                        new QuantityMeasurementServiceImpl(
                                new QuantityMeasurementDatabaseRepository()
                        )
                );

        QuantityDTO q1 =
                new QuantityDTO(
                        1.0,
                        "FEET"
                );

        QuantityDTO q2 =
                new QuantityDTO(
                        12.0,
                        "INCHES"
                );

        boolean result =
                controller.areEqual(q1, q2);

        assertTrue(result);
    }
}