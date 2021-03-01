package DesignPatterns.creational.SingletonDesignPattern;

public class Singleton {

    private static volatile Singleton instance;

    private static Object lock = new Object();

    private Singleton(){

    }

    public static Singleton getInstance(){
        // double check işlemi yapılır. Sebebi thread scheduler tarafından threadler bazı yerlerde bloklanabilir
        // bu da birden fazla instance yaratılmasına sebebiyet verir.
        // Hem dış kısımda instance kısıtı konur. Bu tüm threadlerin sync kısma gelmesini engeller
        // Hem de içerde bir instance kısıtı konur sebebi sync kısmında bir thread bloklanmış olabilir. tekrardan sync içerisinde
        // kontrol konur.
        
        if(instance == null){
            synchronized (lock){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void printThis() {
        System.out.println(instance);
    }
}
