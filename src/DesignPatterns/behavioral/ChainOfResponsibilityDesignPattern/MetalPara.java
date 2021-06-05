package DesignPatterns.behavioral.ChainOfResponsibilityDesignPattern;

import java.util.ArrayList;

public abstract class MetalPara {


    private ArrayList<MetalPara> metalParaListesi = new ArrayList<>();
    /**
     * Metal paranın sahip olduğu değer. 5, 10, 50,
     * 100 Kurus olabilir
     */
    private int value;
    /**
     * Zincirde yeralan bir sonraki nesne
     */
    private MetalPara next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MetalPara getNext() {
        return next;
    }

    public MetalPara setNext(MetalPara next) {
        this.next = next;
        return this;
    }

    public void check(MetalPara para) {
        System.out.println("Sıradaki nesne sadece "
                + this + " işleyebilir.");
        if (para.getValue() != this.value) {
            System.out.println("Uymadı, zincirdeki "
                    + "bir " + "sonraki nesneye iletiyoruz.");
            if (getNext() != null) {
                getNext().check(para);
            } else {
                System.out.println("Zincirin sonundayız. "
                        + "" + "Metal para " + para.toString() + " "
                        + "bu otomat için uygun değil.");
            }
        } else {
            metalParaListesi.add(para);
            System.out.println("Otomat tarafından "
                    + this.toString() + " kabul edildi");
        }
    }

}
