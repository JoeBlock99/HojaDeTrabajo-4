package com.company;

public interface Stack<E> {
    /**
     * Realiza la operación 'push' en la pila. Es decir, almacena el objeto 'item' en la pila.
     *
     * @param item el objeto a almacenar
     */
    public void push(E item);
    // pre:
    // post: item is added to stack
    // will be popped next if no intervening push

    /**
     * Realiza la operación 'pop' en la pila. Esta función extrae y devuelve el último objeto guardado.
     *
     * @return el objeto guardado
     */
    public E pop();
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned

    /**
     * Realiza la operación 'peek' en la pila. Esta función regresa el último objeto de la pila pero no lo extrae.
     *
     * @return el objeto guardado
     */
    public E peek();
    // pre: stack is not empty
    // post: top value (next to be popped) is returned

    /**
     * @return 'true' si la pila está vacía
     */
    public boolean empty();
    // post: returns true if and only if the stack is empty

    /**
     * @return el tamaño de la pila
     */
    public int size();
    // post: returns the number of elements in the stack
}
