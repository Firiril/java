package com.company.device;

public abstract class Device {
    final public String model;
    final public String brand;
    final public int yearOfProduction;
    protected Boolean isOn = false;

    public Device(String model, String brand, int yearOfProduction) {
        this.model = model;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", isOn=" + isOn +
                '}';
    }
}
