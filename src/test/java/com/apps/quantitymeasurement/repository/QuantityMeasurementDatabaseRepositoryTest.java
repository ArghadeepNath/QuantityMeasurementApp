package com.apps.quantitymeasurement.repository;

import com.apps.quantitymeasurement.entity.QuantityMeasurementEntity;
import com.apps.quantitymeasurement.util.ConnectionPool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementDatabaseRepositoryTest {

    private QuantityMeasurementDatabaseRepository repository;

    @BeforeEach
    void setup() throws Exception {

        repository =
                new QuantityMeasurementDatabaseRepository();

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
    void testSaveMeasurement() {

        QuantityMeasurementEntity entity =
                new QuantityMeasurementEntity();

        entity.setThisValue(1.0);

        entity.setThisUnit("FEET");

        entity.setThisMeasurementType(
                "LengthUnit"
        );

        entity.setOperation("COMPARE");

        entity.setResultString("Equal");

        repository.save(entity);

        List<QuantityMeasurementEntity>
                result =
                repository.findAll();

        assertEquals(1, result.size());
    }

    @Test
    void testFindAllInitiallyEmpty() {

        List<QuantityMeasurementEntity>
                result =
                repository.findAll();

        assertTrue(result.isEmpty());
    }

    @Test
    void testMultipleSaves() {

        QuantityMeasurementEntity e1 =
                new QuantityMeasurementEntity();

        QuantityMeasurementEntity e2 =
                new QuantityMeasurementEntity();

        e1.setThisValue(1.0);
        e1.setThisUnit("FEET");
        e1.setThisMeasurementType("LengthUnit");
        e1.setOperation("ADD");

        e2.setThisValue(2.0);
        e2.setThisUnit("INCHES");
        e2.setThisMeasurementType("LengthUnit");
        e2.setOperation("SUBTRACT");

        repository.save(e1);

        repository.save(e2);

        assertEquals(
                2,
                repository.findAll().size()
        );
    }
}