package org.example.creatingPatterns.builder.versionBuilder2;

public class FordMondeoBuilder extends CarBuilder{
    @Override
    void buildMake() {
        car.setMake("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setSpeedMax(210);
    }
}
