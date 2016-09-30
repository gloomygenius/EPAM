package com.epam.homework.iostreams.t04;

import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;

public class FilmEditor {
    private ArrayList<Film> films = new ArrayList<>();

    public void addFilm(Film film) {
        films.add(film);
    }

    public String getAllFilms() {
        StringBuilder builder = new StringBuilder("В колекции есть фильмы:\r\n");
        for (Film film :
                films) {
            builder.append(film.toString()).append("\r\n");
        }
        return builder.toString();
    }

    public void removeFilm(int index) {
        films.remove(index);
    }

    @SneakyThrows
    public void serialize(String path) {
        try (ObjectOutput ser = new ObjectOutputStream(new FileOutputStream(new File(path)))) {
        ser.writeObject(films);
        }
    }

    @SneakyThrows
    public void deserialize(String path) {
        try (ObjectInput ser = new ObjectInputStream(new FileInputStream(new File(path)))) {
            films=(ArrayList<Film>) ser.readObject();
        }
    }
}