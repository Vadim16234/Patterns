package org.example.structuralPatterns.decorator;

class LeftBracketDecorator extends Decorator {
    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        component.print();
    }
}
