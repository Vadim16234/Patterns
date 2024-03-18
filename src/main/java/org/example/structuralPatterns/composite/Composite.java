package org.example.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

class Composite implements Shape{
    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        components.add(component);
    }

    @Override
    public void draw() {
        for (Shape el : components) {
            el.draw();
        }
    }
}
