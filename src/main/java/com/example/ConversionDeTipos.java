package com.example;

public class ConversionDeTipos {

    public static void demostrarConversion() {

        int numero = 10;

        double decimal = numero; // conversión automática

        double precio = 9.99;
        int entero = (int) precio; // conversión manual

        System.out.println("Conversión automática: " + decimal);
        System.out.println("Conversión manual: " + entero);
    }
}