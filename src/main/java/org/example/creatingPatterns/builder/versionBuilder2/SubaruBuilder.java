package org.example.creatingPatterns.builder.versionBuilder2;

public class SubaruBuilder extends CarBuilder{
    @Override
    void buildMake() {
        car.setMake("Subaru Legacy B4");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setSpeedMax(260);
    }
}
