package DesignPatterns.structural.AdaptorDesignPattern;

public class AdaptorSinif extends KullanilmakIstenenSinif implements BirInterface {
    @Override
    public void call() {
        call2();
    }
}
