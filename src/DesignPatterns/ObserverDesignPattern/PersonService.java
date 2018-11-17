package DesignPatterns.ObserverDesignPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Observables Design Pattern
 */
public class PersonService implements Observer {

    private Person person;

    public PersonService(Person person){
        this.person = person;
    };

    public void changeAge(int newAge){

        person.setAge(newAge);

    }

    @Override
    public void update(Observable o, Object arg ){
        Person person = (Person) arg;
        System.out.println("Observer got the message. Age :" + person.getAge() );
    }

}
