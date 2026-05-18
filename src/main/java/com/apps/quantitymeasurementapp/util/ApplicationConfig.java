package com.apps.quantitymeasurementapp.util;

public class ApplicationConfig {

    private ApplicationConfig() {
    }

    public static String getRepositoryType() {

        return DatabaseConfig.getProperty(
                "repository.type"
        );
    }

    public static boolean isDatabaseRepository() {

        return "database".equalsIgnoreCase(
                getRepositoryType()
        );
    }

    public static boolean isCacheRepository() {

        return "cache".equalsIgnoreCase(
                getRepositoryType()
        );
    }
}