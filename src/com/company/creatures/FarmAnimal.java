package com.company.creatures;

public class FarmAnimal extends Animal implements edible {
    private Boolean isAlive = true;

    public FarmAnimal(String species, Double weight, String name) {
        super(species, weight, name);
    }

    @Override
    public void beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println("Zwierze:" + this.name + " - zostało zjedzone :S");

    }

    @Override
    public void feed(Double foodWeight) {
        if (this.weight <= 0)
            System.out.println("Zwierze jest martwe i karmienie mu nie pomoże :S");
        else
            this.weight += foodWeight;
    }
}
