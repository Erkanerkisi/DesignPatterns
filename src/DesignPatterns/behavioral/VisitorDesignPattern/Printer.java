package DesignPatterns.behavioral.VisitorDesignPattern;

public interface Printer {
    void print();

    void accept(Visitor v);
}
