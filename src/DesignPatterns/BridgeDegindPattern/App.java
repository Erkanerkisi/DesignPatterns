package DesignPatterns.BridgeDegindPattern;

public class App {

    public static void main(String[] args) {

        Shape rc = new Circle(100,100, 10, new RedCircle());
        Shape gc = new Circle(101,101, 5, new GreenCircle());

        rc.draw();
        gc.draw();

    }
}