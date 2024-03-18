package org.example.behavirolPatterns.templateMethod;

abstract class C {
    void templateMethod() {
        System.out.print("1");
        differ();
        System.out.print("3");
        differ2();
    }

    abstract void differ();
    abstract void differ2();

}
