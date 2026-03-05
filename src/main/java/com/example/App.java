package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("=== Ejemplos de lógica en Java ===");

        // Fundamentos de lógica
        FundamentosLogica.ejemploVariables();
        FundamentosLogica.ejemploCondicional();
        FundamentosLogica.ejemploCiclo();

        System.out.println("\n=== Ejemplos de operadores ===");

        // Operadores
        Operadores.operadoresAritmeticos();
        Operadores.operadoresRelacionales();
        Operadores.operadoresLogicos();

        System.out.println("\n=== Ejemplos de condicionales ===");

        // Condicionales
        Condicionales.ejemploIf();
        Condicionales.ejemploIfElseIf();
        Condicionales.ejemploSwitch();

        System.out.println("\n=== Ejemplos de ciclos ===");

        Ciclos.ejemploFor();
        Ciclos.ejemploWhile();
        Ciclos.ejemploDoWhile();

        System.out.println("\n=== Ejemplos de métodos ===");

        Metodos.saludar();
        Metodos.mostrarSuma();

        System.out.println("\n=== Ejemplo de arreglos ===");

        Arreglos.ejemploArreglo();

    }
}