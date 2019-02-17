package com.company;

public class Calculo implements iCalculadora {
    private static Calculo calcular;

    public static Calculo createCalculator() {
        if (calcular == null) {
            calcular = new Calculo();
        }
        return calcular;
    }
    @Override
    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        return a / b;
    }
}
