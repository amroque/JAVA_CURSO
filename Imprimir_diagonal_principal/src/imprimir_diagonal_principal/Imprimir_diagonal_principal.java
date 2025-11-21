
package imprimir_diagonal_principal;

import java.util.Scanner;

public class Imprimir_diagonal_principal {
    /*
    1. Entrar matriz por teclado
     1.1. Pedirle las dimensiones al usuario
     1.2. Declarar la matriz
     1.3. Pedirle al usuario los valores 
     1.4. Llenar la matriz con los valores entrados
    2. Obtener los valores de la diagonal principal y guardarlos
    3. Mostrar los valores de la matriz principal
    */

    public static void main(String[] args) {
        //Declaración de variables
        Scanner teclado = new Scanner(System.in);
        int suma_diagonal_principal=0;
        int tamannoMatriz;
        
        System.out.print("Indique el tamaño de la matriz: ");
        //Captura de valor entrado por teclado
        tamannoMatriz=teclado.nextInt();
        System.out.println("Perfecto! Su matriz será de: " +tamannoMatriz +" "+"x"+" "+tamannoMatriz);
        //Declaración de la matriz con el tamaño especificado
        int matriz[][]=new int [tamannoMatriz][tamannoMatriz];
        //Declaración del arreglo diagonal con el tamaño especificado
        int diagonal[]=new int[tamannoMatriz];
        int contador_aux=tamannoMatriz-1;
        //Inserción de valores para rellenar la matriz por teclado
        for (int i = 0; i < tamannoMatriz; i++) {
        System.out.println("Escriba los valores para la fila " +(i+1));
            for (int j = 0; j < tamannoMatriz; j++) {
                matriz[i][j]=teclado.nextInt();
                //Llenado del arreglo diagonal
                if (j==contador_aux) {
                    diagonal[i]=matriz[i][j]; 
                }
              }
        }
        //Impresión por pantalla de la matríz creada
        System.out.println("La matriz quedó de la siguiente manera: " );
        for (int i = 0; i < tamannoMatriz; i++) {
            for (int j = 0; j < tamannoMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
                }
            System.out.println();
        }
        
        //Mostrar el arreglo diagonal por pantalla y determinar la suma de sus elementos
        System.out.println("La diagonal de la matriz insertada es: ");
        
        for (int i = 0; i < diagonal.length; i++) {
            System.out.print(diagonal[i]+" ");
            suma_diagonal_principal+=diagonal[i];
        }
        //Salto de línea
        System.out.println();
        //Muestra del resultado de la suma de los elementos de la diagonal
        System.out.println("La suma de los valores de la diagonal es: " + suma_diagonal_principal);
    }
}
