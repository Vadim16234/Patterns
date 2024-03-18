package org.example.behavirolPatterns.templateMethod;

class A extends C{
    @Override
    void differ() {
        System.out.print("2");
    }

    @Override
    void differ2() {
        System.out.print("5");
    }
}
