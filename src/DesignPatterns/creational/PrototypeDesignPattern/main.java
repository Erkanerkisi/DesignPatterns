package DesignPatterns.creational.PrototypeDesignPattern;

public class main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Adres adres = new Adres("sokak","123","asd", "İst");
        System.out.println(adres.toString());

        Adres adres2 = (Adres) adres.clone();
        adres2.setNo("321");
        adres2.setSehir("qqd");
        adres2.setSemt("qwe");
        adres2.setSokak("qwe");

        System.out.println(adres2.toString());
    }
}
