/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.calculadora;
import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        double suma;
        double resta;
        double division;
        double producto;
                
        System.out.print("Escribe el 1er numero: ");
        numero1=entrada.nextDouble();
        System.out.print("Escribe el 2do numero: ");
        numero2=entrada.nextDouble();
        suma=numero1+numero2;
        resta=numero1-numero2;
        producto=numero1*numero2;
        division=numero1/numero2;
        System.out.println("Suma: " + suma + "\n" +"Resta: " + resta + "\n"+ "Multiplicación: " + producto + "\n" + "Division: " + division);
    }
}
