package DesignPatterns.ObserverDesignPattern;


import java.util.Observable;

public class Person extends Observable {

    private int age;
    private String name;
    private String positionName;

    public void setAge(int age) {
        this.age = age;
        setChanged();
        notifyObservers(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPositionName() {
        return positionName;
    }

}
