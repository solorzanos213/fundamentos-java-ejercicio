package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("=== FUNDAMENTOS DE JAVA ===");

        System.out.println("\nTipos de datos primitivos:");
        TiposDeDatosPrimitivos.demostrarTipos();

        System.out.println("\nConversión de tipos:");
        ConversionDeTipos.demostrarConversion();

        System.out.println("\nVariables y constantes:");
        VariablesYConstantes.demostrarDeclaracionAsignacion();

        System.out.println("\nOperadores:");
        Operadores.demostrarOperadores();

        System.out.println("\nEntrada de datos:");
        EntradaDeDatos.demostrarEntrada();

        System.out.println("\nEstructuras condicionales:");
        EstructurasCondicionales.demostrarCondicional();

        System.out.println("\nEstructuras de repetición:");
        EstructurasDeRepeticion.demostrarCiclo();

        System.out.println("\nMétodos estáticos:");
        MetodosEstaticosSimples.saludar();
        System.out.println("Suma: " + MetodosEstaticosSimples.sumar(5, 3));

        System.out.println("\nArreglos unidimensionales:");
        ArreglosUnidimensionales.demostrarArreglo();

        System.out.println("\nArreglos bidimensionales:");
        ArreglosBidimensionales.demostrarMatriz();

        System.out.println("\nManipulación de cadenas:");
        ManipulacionCadenas.demostrarCadenas();
    }
}