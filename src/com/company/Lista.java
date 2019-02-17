package com.company;



public class Lista<E> extends Pila<E> {
    private iLista<E> list;
    public Lista(String tipo) {
        list = FactoryList.getList(tipo);
    }

    @Override
    public void push(E item) {
        list.add(item);
    }

    @Override
    public E pop() {
        E element = list.get(size() - 1);
        list.remove(list.size() - 1);
        return element;
    }

    @Override
    public E peek() {
        return list.get(size() - 1);
    }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }


}
