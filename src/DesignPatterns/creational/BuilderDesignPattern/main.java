package DesignPatterns.creational.BuilderDesignPattern;

public class main {

    public static void main(String[] args) {

        SiparisManager manager = new SiparisManager();
        manager.createOrder("Ford", "Focus", "Beyaz", 70);
        manager.printOrder();
        manager = new SiparisManager();
        manager.createOrder("Audi", "A5", "Siyah", 270);
        manager.printOrder();

    }
}
