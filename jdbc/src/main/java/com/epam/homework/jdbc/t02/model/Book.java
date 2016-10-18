package com.epam.homework.jdbc.t02.model;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Book {
    private final long id;
    private final String title;
    private final String bookType;
    private final String author;
    private final int yearOfPub;
}