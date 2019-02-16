package com.poi.singleton;

public class Calculadora extends Thread{
    private static Calculadora calculadora;

    private Calculadora() {}

    private synchronized static void createInstance() {
        if (calculadora == null) {
            calculadora = new Calculadora();
            calculadora.start();
        }
    }

    public static Calculadora getInstance() {
        createInstance();

        return calculadora;
    }


    public static Calculadora getInstancia() {

        createInstance();

        return calculadora;
    }
}

