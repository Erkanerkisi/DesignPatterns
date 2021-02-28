package DesignPatterns.behavioral.StrategyDesignPattern;

public class main {

    public static void main(String[] args) {

    FileManager fileManager = new FileManager();
    fileManager.setStrategy(new SerializeStrategy());
    fileManager.save();
    }
}