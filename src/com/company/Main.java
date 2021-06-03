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
        Human Gustav = new Human();
        Gustav.addCash(1500.0);


        me.addCash(130.0);


        Car car1 = new Car("e46", "BMW", 2004, "niebieski", 180.0, 30000.0);
        Car car2 = new Car("e46", "BMW", 2004, "niebieski", 180.0, 30000.0);
        me.setVehicle2(car1);

        Phone iphone = new Phone("13 s max pro ultra", "Apple", 2021, 6.4, "iOS");

        if (me.pet != null) {
            System.out.println("Twoje zwierze: ");
            System.out.println(me.pet.toString());
        } else {
            System.out.println("Nie posiadasz zwierzecia");
        }
        if (Gustav.pet != null) {
            System.out.println("Zwierze Gustava: ");
            System.out.println(Gustav.pet.toString());
        } else {
            System.out.println("Gustav nie posiada zwierzecia");
        }

        System.out.println("mój cash: " + me.cash);
        System.out.println("Cash Gustava: " + Gustav.cash);
        me.pet.sell(me, Gustav, 500.5);
        System.out.println("po sprzedaży");
        System.out.println("mój cash: " + me.cash);
        System.out.println("Cash Gustava: " + Gustav.cash);
        if (me.pet != null) {
            System.out.println("Twoje zwierze: ");
            System.out.println(me.pet.toString());
        } else {
            System.out.println("Nie posiadasz zwierzecia");
        }
        if (Gustav.pet != null) {
            System.out.println("Zwierze Gustava: ");
            System.out.println(Gustav.pet.toString());
        } else {
            System.out.println("Gustav nie posiada zwierzecia");
        }


        System.out.println("mój cash: " + me.cash);
        System.out.println("Cash Gustava: " + Gustav.cash);
        car1.sell(me, Gustav, 25000.0);
        System.out.println("mój cash: " + me.cash);
        System.out.println("Cash Gustava: " + Gustav.cash);
        Gustav.addCash(26000.0);
        car1.sell(me, Gustav, 25000.0);
        System.out.println("mój cash: " + me.cash);
        System.out.println("Cash Gustava: " + Gustav.cash);
        System.out.println("Handel ludźmi jest nie możliwy, bo nie jest zaimplementowany!");















        /*
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        me.setSalary(5000.0);
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        me.setSalary(50000.0);
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        */


    }
}
