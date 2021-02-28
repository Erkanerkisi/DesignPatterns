package DesignPatterns.creational.AbstractFactoryDesignPattern;

public class ConcreteImpl1 implements AbstractFactory {
    @Override
    public Elma getElma() {
        return new KirmiziElma();
    }

    @Override
    public Biber getBiber() {
        return new DolmalikBiber();
    }
}
