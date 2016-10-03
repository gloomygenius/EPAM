package com.epam.homework.exeptions.t02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static String getProperties(String path, String key) {
        String value = null;

        try (FileInputStream stream = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(stream);

            try {
                value = properties.getProperty(key);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}