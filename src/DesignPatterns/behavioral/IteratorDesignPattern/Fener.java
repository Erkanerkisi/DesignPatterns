package DesignPatterns.behavioral.IteratorDesignPattern;

public class Fener implements Takim {

    private Oyuncu[] takim = new Oyuncu[5];

    public Fener() {
        takim[0] = new Oyuncu();
        takim[1] = new Oyuncu();
        takim[2] = new Oyuncu();
        takim[3] = new Oyuncu();
        takim[4] = new Oyuncu();
    }

    public Oyuncu[] getTakim() {
        return takim;
    }

    @Override
    public CustomIterator getIterator() {
        return new ArrayCustomIterator(takim);
    }
}
