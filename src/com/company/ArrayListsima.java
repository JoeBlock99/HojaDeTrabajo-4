package com.company;

import java.util.ArrayList;

public class ArrayListsima<E> extends Pila<E> {
    private ArrayList<E> utilAL;

    public ArrayListsima() {
        utilAL = new ArrayList<>();
    }

    @Override
    public void push(E item) {
        utilAL.add(item);
    }

    @Override
    public E pop() {
        E element = utilAL.get(size() - 1);
        utilAL.remove(utilAL.size() - 1);
        return element;
    }

    @Override
    public E peek() {
        return utilAL.get(size() - 1);
    }

    @Override
    public boolean empty() {
        return utilAL.isEmpty();
    }

    @Override
    public int size() {
        return utilAL.size();
    }

}
