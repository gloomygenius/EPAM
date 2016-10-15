package com.epam.homework.iostreams.t04;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Arrays;


@SuppressWarnings("WeakerAccess")
@Getter
public class Film implements Serializable {
    private String title;
    private Actor[] mainActors;

    public Film(String title) {
        this.title = title;
    }

    public void setMainActors(Actor... actors) {
        mainActors = actors;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        if (!title.equals(film.title)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(mainActors, film.mainActors);

    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + Arrays.hashCode(mainActors);
        return result;
    }
}
