/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.test_proyecto;
import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class Test_proyecto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double calificacion;
        double sumaCalificaciones=0;
        
         do {
                System.out.print("Calificación (0-100): ");
                calificacion = scanner.nextDouble();
                
                if (calificacion < 0 || calificacion > 100) {
                    System.out.println("Error: La calificación debe estar entre 0 y 100.");
                }
            } while (calificacion < 0 || calificacion > 100);
            
            // Limpiar buffer
            //scanner.nextLine();
            sumaCalificaciones+=calificacion;

    }
}
