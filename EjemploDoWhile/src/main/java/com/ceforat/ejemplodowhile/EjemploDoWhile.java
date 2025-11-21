package com.ceforat.ejemplodowhile;

import java.util.Scanner;

public class EjemploDoWhile {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner
        int opcion;

        do {
            // Presenta las opciones del menú
            System.out.println("--- MENÚ ---");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt(); // Lee la opción del usuario

            // Procesa la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Ejecutando Opción 1...");
                    break;
                case 2:
                    System.out.println("Ejecutando Opción 2...");
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 3); // El bucle continúa mientras la opción no sea 3 (Salir)

        scanner.close(); // Cierra el objeto Scanner
    }
}
