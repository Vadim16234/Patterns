package org.example.structuralPatterns.bridge;

class BridgeRunner {
    public static void main(String[] args) {
        Car car = new Sedan(new Skoda());
        car.showDetails();

        Car car1 = new Hatchback(new Kia());
        car1.showDetails();
    }
}
