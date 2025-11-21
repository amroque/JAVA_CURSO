package com.ceforat.tabla_multiplicar2;

import java.util.Scanner;

public class Tabla_multiplicar2 {

    public static void main(String[] args) {
        Scanner numero_entrada = new Scanner(System.in);
        int resultado=0;
        int numero;
        System.out.println("===========TABLA DE MULTIPLICAR===========");
        System.out.println("Escriba un número del 1 al 10");
        do {
            numero= numero_entrada.nextInt();
            if (numero<1 || numero>10) {
                System.out.println("El numero debe estar entre 1 y 10");
            }
        } while (numero<1 || numero>10);
        
        for (int i = 0; i <=10; i++) {
        resultado=numero*i;
            System.out.println(numero +" x "+i+" = "+resultado);
        }
    }
}
