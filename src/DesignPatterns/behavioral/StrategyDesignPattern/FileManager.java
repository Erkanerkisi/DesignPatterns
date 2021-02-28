package DesignPatterns.behavioral.StrategyDesignPattern;

public class FileManager {
    public Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void save(){
        strategy.saveBean();
    }
}
