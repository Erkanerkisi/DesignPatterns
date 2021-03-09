package DesignPatterns.structural.ProxyDesignPattern;

import java.lang.reflect.Proxy;

public class main {

    public static void main(String[] args) {
        BankaHesabi bankaHesabiProxy = (BankaHesabi) Proxy.newProxyInstance(BankaHesabiImplInvocationHandler.class.getClassLoader(),
                new Class[]{BankaHesabi.class},
                new BankaHesabiImplInvocationHandler(new BankaHesabiImpl()));
        bankaHesabiProxy.paraYatir(150);
        bankaHesabiProxy.paraCek(100);
    }
}
