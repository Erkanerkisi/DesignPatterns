package DesignPatterns.structural.AdaptorDesignPattern;

public class StandartSinif implements BirInterface {

    @Override
    public void call() {
        System.out.println("Call Standart");
    }
}
