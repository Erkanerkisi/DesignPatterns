package DesignPatterns.structural.CompositeDesignPattern;

public class main {

    public static void main(String[] args) {

        /*
        * Bir sistem bütünü ve parçaları arasındaki ilişkiyi modellemek için kullanılan bir patterndir.
        * Tüm sistem ve alt parçaları tek bir interfaceden türer ve iç içe dallanırlar. Interface üzerinde tanımlanan metod ile sistemin en alt parçasına kadar bilgi alınır.
        *
        * */

        Bilgisayar bilgisayar = new Bilgisayar();

        bilgisayar.parcaEkle(new Monitor());
        bilgisayar.parcaEkle(new Fare());

        Kasa kasa = new Kasa();
        kasa.parcaEkle(new Ram());
        kasa.parcaEkle(new Harddisk());
        bilgisayar.parcaEkle(kasa);

        System.out.println("Bilgisayar fiyatı: " + bilgisayar.fiyatiNedir());
        System.out.println("Kasa fiyatı: " + kasa.fiyatiNedir());
    }
}
