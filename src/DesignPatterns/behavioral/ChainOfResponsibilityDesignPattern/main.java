package DesignPatterns.behavioral.ChainOfResponsibilityDesignPattern;

public class main {
    private static MetalPara zincir = null;

    public static void main(String[] args) {
        MetalPara birlira = new BirLira();
        MetalPara ellikurus = new ElliKurus();
        birlira.setNext(ellikurus);
        MetalPara besKurus = new BesKurus();
        ellikurus.setNext(besKurus);
        MetalPara birKurus = new BirKurus();
        besKurus.setNext(birKurus);

        zincir = birlira;
        MetalPara m1 = new BesKurus();
        zincir.check(m1);
    }
}