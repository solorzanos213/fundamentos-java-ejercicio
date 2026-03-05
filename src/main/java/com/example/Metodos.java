package com.example;

public class Metodos {

    // Método que saluda
    public static void saludar() {
        System.out.println("Hola, bienvenido al ejemplo de métodos en Java");
    }

    // Método que suma dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método que muestra el resultado
    public static void mostrarSuma() {
        int resultado = sumar(5, 3);
        System.out.println("La suma es: " + resultado);
    }
}