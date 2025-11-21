package com.ceforat.do_while;

import java.util.Scanner;

public class Do_while {

    public static void main(String[] args) {
        Scanner numeroEntrada=new Scanner(System.in);
        int numero;
        do {
            System.out.println("Escriba un numero: ");
            numero=numeroEntrada.nextInt();
            if (numero<0) {
                System.out.println("El numero es negativo. Por favor intentelo de nuevo");
            }
            
        } while (numero<0);
        System.out.println("El numero " + numero + " es positivo");
       }
        /*System.out.println("Escriba un numero: ");
        numero=numeroEntrada.nextInt();
        if (numero<0) {
            System.out.println("El numero es negativo");
            
        }else{
            System.out.println("El numero es positivo");
        }*/
            
        }
   

