package DesignPatterns.FactoryDesignPattern;

import DesignPatterns.FactoryDesignPattern.Book;
import DesignPatterns.FactoryDesignPattern.BookFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("FirstApp");

        BookFactory factory = new BookFactory();
        Book book = factory.getBook("economic");
        System.out.println(book.read());
    }
}
