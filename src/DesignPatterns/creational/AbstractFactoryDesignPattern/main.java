package DesignPatterns.creational.AbstractFactoryDesignPattern;

public class main {

    public static void main(String[] args) {
        // Elimde bir abstract factory var ve altında kalan elma ve biber oluşumlarını saklamış olduk.
        // Farklı nesne oluşturan factoryler istiyorsak abstract factory classını implement ederek bir concrete class daha oluşturabiliriz.
        AbstractFactory abstractFactory = new ConcreteImpl1();
        Biber b = abstractFactory.getBiber();
        b.getType();

        // abstract factory dp birbirleriyle ilişkili nesneler oluşturma da kullanılır.

        AbstractFactory abstractFactory2 = new ConcreteImpl2();
        Biber b2 = abstractFactory2.getBiber();
        b2.getType();
    }
}
