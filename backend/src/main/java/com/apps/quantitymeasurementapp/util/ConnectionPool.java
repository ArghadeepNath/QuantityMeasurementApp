package com.apps.quantitymeasurementapp.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {

    private static final HikariDataSource dataSource;

    static {

        try {

            HikariConfig config =
                    new HikariConfig();

            config.setJdbcUrl(
                    DatabaseConfig.getProperty("db.url")
            );

            config.setUsername(
                    DatabaseConfig.getProperty("db.username")
            );

            config.setPassword(
                    DatabaseConfig.getProperty("db.password")
            );

            config.setDriverClassName(
                    DatabaseConfig.getProperty("db.driver")
            );

            config.setMaximumPoolSize(
                    Integer.parseInt(
                            DatabaseConfig.getProperty(
                                    "db.hikari.maximum-pool-size"
                            )
                    )
            );

            config.setMinimumIdle(
                    Integer.parseInt(
                            DatabaseConfig.getProperty(
                                    "db.hikari.minimum-idle"
                            )
                    )
            );

            config.setConnectionTimeout(
                    Long.parseLong(
                            DatabaseConfig.getProperty(
                                    "db.hikari.connection-timeout"
                            )
                    )
            );

            config.setIdleTimeout(
                    Long.parseLong(
                            DatabaseConfig.getProperty(
                                    "db.hikari.idle-timeout"
                            )
                    )
            );

            config.setMaxLifetime(
                    Long.parseLong(
                            DatabaseConfig.getProperty(
                                    "db.hikari.max-lifetime"
                            )
                    )
            );

            config.setPoolName(
                    DatabaseConfig.getProperty(
                            "db.hikari.pool-name"
                    )
            );

            config.setConnectionTestQuery(
                    DatabaseConfig.getProperty(
                            "db.hikari.connection-test-query"
                    )
            );

            dataSource =
                    new HikariDataSource(config);

        } catch (Exception e) {

            throw new RuntimeException(
                    "Failed to initialize connection pool",
                    e
            );
        }
    }

    private ConnectionPool() {
    }

    public static Connection getConnection()
            throws SQLException {

        return dataSource.getConnection();
    }

    public static void shutdown() {

        if (dataSource != null) {
            dataSource.close();
        }
    }
}