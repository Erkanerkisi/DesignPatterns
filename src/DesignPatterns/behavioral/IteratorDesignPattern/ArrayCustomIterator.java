package DesignPatterns.behavioral.IteratorDesignPattern;

import java.util.ArrayList;

public class ArrayCustomIterator implements CustomIterator {
    private Oyuncu[] list;
    private int position;

    public ArrayCustomIterator(Oyuncu[] list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object o = list[position];
        position++;
        return o;
    }

    @Override
    public boolean hasNext() {
        if(position >= list.length) {
            return false;
        };
        return true;
    }
}
