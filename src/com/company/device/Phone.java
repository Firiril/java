package com.company.device;

public class Phone extends Device {

    Double screenSize;
    String operationSystem;

    public Phone(String model, String brand, int yearOfProduction, Double screenSize, String operationSystem) {
        super(model, brand, yearOfProduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }


    @Override
    public void turnOn() {

        if (this.isOn) {
            System.out.println("Telefon jest już włączony");

        } else {
            System.out.println("Telefon uruchomił się. System pracuje...");
            this.isOn = true;
        }
    }
}
