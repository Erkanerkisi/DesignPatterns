package DesignPatterns.behavioral.StrategyDesignPattern;

public class SerializeStrategy implements Strategy {
    @Override
    public void saveBean() {
        System.out.println("serialize strategy");
    }
}
