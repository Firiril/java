package com.company;

import com.company.device.Car;

import java.time.LocalTime;

public class Human {
    String firstName;
    String lastName;
    String phone;
    Animal pet;
    public Double cash;
    private Car vehicle;


    private LocalTime SalaryCheckTime;
    private Double salary;
    private Double lastCheckedSalary;


    public Car getVehicle() {
        return this.vehicle;
    }


    public void setVehicle(Car car) {

        if (car.getValue() < this.salary) {
            this.vehicle = car;
            System.out.println("Kupiłeś samochód za gotówkę");
        } else if (car.getValue() < this.salary * 12) {
            this.vehicle = car;
            System.out.println("Kupiłeś samochód na kredyt :C");
        } else {
            System.out.println("Ten samochód jest dla Ciebie za drogi!");
            System.out.println("Znajdź lepszą pracę!");
        }

    }

    public void setVehicle2(Car car) {

        this.vehicle = car;

    }

    public void addCash(Double value) {
        if (this.cash == null)
            this.cash = 0.0;
        this.cash += value;

    }


    public Double getSalary() {
        if (this.SalaryCheckTime != null) {
            System.out.println("Ostatnio dane o twojej wypłacie były wyświetlane: " + this.SalaryCheckTime);
            System.out.println("Twoja wypłata wynosiła wtedy: " + this.lastCheckedSalary);

        }

        this.SalaryCheckTime = LocalTime.now();
        this.lastCheckedSalary = this.salary;
        return salary;
    }

    public void setSalary(Double salary) {
        try {
            if (salary >= 0) {
                this.salary = salary;
                System.out.println("Nowe dane zostały wprowadzone do systamu.");
                System.out.println("Aneks jest do odebrania od pani Hani z kadr.");
                System.out.println("ZUS i US są wszechwiedzący ich oszukanie jest niemożiwe!");

            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Pensja nie może być ujemna");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                ", vehicle=" + vehicle +
                '}';
    }
}
