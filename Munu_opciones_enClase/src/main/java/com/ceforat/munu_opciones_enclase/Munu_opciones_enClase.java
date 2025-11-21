package com.ceforat.munu_opciones_enclase;

import java.util.Scanner;
import java.time.LocalDate;

public class Munu_opciones_enClase {
    public static void main(String[] args) {
    Scanner opcionEntrada=new Scanner(System.in);
    LocalDate fecha_hoy=LocalDate.now();
    int numeroOpcion;
    
        do {            
        System.out.println("=========Menu=========");
        System.out.println(" 1) Saludar \n 2) Despedirse \n 3) Mostrar fecha actual \n 4) Salir");
        System.out.println("Escriba el numero que corresponde a la opcion que prefiera");
        numeroOpcion=opcionEntrada.nextInt();
            switch (numeroOpcion) {
                case 1: System.out.println("Hola  \n \n \n ");
                    break;
                case 2: System.out.println("Hasta luego  \n \n");
                    break;
                case 3: System.out.println("Hoy es: " + fecha_hoy + "  \n \n");
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Por favor, inserte un numero del 1 al 4  \n \n");
            }
        } while (numeroOpcion!=4);
        /*if (numeroOpcion==4) {
            System.out.println("Saliendo....");
        }*/
        System.out.println("Gracias por utilizar nuestro menu interactivo");
    }
}
