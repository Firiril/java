package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Husky", "Goni ogon");

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Gzik";
        me.pet = dog;

        System.out.println("Zwierzak nazywa się " + me.pet.name);


        me.pet.showWeight();
        me.pet.feed();
        me.pet.showWeight();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.showWeight();
        me.pet.feed();

        me.pet.feed();


        me.pet.showWeight();
    }
}
