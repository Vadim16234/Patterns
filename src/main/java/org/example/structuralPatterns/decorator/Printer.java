package org.example.structuralPatterns.decorator;

class Printer implements PrinterInterface{
    String value;
    public Printer(String value) {
        this.value = value;
    }
    @Override
    public void print() {
        System.out.print(value);
    }
}
