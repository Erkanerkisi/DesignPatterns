package DesignPatterns.creational.BuilderDesignPattern;


public class Marka {
    private String marka;

    public Marka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Marka{" +
                "marka='" + marka + '\'' +
                '}';
    }
}
