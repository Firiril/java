package com.company;

import java.io.File;

public class Animal {
    final String Species;
    private Double weight;
    String name;
    File pic;

    public Animal(String species, Double weight, String name) {
        Species = species;
        this.weight = weight;
        this.name = name;
    }

    public Animal(String species, String name) {
        Species = species;
        this.name = name;
        this.weight = weightCalculator(species);

    }

    public void feed() {
        if (this.weight > 0) {
            this.weight = this.weight + 1;

        } else {
            System.out.println("Zwierzak nie zyje");
        }
    }

    public void walk() {
        if (this.weight > 0) {
            this.weight = this.weight - 1;
        } else {
            System.out.println("Zwierzak nie zyje");
        }
    }

    private double weightCalculator(String spieces) {
        return switch (spieces) {
            case "Husky" -> 5.0;
            case "Cat" -> 6.0;
            default -> 7.0;
        };
    }


    public void showWeight() {
        System.out.println(this.weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Spieces='" + Species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                '}';
    }
}
