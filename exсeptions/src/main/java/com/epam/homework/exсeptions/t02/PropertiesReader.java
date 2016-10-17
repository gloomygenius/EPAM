package com.epam.homework.exсeptions.t02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("WeakerAccess")
public class PropertiesReader {

    public static String getProperties(String path, String key) {
        String value = null;

        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream(path))) {
            Properties properties = new Properties();
            properties.load(stream);

            try {
                value = properties.getProperty(key);
            } catch (NullPointerException e) {
                System.err.println("Нет ключа в properties: "+key);
            }

        } catch (IOException e) {
            System.err.println("Файл "+path+" не найден");
        }
        return value;
    }
}