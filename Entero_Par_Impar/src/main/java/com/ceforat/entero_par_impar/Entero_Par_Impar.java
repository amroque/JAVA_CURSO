/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.entero_par_impar;

import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class Entero_Par_Impar {

    public static void main(String[] args) {
        /*Crea un programa que solicite al usuario un 
        número entero positivo y muestre todos los números
        desde 1 hasta ese número, indicando si cada uno es par o impar.
*/
        Scanner entrada = new Scanner(System.in);
        int numeroEntero;
        System.out.println("Escriba un numero entero mayor que cero: ");
        numeroEntero=Integer.parseInt(entrada.nextLine());
        for(int i=1;i<=numeroEntero;i++){
            if (i%2==0) {
                System.out.println(i+ " Par");                
            }else{
                System.out.println(i+ " Impar");                
                
            }
        }
        }
    }

