package com.epam.homework.iostreams.t04;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FilmEditorTest {
    private FilmEditor filmEditor = new FilmEditor();
    private Film inception = new Film("Inception");
    private Film theDarkKnightRises = new Film("The Dark Knight Rises");
    private Actor diCaprio = new Actor("Leonardo Wilhelm DiCaprio");
    private Actor gordonLevitt = new Actor("Joseph Gordon-Levitt");
    private Actor tomHardy = new Actor("Tom Hardy");
    private ArrayList<Film> serObject;

    @Test
    public void addFilmTest() {
        inception.setMainActors(diCaprio, gordonLevitt);
        filmEditor.addFilm(inception);
        assertThat(filmEditor.getAllFilms(), is("В колекции есть фильмы:\r\nInception [0]\r\n"));
    }

    @Test
    public void serializeTest() {
        inception.setMainActors(diCaprio, gordonLevitt);
        filmEditor.addFilm(inception);
        serObject = filmEditor.getFilms();
        filmEditor.serialize("src\\test\\resources\\films.ser");
    }

    @Test
    public void deserializeTest() {
        filmEditor.addFilm(inception);
        serObject = filmEditor.getFilms();
        filmEditor.serialize("src\\test\\resources\\films.ser");
        filmEditor.deserialize("src\\test\\resources\\films.ser");
        System.out.println(serObject.toString());
        System.out.println(filmEditor.getFilms().toString());
        System.out.println(serObject.equals(filmEditor.getFilms()));
        assertTrue(serObject.equals(filmEditor.getFilms()));
    }

    @Test
    public void removeFilmTest() {
        inception.setMainActors(diCaprio, gordonLevitt);
        filmEditor.addFilm(inception);
        theDarkKnightRises.setMainActors(gordonLevitt, tomHardy);
        filmEditor.addFilm(theDarkKnightRises);
        assertThat(filmEditor.getAllFilms(), is("В колекции есть фильмы:\r\nInception [0]\r\n" +
                "The Dark Knight Rises [1]\r\n"));
        filmEditor.removeFilm(1);
        assertThat(filmEditor.getAllFilms(), is("В колекции есть фильмы:\r\nInception [0]\r\n"));
    }
}