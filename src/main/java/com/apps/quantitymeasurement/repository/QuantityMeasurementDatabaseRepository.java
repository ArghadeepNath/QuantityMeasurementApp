package com.apps.quantitymeasurement.repository;

import com.apps.quantitymeasurement.entity.QuantityMeasurementEntity;
import com.apps.quantitymeasurement.exception.DatabaseException;
import com.apps.quantitymeasurement.util.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuantityMeasurementDatabaseRepository
        implements IQuantityMeasurementRepository {

    @Override
    public void save(
            QuantityMeasurementEntity entity
    ) {

        String sql =
                """
                INSERT INTO quantity_measurement_entity
                (
                    this_value,
                    this_unit,
                    this_measurement_type,
                    that_value,
                    that_unit,
                    that_measurement_type,
                    operation,
                    result_value,
                    result_unit,
                    result_measurement_type,
                    result_string,
                    is_error,
                    error_message
                )
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;

        try (
                Connection connection =
                        ConnectionPool.getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql)
        ) {

            statement.setDouble(
                    1,
                    entity.getThisValue()
            );

            statement.setString(
                    2,
                    entity.getThisUnit()
            );

            statement.setString(
                    3,
                    entity.getThisMeasurementType()
            );

            statement.setDouble(
                    4,
                    entity.getThatValue()
            );

            statement.setString(
                    5,
                    entity.getThatUnit()
            );

            statement.setString(
                    6,
                    entity.getThatMeasurementType()
            );

            statement.setString(
                    7,
                    entity.getOperation()
            );

            statement.setDouble(
                    8,
                    entity.getResultValue()
            );

            statement.setString(
                    9,
                    entity.getResultUnit()
            );

            statement.setString(
                    10,
                    entity.getResultMeasurementType()
            );

            statement.setString(
                    11,
                    entity.getResultString()
            );

            statement.setBoolean(
                    12,
                    entity.isError()
            );

            statement.setString(
                    13,
                    entity.getErrorMessage()
            );

            statement.executeUpdate();

        } catch (SQLException e) {

            throw new DatabaseException(
                    "Failed to save quantity measurement",
                    e
            );
        }
    }

    @Override
    public List<QuantityMeasurementEntity> findAll() {

        List<QuantityMeasurementEntity> entities =
                new ArrayList<>();

        String sql =
                """
                SELECT *
                FROM quantity_measurement_entity
                ORDER BY created_at DESC
                """;

        try (
                Connection connection =
                        ConnectionPool.getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql);

                ResultSet resultSet =
                        statement.executeQuery()
        ) {

            while (resultSet.next()) {

                QuantityMeasurementEntity entity =
                        new QuantityMeasurementEntity();

                entity.setId(
                        resultSet.getLong("id")
                );

                entity.setThisValue(
                        resultSet.getDouble("this_value")
                );

                entity.setThisUnit(
                        resultSet.getString("this_unit")
                );

                entity.setThisMeasurementType(
                        resultSet.getString(
                                "this_measurement_type"
                        )
                );

                entity.setThatValue(
                        resultSet.getDouble("that_value")
                );

                entity.setThatUnit(
                        resultSet.getString("that_unit")
                );

                entity.setThatMeasurementType(
                        resultSet.getString(
                                "that_measurement_type"
                        )
                );

                entity.setOperation(
                        resultSet.getString("operation")
                );

                entity.setResultValue(
                        resultSet.getDouble("result_value")
                );

                entity.setResultUnit(
                        resultSet.getString("result_unit")
                );

                entity.setResultMeasurementType(
                        resultSet.getString(
                                "result_measurement_type"
                        )
                );

                entity.setResultString(
                        resultSet.getString("result_string")
                );

                entity.setError(
                        resultSet.getBoolean("is_error")
                );

                entity.setErrorMessage(
                        resultSet.getString("error_message")
                );

                entities.add(entity);
            }

        } catch (SQLException e) {

            throw new DatabaseException(
                    "Failed to fetch quantity measurements",
                    e
            );
        }

        return entities;
    }
}