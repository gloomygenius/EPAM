package com.epam.homework.iostreams.t04;

import lombok.*;

import java.io.Serializable;

@SuppressWarnings("WeakerAccess")
@Setter
@Getter
public class Actor implements Serializable {
    String name;
    int age;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        return age == actor.age && name.equals(actor.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
