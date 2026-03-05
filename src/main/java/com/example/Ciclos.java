package com.example;

public class Ciclos {

    // Ejemplo de ciclo for
    public static void ejemploFor() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("For número: " + i);
        }
    }

    // Ejemplo de ciclo while
    public static void ejemploWhile() {
        int i = 1;

        while (i <= 5) {
            System.out.println("While número: " + i);
            i++;
        }
    }

    // Ejemplo de ciclo do-while
    public static void ejemploDoWhile() {
        int i = 1;

        do {
            System.out.println("Do-While número: " + i);
            i++;
        } while (i <= 5);
    }
}