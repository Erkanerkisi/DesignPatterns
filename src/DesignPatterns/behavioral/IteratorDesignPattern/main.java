package DesignPatterns.behavioral.IteratorDesignPattern;

public class main {

    public static void main(String[] args) {
        Takim fener = new Fener();
        Takim efes = new Fener();
        CustomIterator ci = fener.getIterator();
        System.out.println(ci.hasNext());
        ci = efes.getIterator();
        System.out.println(ci.hasNext());
    }
}