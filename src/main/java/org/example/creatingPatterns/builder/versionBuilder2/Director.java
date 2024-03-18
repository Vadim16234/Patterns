package org.example.creatingPatterns.builder.versionBuilder2;

class Director {
    CarBuilder builder;
    void setBuilder(CarBuilder b) {
        builder = b;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}
