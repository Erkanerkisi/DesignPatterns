package DesignPatterns.behavioral.IteratorDesignPattern;

import java.util.ArrayList;

public class Efes implements Takim {


    private ArrayList<Oyuncu> takim;

    public Efes() {
        takim = new ArrayList<>();
        takim.add(new Oyuncu());
        takim.add(new Oyuncu());
        takim.add(new Oyuncu());
    }

    public ArrayList<Oyuncu> getTakim() {
        return takim;
    }

    public void setTakim(ArrayList<Oyuncu> takim) {
        this.takim = takim;
    }

    @Override
    public CustomIterator getIterator() {
        return new ArrayListCustomIterator(takim);
    }
}
