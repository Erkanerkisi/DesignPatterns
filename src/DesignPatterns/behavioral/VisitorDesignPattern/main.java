package DesignPatterns.behavioral.VisitorDesignPattern;

public class main {

    public static void main(String[] args) {
        Visitor v = new FaxVisitor();
        Printer p = new HPPrinter();

        p.accept(v);
        p.print();

        v = new CallVisitor();
        p.accept(v);
        p.print();
    }
}