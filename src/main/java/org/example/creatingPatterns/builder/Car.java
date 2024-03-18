package org.example.creatingPatterns.builder;

class Car {
    String make;
    Transmission transmission;
    int speedMax;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", speedMax=" + speedMax +
                '}';
    }
}
