package org.example.behavirolPatterns.visitor;

interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
}
