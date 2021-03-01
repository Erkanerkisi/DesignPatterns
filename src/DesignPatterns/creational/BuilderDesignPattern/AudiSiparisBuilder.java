package DesignPatterns.creational.BuilderDesignPattern;

public class AudiSiparisBuilder extends SiparisBuilder {

    @Override
    public void setMarka(String marka) {
        getAraba().setMarka(new Marka(marka));
    }

    @Override
    public void setModel(String model) {
        getAraba().setModel(new Model(model));
    }

    @Override
    public void setRenk(String renk) {
        getAraba().setRenk(renk);
    }

    @Override
    public void setBeygir(Integer beygir) {
        getAraba().setBeygir(beygir);
    }
}
