package DesignPatterns.behavioral.StrategyDesignPattern;

public class BeanToFileStrategy implements Strategy {
    @Override
    public void saveBean() {
        System.out.println("Bean to file strategy");
    }
}
