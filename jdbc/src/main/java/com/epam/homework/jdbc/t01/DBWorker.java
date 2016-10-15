package com.epam.homework.jdbc.t01;

import java.io.*;
import java.sql.*;

public class DBWorker {
    private Connection connection;

    public void initConnection(String driverPath, String url) {
        try {
            Class.forName(driverPath);
            connection = DriverManager.getConnection(url);
            /*Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE Contacts  (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    "first_name VARCHAR(60) NOT NULL);");
            statement.executeUpdate("INSERT INTO Contacts (first_name) VALUES ('Chris');");
            statement.executeUpdate("INSERT INTO Contacts (first_name) VALUES ('Vasya');");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Contacts");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
            }
            resultSet.close();
            statement.close();
            connection.close();*/
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void initSql(String path) {
        File file = new File(path);
        char[] buf = new char[(int) file.length()];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
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

    public Connection getConnection() {
        return this.connection;
    }
}