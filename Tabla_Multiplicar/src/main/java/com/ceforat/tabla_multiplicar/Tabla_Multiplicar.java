package com.ceforat.Tabla_Multiplicar;

import java.util.Scanner;


public class Tabla_Multiplicar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int resultado;
        System.out.println("Escribe un numero: ");
        numero=Integer.parseInt(entrada.nextLine());
        do{
        if (numero>=1 && numero<=10) {
            
        for (int i = 1; i <=10; i++) {
            resultado=i*numero;
            System.out.println(numero +" x "+i+" = "+resultado);    
        }
        }else{
            System.out.println("el numero debe de estar entre 1 y 10");
        }
}
