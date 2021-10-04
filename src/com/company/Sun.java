package com.company;

import com.company.Hobbi;

public final class Sun extends Father {
    private int age;

    public Sun(String name, String heigh, String skin, Hobbi hobbi, int age) {
        super(name, heigh, skin, hobbi);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void newBook(String bookName) {
        System.out.println("Сын поменял книгу " + bookName);
    }
    public void getInfo(){
        System.out.println(getName() + " haith: " + getHeigh() + " skin: " + getSkin() + " hobbi: " + getHobbi().getName()
                + " age: " + getAge());
    }

}
