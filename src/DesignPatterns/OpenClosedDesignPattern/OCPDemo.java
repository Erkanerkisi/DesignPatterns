package DesignPatterns.OpenClosedDesignPattern;

import java.util.*;

public class OCPDemo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL,5.0);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE,5.2);
        Product house = new Product("House", Color.BLUE, Size.LARGE,8);

        List<Product> products = new ArrayList<Product>();
        products.add(apple);
        products.add(tree);
        products.add(house);

        ProductFilter pf = new ProductFilter();
        System.out.println("Green products (old):");
        pf.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.name + " is green"));
        System.out.println("More than 5 of price products (old):");
        pf.filterByPrice(products, 5)
                .forEach(p -> System.out.println(" - " + p.name + " over 5"));

        // ^^ BEFORE

        // vv AFTER

        BetterFilter bf = new BetterFilter();
        System.out.println("Green products (new):");
        bf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large products:");
        bf.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(p -> System.out.println(" - " + p.name + " is large"));

        System.out.println("Large blue items:");
        bf.filter(products,
                new AndSpecification<>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.LARGE)
                ))
                .forEach(p -> System.out.println(" - " + p.name + " is large and blue"));

    }
}
