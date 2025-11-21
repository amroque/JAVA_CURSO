/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.condicionales;
import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class Condicionales {

    public static void main(String[] args) {
        int edad;
        System.out.println("Escriba su edad: ");
        Scanner entrada_edad = new Scanner(System.in);
        edad = entrada_edad.nextInt();

        if (edad >=18) {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }     
    }
}
