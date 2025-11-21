package com.ceforat.menu_opciones;
import java.util.Scanner;
import java.time.LocalDate;
public class Menu_Opciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        LocalDate fechaActual=LocalDate.now();
        do {
            System.out.println("1) Saludar \n 2) Despedirse  \n 3) Mostrar fecha actual \n 4) Salir");
            opcion=input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Hola");
                    break;
                case 2:System.out.println("Adios");
                    break;
                case 3:System.out.println("Hoy es: " + fechaActual);
                    break;
                case 4:System.out.println("Saliendo ... ");
                    break;
                default:
                    System.out.println("Escriba un numero entre 1 y 4");;
            }
        } while (opcion!=4);
        System.out.println("Gracias por utilizar nuestro ejemplo");
        
    }
}
