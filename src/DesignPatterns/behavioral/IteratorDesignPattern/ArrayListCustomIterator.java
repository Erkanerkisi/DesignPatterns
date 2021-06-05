package DesignPatterns.behavioral.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCustomIterator implements CustomIterator {
    private ArrayList<Oyuncu> list;
    private int position;

    public ArrayListCustomIterator(ArrayList<Oyuncu> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object o = list.get(position);
        position++;
        return o;
    }

    @Override
    public boolean hasNext() {
        if(position >= list.size()) {
            return false;
        };
        return true;
    }
}
