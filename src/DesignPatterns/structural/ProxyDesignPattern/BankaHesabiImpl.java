package DesignPatterns.structural.ProxyDesignPattern;

public class BankaHesabiImpl implements BankaHesabi {

    @Override
    public void paraYatir(double para) {
        System.out.println("Para Yatirildi " + para);
    }

    @Override
    public void paraCek(double para) {
        System.out.println("Para Çekildi " + para);
    }
}
