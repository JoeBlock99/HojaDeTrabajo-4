package com.company;

public class FactoryList {
    public static AbsList getList(String tipo){
        if (tipo.equals("SingleLinkedList")){
            return new SingleLinkedList();
        }
        else if (tipo.equals("DobleLinkedList")){
            return new DobleLinkedList();
        }
        else{
            return new CircularList();
        }
    }
}
