package DesignPatterns.structural.FacadeDesignPattern;

public class ComponentFacadeImpl implements ComponentFacade {
    @Override
    public void call() {
        BusinessService businessService = new BusinessService();
        businessService.call();
    }
}
