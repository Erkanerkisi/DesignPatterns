package DesignPatterns.behavioral.VisitorDesignPattern;

public class FaxVisitor implements Visitor {

    @Override
    public void visit(HPPrinter s) {
        System.out.println("HPPrinter Faxing");
    }

    @Override
    public void visit(LexmarkPrinter s) {
        System.out.println("LexmarkPrinter Faxing");
    }
}
