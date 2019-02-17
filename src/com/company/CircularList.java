package com.company;

import java.util.Iterator;

public class CircularList<E> extends AbsList<E> {
    protected Node<E> tail;
    protected int count;

    public CircularList()
// pre: constructs a new circular list
    {
        tail = null;
        count = 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
    {
        Node<E> temp = new Node<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }


    public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
    {
        // new entry:
        addFirst(value);
        tail = tail.next();
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E removeFirst() {
        return null;
    }


// lo dificil es quitar el elemento de la cola

    public E removeLast()
// pre: !isEmpty()
// post: returns and removes value from tail of list
    {
        Node<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
        // finger now points to second-to-last value
        Node<E> temp = tail;
        if (finger == tail)
        {
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }

    @Override
    public E remove(E value) {
        return null;
    }

    @Override
    public void add(E value) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E get() {
        return null;
    }

    @Override
    public boolean contains(E value) {
        return false;
    }

    @Override
    public int indexOf(E value) {
        return 0;
    }

    @Override
    public int lastIndexOf(E value) {
        return 0;
    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public E set(int i, E o) {
        return null;
    }

    @Override
    public void add(int i, E o) {

    }

    @Override
    public E remove(int i) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
