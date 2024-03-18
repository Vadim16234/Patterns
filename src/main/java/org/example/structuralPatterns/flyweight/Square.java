package org.example.structuralPatterns.flyweight;

class Square implements Shape {
    int a = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") : рисуем квадрат со стороной " + a);

    }
}
