package DesignPatterns.structural.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Kasa implements Parca {

    List<Parca> lists = new ArrayList<>();

    void parcaEkle(Parca p) {
        lists.add(p);
    }

    @Override
    public double fiyatiNedir() {

        double toplam = 0;

        for (Parca p : lists) {
            toplam += p.fiyatiNedir();
        }
        return toplam;
    }
}
