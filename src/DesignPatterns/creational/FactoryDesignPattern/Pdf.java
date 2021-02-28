package DesignPatterns.creational.FactoryDesignPattern;

public class Pdf implements IDocument {
    @Override
    public String getType() {
        return "PDF";
    }
}
