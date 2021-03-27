package DesignPatterns.creational.PrototypeDesignPattern;

public class EvAdres extends AdresPrototype {

    private String evTel;

    public EvAdres(String sokak,String no,String semt,String sehir, String evTel) {
        setNo(no);
        setSehir(sehir);
        setSemt(semt);
        setSokak(sokak);
        this.evTel = evTel;
    }
}
