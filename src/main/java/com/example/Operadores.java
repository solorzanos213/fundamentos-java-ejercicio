package com.example;

public class Operadores {

    // Operadores aritméticos
    public static void operadoresAritmeticos() {
        int a = 10;
        int b = 5;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
    }

    // Operadores relacionales
    public static void operadoresRelacionales() {
        int a = 10;
        int b = 5;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }

    // Operadores lógicos
    public static void operadoresLogicos() {
        boolean x = true;
        boolean y = false;

        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));
    }
}