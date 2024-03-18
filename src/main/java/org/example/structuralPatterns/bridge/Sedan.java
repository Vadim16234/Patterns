package org.example.structuralPatterns.bridge;

class Sedan extends Car{

    public Sedan(Make m) {
        super(m);
    }

    @Override
    void showDetails() {
        System.out.println("Sedan");
        make.setMake();
    }
}
