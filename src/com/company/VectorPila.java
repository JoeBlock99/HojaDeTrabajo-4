package com.company;

import java.util.Vector;

public class VectorPila<E> extends Pila<E>{
    private Vector<E> internalVector;

    public VectorPila() {
        internalVector = new Vector<>();
    }

    @Override
    public void push(E item) {
        internalVector.add(item);
    }

    @Override
    public E pop() {
        E element = internalVector.lastElement();
        internalVector.remove(internalVector.size() - 1);
        return element;
    }

    @Override
    public E peek() {
        return internalVector.lastElement();
    }

    @Override
    public boolean empty() {
        return internalVector.isEmpty();
    }

    @Override
    public int size() {
        return internalVector.size();
    }

}
