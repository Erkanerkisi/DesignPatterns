package DesignPatterns.creational.AbstractFactoryDesignPattern;

public class YesilElma implements Elma{
    @Override
    public void getType() {
        System.out.println("Yeşil elma");
    }
}
