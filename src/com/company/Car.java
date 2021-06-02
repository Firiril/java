package com.company;

public class Car {

    final public String model;
    final public String brand;
    public String color;
    public double power;
    private double value;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public Car(String color, String model, String brand, double power, double value) {
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.power = power;
        this.value = value;
    }


    public double getValue() {
        return this.value;
    }
}
