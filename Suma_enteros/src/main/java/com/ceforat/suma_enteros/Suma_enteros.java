package com.ceforat.suma_enteros;
import java.util.Scanner;
public class Suma_enteros {

    public static void main(String[] args) {
       Scanner enteroEntrada=new Scanner(System.in);
       int contador=-1;
       int suma=0;
       int numeroEntrado;
       int vinneta=1;
        System.out.println("Escriba numeros positivos. Para terminar escriba uno negativo o el cero");
        do {
        System.out.print(vinneta + ".");
        //numeroEntrado=enteroEntrada.nextInt();
        contador++;
        numeroEntrado=enteroEntrada.nextInt();
        suma+=numeroEntrado;
        vinneta++;
        }while (numeroEntrado>0);    
        System.out.println("Escribio "+ contador + " numeros");
        System.out.println("La suma total de los "+ contador+ " numeros entrados por pantalla es "+suma);
}
}
