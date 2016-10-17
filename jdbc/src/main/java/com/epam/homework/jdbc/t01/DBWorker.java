package com.epam.homework.jdbc.t01;

import lombok.Getter;

import java.io.*;
import java.sql.*;
import java.util.HashSet;

@SuppressWarnings("WeakerAccess")
public class DBWorker {
    @Getter
    private Connection connection;

    public void initConnection(String driverPath, String url) {
        try {
            Class.forName(driverPath);
            connection = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void initSql(String path) {
        File file = new File(path);
        char[] buf = new char[(int) file.length()];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            //noinspection ResultOfMethodCallIgnored
            reader.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] initState = new String(buf).split(";");
        try (Statement statement = connection.createStatement()) {
            for (String state : initState) {
                statement.executeUpdate(state);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}