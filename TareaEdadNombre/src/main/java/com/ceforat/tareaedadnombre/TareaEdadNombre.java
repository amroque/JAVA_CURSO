package com.ceforat.tareaedadnombre;

import java.util.Scanner;

public class TareaEdadNombre {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String nombre;
        int edad;
        //int contador=1;
        System.out.println("Escriba su nombre: ");
        nombre= entrada.nextLine();
        System.out.println("Escriba su edad: ");
        edad=entrada.nextInt();
        if (edad>=18) {
            System.out.println(nombre+ " eres mayor de edad");            
        }else{
            System.out.println(nombre +" eres menor de edad");            
        }
        /*while (edad>0) {
            System.out.println(contador + "."+ nombre);
            edad--;
            contador++;
        }*/
        for (int i = 0; i < edad; i++) {
            System.out.println((i+1) + "."+ nombre);
        }
    }
}
