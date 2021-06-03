package com.company.device;

import com.company.Human;
import com.company.selleable;

import java.util.Objects;

public class Car extends Device implements selleable {


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

    @Override
    public void sell(Human a, Human b, Double price) {
        if (a.getVehicle() != null) {
            if (b.getVehicle() == null) {
                if (b.cash > price) {
                    System.out.println("samochód sprzedany!");
                    b.setVehicle2(a.getVehicle());
                    a.setVehicle2(null);
                    a.cash += price;
                    b.cash -= price;
                } else {
                    System.out.println("Kupujący nie ma wystarczajaco pieniedzy");
                }
            } else {
                System.out.println("Kupujący ma już samochód");

            }
        } else {
            System.out.println("Sprzedający nie posiada samochodu");
        }
    }
}
