package com.company;

import com.company.Hobbi;

public class Grandfather {

    private String name, heigh, skin;
    private Hobbi hobbi;

    public Grandfather(String name, String heigh, String skin, Hobbi hobbi) {
        this.name = name;
        this.heigh = heigh;
        this.skin = skin;
        this.hobbi = hobbi;
    }

    public Hobbi getHobbi() {
        return hobbi;
    }

    public String getName() {
        return name;
    }

    public String getHeigh() {
        return heigh;
    }

    public String getSkin() {
        return skin;
    }
}






