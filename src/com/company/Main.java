package com.company;

public class Main {

    public static void main(String[] args) {
        Father father = new Father("Akjol", " 2,", " Green",
                new Hobbi(3, "Tennis"), " Designer", "Tayota");
        Sun sun = new Sun("Ronaldo", "1,80", "Green", new Hobbi(2, "Footboll"), 18);
        Sun sun2 = new Sun("Messi", "1,60", "White", new Hobbi(3, "Footboll"), 17);
        father.getInfo();
        sun.getInfo();
        sun2.getInfo();
    }
}
