package com.poi.singleton;

public class Main {

    public static void main(String[] args) {

        Calculadora c = Calculadora.getInstancia();
        Calculadora c2 = Calculadora.getInstancia();
        Calculadora c3 = Calculadora.getInstancia();

    }

}
