package org.example.structuralPatterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class FlyweightRunner {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("точка"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("круг"));

        Random random = new Random();
        for (Shape shape : shapes) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            shape.draw(x, y);
        }
    }
}
