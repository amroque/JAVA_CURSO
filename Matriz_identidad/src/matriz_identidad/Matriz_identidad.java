
package matriz_identidad;

import java.util.Scanner;

/*Ejercicio 1: 
Haz un programa que le pida al usuario el tamaño de la matriz para generar la matriz identidad e imprimirla por pantalla
*/

/*
1. Pedirle al usuario que entre el tamaño de la matriz identidad ✅ 
2. Generar (Declarar la matriz) ✅ 
3. Imprimirla por pantalla
*/

public class Matriz_identidad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamannoMatriz=0;
        System.out.print("Indique el tamaño de la matriz identidad:");
        tamannoMatriz=teclado.nextInt();//Guardamos el valor que el usuario escribe por pantalla
        teclado.close();
        System.out.println("Perfecto! Su matriz identidad será de: " +tamannoMatriz +" "+"x"+" "+tamannoMatriz);
        int identidad[][]=new int [tamannoMatriz][tamannoMatriz];
        
        for (int i = 0; i < tamannoMatriz; i++) {
            for (int j = 0; j < tamannoMatriz; j++) {
                if (i==j) {
                identidad[i][j]=1;                    
                }else{
                identidad[i][j]=0;                    
                }
                System.out.print(identidad[i][j]+" ");
            }            
            System.out.println();
        }
        
        
    }
    
}
