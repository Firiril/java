package com.company.device;

import java.util.Objects;

public class Car extends Device {


    public String color;
    public double power;
    private double value;


    public Car(String model, String brand, int yearOfProduction) {
        super(model, brand, yearOfProduction);
    }

    public Car(String model, String brand, int yearOfProduction, String color, double power, double value) {
        super(model, brand, yearOfProduction);
        this.color = color;
        this.power = power;
        this.value = value;
    }

    @Override
    public void turnOn() {
        if (this.isOn) {
            System.out.println("Samochód już pracuje");

        } else {
            System.out.println("Silnik się uruchomił samochód pracuje");
            this.isOn = true;
        }
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
