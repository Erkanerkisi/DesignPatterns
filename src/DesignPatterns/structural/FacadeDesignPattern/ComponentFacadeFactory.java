package DesignPatterns.structural.FacadeDesignPattern;

public class ComponentFacadeFactory {

    public static ComponentFacade create() {
        return new ComponentFacadeImpl();
    }
}
