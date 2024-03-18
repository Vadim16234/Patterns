package org.example.creatingPatterns.abstractFactory;

public class EuMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Click mouse");
    }

    @Override
    public void dblclick() {
        System.out.println("Mouse double click");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Scroll up");
        } else if (direction < 0) {
            System.out.println("Scroll Down");
        } else {
            System.out.println("No scrolling");
        }
    }
}
