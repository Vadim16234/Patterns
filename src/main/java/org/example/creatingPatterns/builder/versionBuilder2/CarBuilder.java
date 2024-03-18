package org.example.creatingPatterns.builder.versionBuilder2;

abstract class CarBuilder {
    Car car;
    void createCar() {
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    public Car getCar() {
        return car;
    }
}
