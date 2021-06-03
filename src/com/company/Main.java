package com.company;


import com.company.device.Car;
import com.company.device.Phone;

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


        Car car1 = new Car("e46", "BMW", 2004, "niebieski", 180.0, 30000.0);
        Car car2 = new Car("e46", "BMW", 2004, "niebieski", 180.0, 30000.0);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("Porównuje dwa obiekty Car o tych samych polach: ");
        System.out.println(car1.equals(car2));

        System.out.println("Hashcode car1: " + car1.hashCode());
        System.out.println("Hashcode car2: " + car2.hashCode());

        Phone iphone = new Phone("13 s max pro ultra", "Apple", 2021, 6.4, "iOS");
        System.out.println("To string car1: " + car1.toString());
        System.out.println("To string dog: " + me.pet.toString());
        System.out.println("To string me: " + me.toString());
        System.out.println("To string phone: " + iphone.toString());

        iphone.turnOn();
        car1.turnOn();
        iphone.turnOn();
        car1.turnOn();



        /*
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        me.setSalary(5000.0);
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        me.setSalary(50000.0);
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        */


    }
}
