package com.epam.homework.jdbc.t01;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by Василий on 11.10.2016.
 */
public class DBWorkerTest {
    Collection<Contact> contacts;
    static DBWorker dbWorker;

    @BeforeClass
    public static void init() throws SQLException, IOException {
        dbWorker = new DBWorker();
        dbWorker.initConnection("org.h2.Driver", "jdbc:h2:mem:test");
        dbWorker.initSql("src/test/resources/init.sql");
    }

    @Test
    public void go() throws Exception {
        try (Connection con = dbWorker.getConnection();
             Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery(
                     "SELECT id,first_name, last_name, birth_date FROM Contact");
        ) {
            contacts = new HashSet<>();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1)+resultSet.getString("first_name"));
                contacts.add(new Contact(
                        resultSet.getInt(1),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getDate("birth_date").toLocalDate()));
            }

            Assert.assertTrue(contacts.contains(
                    new Contact(1L, "Chris", "Schaefer", LocalDate.parse("1981-05-03"))
            ));
        }
    }
}