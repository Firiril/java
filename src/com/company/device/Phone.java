package com.company.device;

public class Phone {
    String producer;
    String model;
    Double screenSize;
    String operationSystem;

    public Phone(String producer, String model, Double screenSize, String operationSystem) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
