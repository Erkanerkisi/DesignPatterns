package DesignPatterns.OpenClosedDesignPattern;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
