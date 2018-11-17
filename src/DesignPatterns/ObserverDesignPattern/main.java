package DesignPatterns.ObserverDesignPattern;

public class main {

    public static void main(String[] args) {

        Person p = new Person();
        p.setAge(17);
        p.setName("Erkan");
        p.setPositionName("Software Engineer");

        PersonService ps = new PersonService(p);
        p.addObserver(ps);

        ps.changeAge(18);
        ps.changeAge(19);
        ps.changeAge(20);
        ps.changeAge(21);

    }

}
