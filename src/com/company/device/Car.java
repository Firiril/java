package com.company.device;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.power, power) == 0 && Double.compare(car.value, value) == 0 && model.equals(car.model) && brand.equals(car.brand) && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, color, power, value);
    }

    public double getValue() {
        return this.value;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", value=" + value +
                '}';
    }
}
