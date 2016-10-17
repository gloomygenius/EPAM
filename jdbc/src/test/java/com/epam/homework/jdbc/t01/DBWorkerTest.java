package com.epam.homework.jdbc.t01;

import org.junit.*;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DBWorkerTest {
    private static DBWorker dbWorker;

    @BeforeClass
    public static void init() throws SQLException, IOException {
        dbWorker = new DBWorker();
        dbWorker.initConnection("org.h2.Driver", "jdbc:h2:mem:test");
        dbWorker.initSql("src/test/resources/init.sql");
    }

    @Test
    public void selectTest() throws Exception {
        Collection<Contact> contacts;
        //noinspection SqlNoDataSourceInspection,SqlResolve
        try (Statement statement = dbWorker.getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT id,first_name, last_name, birth_date FROM Contact")) {
            contacts = new HashSet<>();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + resultSet.getString("first_name"));
                contacts.add(new Contact(
                        resultSet.getInt(1),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getDate("birth_date").toLocalDate()));
            }
        }
        Assert.assertTrue(contacts.contains(
                new Contact(1L, "Chris", "Schaefer", LocalDate.parse("1981-05-03"))
        ));
    }

    @SuppressWarnings({"SqlNoDataSourceInspection", "SqlResolve"})
    @Test
    public void updateTest() {
        try (Statement statement = dbWorker.getConnection().createStatement()) {
            statement.executeUpdate(
                    "UPDATE Contact SET first_name='Chack' WHERE last_name='Schaefer'");
            try (ResultSet resultSet = statement.executeQuery("SELECT first_name FROM Contact WHERE last_name='Schaefer'")) {
                while (resultSet.next()) {
                    assertThat(resultSet.getString("first_name"), is("Chack"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings({"SqlNoDataSourceInspection", "SqlResolve"})
    @Test
    public void deleteTableTest() {
        try (Statement statement = dbWorker.getConnection().createStatement()) {
            statement.executeUpdate("CREATE TABLE example");
            statement.executeUpdate(
                    "DROP TABLE example");
            DatabaseMetaData databaseMetaData = dbWorker.getConnection().getMetaData();
            ResultSet rs = databaseMetaData.getTables(null, null, "%", null);
            HashSet<String> tables = new HashSet<>();
            while (rs.next()) {
                tables.add(rs.getString(3));
            }
            assertFalse(tables.contains("Contact"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}