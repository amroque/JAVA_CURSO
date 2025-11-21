/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.calculadora1;

import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class Calculadora1 {

    public static void main(String[] args) {
        double numero1;
        double numero2;
        double suma;
        double resta;
        double multiplicacion;
        double division;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        numero1=entrada.nextDouble();
        //System.out.println(numero1);
        System.out.print("Escriba el otro numero: ");
        numero2=entrada.nextDouble();
        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion=numero1*numero2;
        division= numero1/numero2;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+division);
             
    }
}
