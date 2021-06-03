package com.company.creatures;

public class Pet extends Animal {
    public Pet(String species, Double weight, String name) {
        super(species, weight, name);
    }

    @Override
    public void feed(Double foodWeight) {
        if (this.weight <= 0)
            System.out.println("Zwierze jest martwe i karmienie mu nie pomoże :S");
        else
            this.weight += foodWeight * 0.8;
    }
}
