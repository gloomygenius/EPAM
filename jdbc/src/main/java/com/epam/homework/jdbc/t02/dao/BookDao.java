package com.epam.homework.jdbc.t02.dao;

import com.epam.homework.jdbc.t02.model.Book;
import sun.security.jca.GetInstance;

import java.util.Collection;
import java.util.Optional;

@FunctionalInterface
public interface BookDao {
    Collection<Book> getAll();

    default Optional<Book> getById(long id) {
        return getAll().stream()
                .filter(instance -> instance.getId() == id)
                .findAny();
    }

    default void deleteById(int id){};
}
