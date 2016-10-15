package com.epam.homework.iostreams.t04;

import lombok.Getter;
import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("WeakerAccess")
@Getter
public class FilmEditor {
    private ArrayList<Film> films = new ArrayList<>();

    public void addFilm(Film film) {
        films.add(film);
    }

    public String getAllFilms() {
        StringBuilder builder = new StringBuilder("В колекции есть фильмы:\r\n");
        int index = 0;
        for (Film film :
                films) {
            builder.append(film.toString()).append(" [").append(index++).append("]").append("\r\n");
        }
        return builder.toString();
    }

    public void removeFilm(int index) {
        films.remove(index);
    }


    public void serialize(String path) {
        try (ObjectOutput ser = new ObjectOutputStream(new FileOutputStream(new File(path)))) {
            ser.writeObject(films);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserialize(String path) {
        try (ObjectInput ser = new ObjectInputStream(new FileInputStream(new File(path)))) {
            //noinspection unchecked
            films = (ArrayList<Film>) ser.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}