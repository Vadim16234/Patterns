package org.example.creatingPatterns.abstractFactory;

public class EuKeyboard implements Keyboard{
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void println() {
        System.out.println("Print line");
    }
}
