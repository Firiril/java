package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Husky", "Goni ogon");

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Gzik";
        me.pet = dog;

        System.out.println("Zwierzak nazywa się " + me.pet.name);


        me.vehicle = new Car("Red", "e46", "BMW", 420.0);
        me.setSalary(1500.0);
        System.out.println(me.getSalary());
        System.out.println(me.getSalary());


        me.setSalary(1800.0);
        System.out.println(me.getSalary());
        me.setSalary(-1800.0);
        System.out.println(me.getSalary());


    }
}
