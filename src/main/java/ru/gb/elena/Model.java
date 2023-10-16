package ru.gb.elena;

import java.util.Random;

public class Model {
    private int number;

    public Model() {
        this.number = new Random().nextInt(10);
    }

    public int getNumber() {
        return number;
    }
}
