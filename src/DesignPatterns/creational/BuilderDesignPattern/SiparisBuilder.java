package DesignPatterns.creational.BuilderDesignPattern;

public abstract class SiparisBuilder {

    private Araba araba;

    public Araba getAraba() {
        if(araba == null) {
            araba = new Araba();
        }
        return araba;
    }

    public SiparisBuilder(){

    }

    public abstract void setMarka(String marka);
    public abstract void setModel(String model);
    public abstract void setRenk(String renk);
    public abstract void setBeygir(Integer beygir);

}
