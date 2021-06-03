package com.company;


import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("pies", 10.0, "Ozor");

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Gzik";
        me.pet = dog;
        Human Gustav = new Human();
        Gustav.addCash(1500.0);
        me.pet.showWeight();

        me.pet.feed();
        me.pet.showWeight();
        me.pet.feed(0.3);
        me.pet.showWeight();
        FarmAnimal pig = new FarmAnimal("pig", 12.0, "Pocchi");
        pig.showWeight();
        pig.feed(1.1);
        pig.showWeight();
        pig.beEaten();
        pig.showWeight();
        pig.feed(1.1);

        /*

        me.addCash(130.0);


        Car car1 = new Car("e46", "BMW", 2004, "niebieski", 180.0, 30000.0);
        Car car2 = new Car("e46", "BMW", 2004, "niebieski", 180.0, 30000.0);
        me.setVehicle2(car1);

        Phone iphone = new Phone("13 s max pro ultra", "Apple", 2021, 6.4, "iOS");
*/
        /*
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
        */

        /*
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        me.setSalary(5000.0);
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        me.setSalary(50000.0);
        me.setVehicle(new Car("niebieski", "e92", "BMW", 180.0, 30000.0));
        */


    }
}
