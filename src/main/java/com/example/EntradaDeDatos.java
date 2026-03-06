package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void demostrarEntrada() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);

        scanner.close();
    }
}