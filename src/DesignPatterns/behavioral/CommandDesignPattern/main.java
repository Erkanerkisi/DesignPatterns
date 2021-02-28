package DesignPatterns.behavioral.CommandDesignPattern;

public class main {

    public static void main(String[] args) {


        // verilen komut ile birlikte client sadece yapılması istenen şeyi söylüyor.
        // O komutun arka planda hangi nesneler ile iletişim kurması gerektiğini veya nesneleri bilmiyor.
        // yapılması gereken işin client tarafından değil alıcı tarafından bilinmesi yeterli.

        Kumanda kumanda = new Kumanda();

        kumanda.butonlar[0].execute();

        kumanda.butonlar[1].execute();

        kumanda.butonlar[2].execute();

    }
}
