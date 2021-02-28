package DesignPatterns.creational.AbstractFactoryDesignPattern;

public class ConcreteImpl2 implements AbstractFactory {
    @Override
    public Elma getElma() {
        return new YesilElma();
    }

    @Override
    public Biber getBiber() {
        return new KirmiziBiber();
    }
}
