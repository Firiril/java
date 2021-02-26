package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.spieces = "dog";
        dog.name = "Haiku";
        dog.weight = 8.0;
        dog.feed();
        dog.feed();

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Gzik";
        me.pet = dog;

        System.out.println("Zwierzak nazywa się " + me.pet.name);


        Phone IPhone = new Phone();
        IPhone.screenSize = 4.5;
        IPhone.producer = "Apple";
        IPhone.model = "6S";
        IPhone.operationSystem = "ios";

        // write your code here
    }
}
