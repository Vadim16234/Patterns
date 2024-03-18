package org.example.behavirolPatterns.visitor;

class VisitorRunner {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor hooligan = new HooliganVisitor();

        body.accept(hooligan);
        engine.accept(hooligan);

        Visitor machanic = new MechanicVisitor();
        body.accept(machanic);
        engine.accept(machanic);
    }
}
