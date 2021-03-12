package com.company;

import java.io.File;

public class Animal {
    final String Spieces;
    private Double weight;
    String name;
    File pic;

    public Animal(String spieces, Double weight, String name) {
        Spieces = spieces;
        this.weight = weight;
        this.name = name;
    }

    public Animal(String spieces, String name) {
        Spieces = spieces;
        this.name = name;
        this.weight = kalkulatorWagi(spieces);

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

    private double kalkulatorWagi(String spieces) {
        switch (spieces) {
            case "Husky":
                return 5.0;
            case "Cat":
                return 6.0;
            default:
                return 7.0;

        }
    }


    public void showWeight() {
        System.out.println(this.weight);
    }


}
