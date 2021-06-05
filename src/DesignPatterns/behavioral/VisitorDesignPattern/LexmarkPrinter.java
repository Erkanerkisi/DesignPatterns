package DesignPatterns.behavioral.VisitorDesignPattern;

public class LexmarkPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Lexmark printer prints");
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
