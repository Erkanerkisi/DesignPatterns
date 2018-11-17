package DesignPatterns.FactoryDesignPattern;

public class BookFactory {

    public Book getBook(String category){

        if(category.equalsIgnoreCase("economic")){
            return new EconomicsBook();

        } else if(category.equalsIgnoreCase("romantic")){
            return new RomanticBook();
        }

        return null;
    }

}
