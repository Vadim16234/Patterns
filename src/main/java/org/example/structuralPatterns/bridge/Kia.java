package org.example.structuralPatterns.bridge;

class Kia implements Make {
    @Override
    public void setMake() {
        System.out.println("Kia");
    }
}
