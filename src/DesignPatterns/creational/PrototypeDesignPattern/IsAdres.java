package DesignPatterns.creational.PrototypeDesignPattern;

public class IsAdres extends AdresPrototype {

    private String isTel;

    public IsAdres(String sokak,String no,String semt,String sehir, String isTel) {
        setNo(no);
        setSehir(sehir);
        setSemt(semt);
        setSokak(sokak);
        this.isTel = isTel;
    }
}
