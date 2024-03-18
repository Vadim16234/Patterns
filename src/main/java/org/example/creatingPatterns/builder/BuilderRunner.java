package org.example.creatingPatterns.builder;

class BuilderRunner {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .builderMake("Audi")
                .builderTransmission(Transmission.AUTO)
                .builderMaxSpeed(250)
                .build();
        System.out.println(car);
    }
}
