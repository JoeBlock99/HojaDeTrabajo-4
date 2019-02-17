package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import static jdk.nashorn.internal.runtime.JSType.isNumber;


public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Calculo calculator = Calculo.createCalculator();
        Pila pila;
        String tipo;

        System.out.println("Ingrese la implementacion de Stack que va a usar: ");
        System.out.println("ArrayList:");
        System.out.println("Vector:");
        System.out.println("SingleLinkedList:");
        System.out.println("DobleLinkedList:");
        System.out.println("CircularList:");
        tipo = read.next();

        pila = FactoryPila.getPila(tipo);

        //para leer el archivo
        ArrayList<String> archivo = new ArrayList<>();
        try {
            Stream<String> lines = Files.lines(
                    Paths.get("datos.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(archivo::add);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
        }
        public static boolean isNumber (String string){
            boolean numeric = true;
            try {
                Double num = Double.parseDouble(string);
            } catch (NumberFormatException e) {
                numeric = false;
            }
            return numeric;
        }

        static int calcular (String calc){
            Calculo operar = new Calculo();
            String[] spliter = calc.split(" ");
            ArrayList<String> data = new ArrayList<String>(Arrays.asList(spliter));
            Collections.reverse(data);
            Stack<Integer> numeros = new VectorPila<>();
            Stack<String> operaciones = new VectorPila<>();
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
        for (String anArchivo : archivo) {
            static int calcular (String calc){
                Calculo operar = new Calculo();
                String[] spliter = calc.split(" ");
                ArrayList<String> data = new ArrayList<String>(Arrays.asList(spliter));
                Collections.reverse(data);
                Stack<Integer> numeros = new VectorPila<>();
                Stack<String> operaciones = new VectorPila<>();
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
    }
}





