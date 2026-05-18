package com.apps.quantitymeasurementapp.app;

import com.apps.quantitymeasurementapp.controller.QuantityMeasurementController;
import com.apps.quantitymeasurementapp.entity.QuantityDTO;
import com.apps.quantitymeasurementapp.entity.QuantityMeasurementEntity;
import com.apps.quantitymeasurementapp.repository.IQuantityMeasurementRepository;
import com.apps.quantitymeasurementapp.repository.QuantityMeasurementCacheRepository;
import com.apps.quantitymeasurementapp.repository.QuantityMeasurementDatabaseRepository;
import com.apps.quantitymeasurementapp.service.IQuantityMeasurementService;
import com.apps.quantitymeasurementapp.service.QuantityMeasurementServiceImpl;
import com.apps.quantitymeasurementapp.util.ApplicationConfig;
import com.apps.quantitymeasurementapp.util.ConnectionPool;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;

import java.util.List;
import java.util.logging.Logger;

public class QuantityMeasurementApp {

    private static final Logger logger = Logger.getLogger(QuantityMeasurementApp.class.getName());

    private static IQuantityMeasurementRepository repository;

    public static void main(String[] args) {

        try {

            initializeRepository();
            initializeSchema();

            IQuantityMeasurementService service =new QuantityMeasurementServiceImpl(repository);

            QuantityMeasurementController controller =new QuantityMeasurementController(service);

            deleteAllMeasurements();

            QuantityDTO q1 =new QuantityDTO(1.0,"FEET");

            QuantityDTO q2 =new QuantityDTO(12.0,"INCHES");

            logger.info("Equality Result: "+ controller.areEqual(q1, q2));

            logger.info("Addition Result: "+ controller.add(q1, q2));

            logger.info("Subtraction Result: "+ controller.subtract(q1, q2));

            logger.info("Division Result: "+ controller.divide(q1, q2));

            logger.info("Conversion Result: "+ controller.convert(q1,"INCHES"));

            List<QuantityMeasurementEntity> history = controller.getHistory();

            logger.info("Total Measurements Stored: "+ history.size());

            for (QuantityMeasurementEntity entity: history) {
                logger.info(entity.toString());
            }

        } catch (Exception e) {
            logger.severe("Application Error: "+ e.getMessage());
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }

    private static void initializeRepository() {
        if (ApplicationConfig.isDatabaseRepository()) {
            repository =new QuantityMeasurementDatabaseRepository();
            logger.info("Using Database Repository");
        } else {

            repository =
                    new QuantityMeasurementCacheRepository();

            logger.info(
                    "Using Cache Repository"
            );
        }
    }


    private static void initializeSchema() {

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

            logger.info(
                    "Database schema initialized"
            );

        } catch (Exception e) {

            logger.severe(
                    "Failed to initialize schema"
            );

            e.printStackTrace();
        }
    }

    private static void closeResources() {

        try {

            ConnectionPool.shutdown();

            logger.info(
                    "Resources closed successfully"
            );

        } catch (Exception e) {

            logger.warning(
                    "Failed to close resources"
            );
        }
    }

    private static void deleteAllMeasurements() {

        logger.info(
                "Repository cleanup initialized"
        );
    }
}