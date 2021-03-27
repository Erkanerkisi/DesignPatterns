package DesignPatterns.creational.PrototypeDesignPattern;

public class Adres extends AdresPrototype {
    public Adres(String sokak,String no,String semt,String sehir) {
        setNo(no);
        setSehir(sehir);
        setSemt(semt);
        setSokak(sokak);
    }
}
