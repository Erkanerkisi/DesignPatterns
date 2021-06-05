package DesignPatterns.behavioral.VisitorDesignPattern;

public interface Visitor {

    void visit(HPPrinter s);

    void visit(LexmarkPrinter s);

}
