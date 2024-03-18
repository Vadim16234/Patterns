package org.example.structuralPatterns.decorator;

class DecoratorRunner {
    public static void main(String[] args) {
        PrinterInterface printerInterface = new QuotesDecorator(new Printer("Hello"));
        printerInterface.print();

        System.out.println();

        PrinterInterface printerInterface1 = new LeftBracketDecorator(new Printer("Hello"));
        printerInterface1.print();

        System.out.println();

        PrinterInterface printerInterface2 = new RightBracketDecorator(new Printer("Hello"));
        printerInterface2.print();

        System.out.println();

        PrinterInterface printer = new LeftBracketDecorator(new RightBracketDecorator(new Printer("Hello")));
        printer.print();

        System.out.println();

        PrinterInterface print = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(
                new Printer("Hello"))));
        print.print();
    }
}
