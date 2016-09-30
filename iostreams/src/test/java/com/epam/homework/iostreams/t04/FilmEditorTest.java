package com.epam.homework.iostreams.t04;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FilmEditorTest {
    private FilmEditor filmEditor=new FilmEditor();
    private Film inception=new Film("Inception");
    private Film theDarkKnightRises=new Film("The Dark Knight Rises");
    private Actor diCaprio=new Actor("Leonardo Wilhelm DiCaprio");
    private Actor gordonLevitt=new Actor("Joseph Gordon-Levitt");
    private Actor tomHardy=new Actor("Tom Hardy");

    @Test
    public void addFilmTest(){
        inception.setMainActors(diCaprio, gordonLevitt);
        filmEditor.addFilm(inception);
        assertThat(filmEditor.getAllFilms(),is("В колекции есть фильмы:\r\nInception\r\n"));
    }

    @Test
    public void serializeTest(){
        inception.setMainActors(diCaprio, gordonLevitt);
        filmEditor.addFilm(inception);
        filmEditor.serialize("src\\test\\resources\\films.ser");
    }

    @Test
    public void deserializeTest(){
        filmEditor.deserialize("src\\test\\resources\\films.ser");
    }

    @Test
    public void removeFilmTest(){
        inception.setMainActors(diCaprio, gordonLevitt);
        filmEditor.addFilm(inception);
        theDarkKnightRises.setMainActors(gordonLevitt, tomHardy);
        filmEditor.addFilm(theDarkKnightRises);
        filmEditor.removeFilm(1);
    }
}