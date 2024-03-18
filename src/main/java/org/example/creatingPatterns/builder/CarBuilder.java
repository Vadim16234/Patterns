package org.example.creatingPatterns.builder;

class CarBuilder {
    String m = "Default";
    Transmission t = Transmission.MANUAL;
    int s = 120;

    CarBuilder builderMake(String m) {
        this.m = m;
        return this;
    }

    CarBuilder builderTransmission(Transmission t) {
        this.t = t;
        return this;
    }

    CarBuilder builderMaxSpeed(int s) {
        this.s = s;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMake(m);
        car.setTransmission(t);
        car.setSpeedMax(s);
        return car;
    }
}
