package com.epam.homework.jdbc.t02.dao.h2;

import com.epam.homework.jdbc.t02.dao.BookDao;
import com.epam.homework.jdbc.t02.model.Book;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Supplier;

@AllArgsConstructor
public class H2BookDao implements BookDao {

    private Supplier<Connection> connectionSupplier;

    @SneakyThrows
    @Override
    public Collection<Book> getAll() {
        Collection<Book> book = new HashSet<>();
        //noinspection SqlDialectInspection,SqlNoDataSourceInspection
        try (Connection connection = connectionSupplier.get();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT id, title, book_type, author, year_of_pub FROM Books")) {
            while (resultSet.next())
                book.add(
                        new Book(
                                resultSet.getLong("id"),
                                resultSet.getString("title"),
                                resultSet.getString("book_type"),
                                resultSet.getString("author"),
                                resultSet.getInt("year_of_pub")
                        ));
        }
        return book;
    }

    @Override
    public void deleteById(int id) {
        try (Connection connection = connectionSupplier.get();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate("DELETE FROM Books WHERE id="+id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}