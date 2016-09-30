package com.epam.homework.iostreams.t04;

import lombok.*;

import java.io.Serializable;


public class Film implements Serializable{
    private String title;
    private Actor[] mainActors;

    public Film(String title) {
        this.title = title;
    }

    public void setMainActors(Actor... actors) {
        mainActors=actors;
    }

    public Actor[] getMainActors() {
        return mainActors;
    }
    @Override
    public String toString(){
        return title;
    }
}
