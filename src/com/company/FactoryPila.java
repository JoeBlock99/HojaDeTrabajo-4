package com.company;

public class FactoryPila {
    public static Pila getPila(String tipo){
        if (tipo.equals("ArrayListsima")){
            return new ArrayListsima();
        }
        else if (tipo.equals("VectorPila")){
            return new VectorPila();
        }
        else if (tipo.equals("Circular List")){
            return new Lista("CircularList");
        }
        else if (tipo.equals("Double List")) {
            return new Lista("DobleLinkedList");
        }
        else{
            return new Lista("SingleLinkedList");
        }
    }
}
