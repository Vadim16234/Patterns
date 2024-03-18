package org.example.structuralPatterns.bridge;

class Skoda implements Make {
    @Override
    public void setMake() {
        System.out.println("Skoda");
    }
}
