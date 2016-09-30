package com.epam.homework.iostreams.t04;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
public class Actor implements Serializable{
    String name;
    int age;

    public Actor(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return name;
    }
}
