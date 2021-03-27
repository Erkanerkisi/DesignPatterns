package DesignPatterns.creational.PrototypeDesignPattern;


public abstract class AdresPrototype implements Cloneable {

    private String sokak;
    private String no;
    private String semt;
    private String sehir;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSemt() {
        return semt;
    }

    public void setSemt(String semt) {
        this.semt = semt;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}
