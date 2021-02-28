package DesignPatterns.creational.FactoryDesignPattern;

public class DocumentFactory {
    IDocument create(String type) {
        if (type.equals("Pdf")) {
            return new Pdf();
        } else if (type.equals("Word")) {
            return new Word();
        } else throw new RuntimeException("No type found!");
    }
}
