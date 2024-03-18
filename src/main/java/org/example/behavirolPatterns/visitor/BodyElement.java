package org.example.behavirolPatterns.visitor;

class BodyElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
