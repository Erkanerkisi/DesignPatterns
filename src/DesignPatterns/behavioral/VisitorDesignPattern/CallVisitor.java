package DesignPatterns.behavioral.VisitorDesignPattern;

public class CallVisitor implements Visitor {
    @Override
    public void visit(HPPrinter s) {
        System.out.println("HPprinter Call my wife");
    }

    @Override
    public void visit(LexmarkPrinter s) {
        System.out.println("LexmarkPrinter Call my wife");
    }
}
