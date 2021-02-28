package DesignPatterns.creational.FactoryDesignPattern;

public class main {

    public static void main(String[] args) {

        // nesne oluşumlarını aldığımız parametreye göre başka bir yere taşıyoruz.
        // client arka tarafta oluşturulan nesneler ile ilgilenmiyor sadece ne istediğini söylüyor.

        DocumentFactory documentFactory = new DocumentFactory();
        IDocument document = documentFactory.create("Pdf");
        System.out.println(document.getType());


        IDocument document2 = documentFactory.create("Word");
        System.out.println(document2.getType());

    }
}
