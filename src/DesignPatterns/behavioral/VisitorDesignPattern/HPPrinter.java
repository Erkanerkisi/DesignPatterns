package DesignPatterns.behavioral.VisitorDesignPattern;

public class HPPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("HP printer prints");
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
