package DesignPatterns.creational.SingletonDesignPattern;

public class main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Singleton.getInstance().printThis();
        }


    }
}
