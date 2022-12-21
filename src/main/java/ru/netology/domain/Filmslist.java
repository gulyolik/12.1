package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Filmslist {
    public static int length;
    public int id;
    public String name;


    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }
}
