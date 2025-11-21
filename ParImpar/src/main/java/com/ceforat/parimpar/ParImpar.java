/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.parimpar;

import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class ParImpar {

    public static void main(String[] args) {
        System.out.println("Escriba un número");
        Scanner numeroEntrada = new Scanner(System.in);
        int numero;
        numero=Integer.parseInt(numeroEntrada.nextLine());
        if (numero%2==0) {
            System.out.println("El numero " + numero + " es par");
            
        }else{
            System.out.println("El numero " + numero + " es impar");            
        }
    }
}
