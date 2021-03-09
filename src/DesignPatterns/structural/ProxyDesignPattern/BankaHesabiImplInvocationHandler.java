package DesignPatterns.structural.ProxyDesignPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BankaHesabiImplInvocationHandler implements InvocationHandler {

    private BankaHesabi bankaHesabi;

    public BankaHesabiImplInvocationHandler(BankaHesabi bankaHesabi) {
        this.bankaHesabi = bankaHesabi;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().startsWith("paraCek")) {
            throw new RuntimeException("Para Çekilemez!!!");
        }

        return method.invoke(bankaHesabi,args);
    }
}
