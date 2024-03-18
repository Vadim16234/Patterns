package org.example.structuralPatterns.bridge;

abstract class Car {
    Make make;
    public Car(Make m) {
        make = m;
    }

    abstract void showDetails();
}
