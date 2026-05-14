package com.apps.quantitymeasurement.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseConfig {

    private static final Properties properties =
            new Properties();

    static {

        try (
                InputStream input =
                        DatabaseConfig.class
                                .getClassLoader()
                                .getResourceAsStream(
                                        "application.properties"
                                )
        ) {

            if (input == null) {

                throw new RuntimeException(
                        "application.properties not found"
                );
            }

            properties.load(input);

        } catch (IOException e) {

            throw new RuntimeException(
                    "Failed to load properties file",
                    e
            );
        }
    }

    private DatabaseConfig() {
    }

    public static String getProperty(
            String key
    ) {

        return properties.getProperty(key);
    }

    public static int getIntProperty(
            String key
    ) {

        return Integer.parseInt(
                properties.getProperty(key)
        );
    }

    public static boolean getBooleanProperty(
            String key
    ) {

        return Boolean.parseBoolean(
                properties.getProperty(key)
        );
    }
}