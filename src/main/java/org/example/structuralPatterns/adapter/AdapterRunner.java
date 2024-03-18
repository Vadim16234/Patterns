package org.example.structuralPatterns.adapter;

class AdapterRunner {
    public static void main(String[] args) {
        // 1-й способ через наследование
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();

        System.out.println("----------------------------------");

        // 2-й способ через композицию
        VectorGraphicsInterface g2 = new VectorAdapterFromRaster2();
        g2.drawLine();
        g2.drawSquare();
    }
}
