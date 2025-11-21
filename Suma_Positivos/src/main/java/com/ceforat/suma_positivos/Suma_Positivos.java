/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.suma_positivos;

import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class Suma_Positivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma=0;
        int numero;
        int contador= 0; 
        System.out.println("Entra numeros positivos");
        numero = entrada.nextInt();
        while (numero >0) {            
            suma+=numero;
            contador++;
            System.out.println("Entra numeros positivos");
            numero = entrada.nextInt();
        }
        System.out.println("Suma: " + suma+"CAntidad de numeros sumados: " + contador);
   
    }
}
