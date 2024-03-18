package org.example.structuralPatterns.flyweight;

class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") : рисуем точку ");
    }
}
