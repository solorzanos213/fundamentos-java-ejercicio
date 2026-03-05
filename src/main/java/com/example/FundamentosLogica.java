package com.example;

public class FundamentosLogica {

    // Método para mostrar variables
    public static void ejemploVariables() {
        int numero = 10;
        String mensaje = "Hola Java";
        double decimal = 5.5;

        System.out.println("Numero: " + numero);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Decimal: " + decimal);
    }

    // Método para mostrar un condicional
    public static void ejemploCondicional() {
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    // Método para mostrar un ciclo
    public static void ejemploCiclo() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }
}