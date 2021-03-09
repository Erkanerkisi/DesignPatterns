package DesignPatterns.structural.FacadeDesignPattern;

public class main {

    public static void main(String[] args) {
        ComponentFacade componentFacade = ComponentFacadeFactory.create();
        componentFacade.call();
    }
}
