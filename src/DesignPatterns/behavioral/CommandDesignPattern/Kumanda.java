package DesignPatterns.behavioral.CommandDesignPattern;

public class Kumanda {

    private final Tv tv;
    public final ICommand[] butonlar = new ICommand[3];

    public Kumanda() {
        this.tv = new Tv();
        butonlar[0] = new TvAcCommand(tv);
        butonlar[1] = new TvKapatCommand(tv);
        butonlar[2] = new KanalArttirCommand(tv);
    }

}
