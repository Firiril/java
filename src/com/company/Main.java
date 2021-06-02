package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Husky", "Goni ogon");

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Gzik";
        me.pet = dog;

        System.out.println("Zwierzak nazywa się " + me.pet.name);


        me.setSalary(1500.0);

        System.out.println(me.getSalary());

        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        me.setSalary(5000.0);
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        me.setSalary(50000.0);
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));


    }
}
