package DesignPatterns.creational.BuilderDesignPattern;

public class SiparisManager {
    private SiparisBuilder siparisBuilder;

    public void createOrder(String marka, String model, String renk, Integer beygir) {
        if (marka.equals("Audi")) {
            siparisBuilder = new AudiSiparisBuilder();
            siparisBuilder.setMarka(marka);
            siparisBuilder.setModel(model);
            siparisBuilder.setBeygir(beygir);
            siparisBuilder.setRenk(renk);
        } else if (marka.equals("Ford")) {
            siparisBuilder = new FordSiparisBuilder();
            siparisBuilder.setMarka(marka);
            siparisBuilder.setModel(model);
            siparisBuilder.setBeygir(beygir);
            siparisBuilder.setRenk(renk);
        } else throw new RuntimeException();
    }

    public void printOrder() {
        System.out.println(siparisBuilder.getAraba().getMarka());
        System.out.println(siparisBuilder.getAraba().getModel());
        System.out.println(siparisBuilder.getAraba().getRenk());
        System.out.println(siparisBuilder.getAraba().getBeygir());
    }
}
