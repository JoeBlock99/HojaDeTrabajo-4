package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;


public class Main {

    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("datos.txt"));
            Vector<String> lines = new Vector<>();
            String strings;
            do {
                strings = reader.readLine();
                lines.add(strings);
                if (strings != null) {
                    int x;
                    try {
                        x = calcular(strings);
                    } catch (Exception e) {
                        System.err.println("Linea de operaciones no valida.");
                        continue;
                    }
                    System.out.println("Resultado " + x);
                }
            } while (strings != null);
            System.out.println(lines);
        } catch (Exception e) {
            System.err.println("Fallo al leer el archivo.");
        }
    }

    public static boolean isNumber(String string) {
        boolean numeric = true;
        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        return numeric;
    }

    static int calcular(String calc) {
        Calculo operar = new Calculo();
        String[] spliter = calc.split(" ");
        ArrayList<String> data = new ArrayList<String>(Arrays.asList(spliter));
        Collections.reverse(data);
        Stack<Integer> numeros = new VectorStack<>();
        Stack<String> operaciones = new VectorStack<>();
        for (String datum : data) {
            if (isNumber(datum)) {
                numeros.push(Integer.parseInt(datum));
            } else {
                operaciones.push(datum);
            }
        }
        int resultado = numeros.pop();
        do {
            String operando = operaciones.pop();
            switch (operando) {
                case "*":
                    resultado = (int) Math.round(operar.multiplicar(resultado, numeros.pop()));
                    break;
                case "/":
                    resultado = (int) Math.round(operar.dividir(resultado, numeros.pop()));
                    break;
                case "+":
                    resultado = (int) Math.round(operar.sumar(resultado, numeros.pop()));
                    break;
                case "-":
                    resultado = (int) Math.round(operar.restar(resultado, numeros.pop()));
                    break;

                default:
                    System.err.println("Operación Inválida.");
                    System.exit(-1);
            }
        } while (!operaciones.empty());
        return resultado;
    }
}

