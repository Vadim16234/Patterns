package org.example.structuralPatterns.bridge;

class Hatchback extends Car {
    public Hatchback(Make m) {
        super(m);
    }

    @Override
    void showDetails() {
        System.out.println("Hatchback");
        make.setMake();
    }
}
