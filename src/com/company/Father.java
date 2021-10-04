package com.company;

import com.sun.tools.attach.AgentInitializationException;

public class Father extends Grandfather {
    private String work, car;

    public Father(String name, String heigh, String skin, Hobbi hobbi, String work, String car) {
        super(name, heigh, skin, hobbi);
        this.work = work;
        this.car = car;
    }

    public Father(String name, String heigh, String skin, Hobbi hobbi) {
        super(name, heigh, skin, hobbi);
    }

    public String getWork() {
        return work;
    }

    public String getCar() {
        return car;
    }

    private void newBook() {
        System.out.println("Отец купил книгу");
    }

    public void newBook(String bookName, String autor) {
        System.out.println("Отец купил книгу : " + bookName + " model: " + autor);
    }

    public void newBook(String bookName) {
        System.out.println("Отец купил книг : " + bookName);
    }

    public void getInfo(){
        System.out.println(getName() + " height: " + getHeigh() + " skin: " + getSkin() + " hobbi: " + getHobbi ().getName());
    }
}
