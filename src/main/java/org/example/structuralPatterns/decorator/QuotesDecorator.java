package org.example.structuralPatterns.decorator;

class QuotesDecorator extends Decorator {
    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
