package com.epam.homework.jdbc.t02.dao.h2;

import com.epam.homework.jdbc.t02.common.ConnectionPool;
import com.epam.homework.jdbc.t02.model.Book;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.function.Supplier;

import static org.junit.Assert.assertFalse;

public class H2BookDaoTest {
    private static final String PATH_TO_CONFIG = "src/test/resources/db.properties";
    private static final String PATH_TO_INIT = "src/test/resources/init02.sql";
    private static Supplier<Connection> connectionPool;

    @BeforeClass
    public static void init() throws SQLException, IOException {
        connectionPool = ConnectionPool.create(PATH_TO_CONFIG, PATH_TO_INIT);
    }

    @Test
    public void getAllTest() {
        Collection<Book> books = new H2BookDao(connectionPool).getAll();

        Assert.assertTrue(books.contains(
                new Book(1L, "Преступление и наказание", "Роман", "Достоевский Ф.М.", 1866))
        );
    }

    @Test
    public void deleteTest() {
        H2BookDao bookDao = new H2BookDao(connectionPool);
        bookDao.deleteById(2);
        Collection<Book> books = bookDao.getAll();
        assertFalse(books.contains(new Book(2L,"Чистый код", "Техническая литература", "Роберт Мартин",2014)));
    }
}