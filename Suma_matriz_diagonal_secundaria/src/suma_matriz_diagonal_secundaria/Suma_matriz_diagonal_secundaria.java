
package suma_matriz_diagonal_secundaria;

import java.util.Scanner;

public class Suma_matriz_diagonal_secundaria {

    public static void main(String[] args) {
       //Declaración de variables
        Scanner teclado = new Scanner(System.in);
        int suma_diagonal_secundaria=0;
        int tamannoMatriz;
              
        System.out.print("Indique el tamaño de la matriz: ");
        //Captura de valor entrado por teclado
        tamannoMatriz=teclado.nextInt();
        System.out.println("Perfecto! Su matriz será de: " +tamannoMatriz +" "+"x"+" "+tamannoMatriz);
        //Declaración de la matriz con el tamaño especificado
        int matriz[][]=new int [tamannoMatriz][tamannoMatriz];
        //Declaración del arreglo diagonalSecundaria con el tamaño especificado
        int[] diagonalSecundaria=new int[tamannoMatriz];
        int contadorAux=tamannoMatriz-1;
        //Inserción de valores para rellenar la matriz por teclado
        for (int i = 0; i < tamannoMatriz; i++) {
        System.out.println("Escriba los valores para la fila " +(i+1));
            for (int j = 0; j < tamannoMatriz; j++) {
                matriz[i][j]=teclado.nextInt();
                //Llenado del arreglo diagonalSecundaria
                if (j==contadorAux) {
                    diagonalSecundaria[i]=matriz[i][j]; 
                }
              }
                contadorAux--;
        }
        Impresión por pantalla de la matríz creada
        System.out.println("La matriz quedó de la siguiente manera: " );
        for (int i = 0; i < tamannoMatriz; i++) {
            for (int j = 0; j < tamannoMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
                }
            System.out.println();
        }
        
        Mostrar el arreglo diagonalSecundaria por pantalla y determinar la suma de sus elementos
        System.out.println("La diagonal de la matriz insertada es: ");
        
        for (int i = 0; i < diagonalSecundaria.length; i++) {
            System.out.print(diagonalSecundaria[i]+" ");
            suma_diagonal_secundaria+=diagonalSecundaria[i];
        }
        Salto de línea
        System.out.println();
        //Muestra del resultado de la suma de los elementos de la diagonalSecundaria
        System.out.println("La suma de los valores de la diagonal es: " + suma_diagonal_secundaria);
    }
    
}
