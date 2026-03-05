package com.example;

public class Condicionales {

    // Ejemplo usando if - else
    public static void ejemploIf() {
        int numero = 10;

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }

    // Ejemplo usando if - else if
    public static void ejemploIfElseIf() {
        int nota = 85;

        if (nota >= 90) {
            System.out.println("Calificación: A");
        } else if (nota >= 80) {
            System.out.println("Calificación: B");
        } else {
            System.out.println("Calificación: C");
        }
    }

    // Ejemplo usando switch
    public static void ejemploSwitch() {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }
    }
}