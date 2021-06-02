package com.company;

import java.time.LocalTime;

public class Human {
    String firstName;
    String lastName;
    String phone;
    Animal pet;
    Car vehicle;


    private LocalTime SalaryCheckTime;
    private Double salary;
    private Double lastCheckedSalary;

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
}
