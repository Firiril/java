package com.company;

public class Car {

    final public String model;
    final public String marka;
    public String color;
    public double power;

    public Car(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }

    public Car(String color, String model, String marka, double power) {
        this.color = color;
        this.model = model;
        this.marka = marka;
        this.power = power;
    }
}
