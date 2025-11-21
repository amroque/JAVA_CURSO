
package suma_diagonal_principal;

import java.util.Scanner;

public class Suma_diagonal_principal {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int sumaDiagonalPrimaria=0;
        int sumaDiagonalSecundaria=0;
        int tamannoMatriz;
        System.out.print("Indique el tamaño de la matriz: ");
        tamannoMatriz=teclado.nextInt();
        int contador_diagonal_secundaria=tamannoMatriz-1;
        int[] diagonal_primaria=new int[tamannoMatriz];
        int[] diagonal_secundaria=new int[tamannoMatriz];
        
        System.out.println("Perfecto! Su matriz será de: " +tamannoMatriz +" "+"x"+" "+tamannoMatriz);
        int matriz[][]=new int [tamannoMatriz][tamannoMatriz];
        //Llenar la matriz
        for (int i = 0; i < tamannoMatriz; i++) {
        System.out.println("Escriba los valores para la fila " +(i+1));
            for (int j = 0; j < tamannoMatriz; j++) {
                matriz[i][j]=teclado.nextInt();
                if (i==j) {
                    diagonal_primaria[i]=matriz[i][j];
                    sumaDiagonalPrimaria+=diagonal_primaria[i];
                }
            }   
        }
        //Imprimir la matriz
        System.out.println("Usted ha insertado todos los valores y su matriz sería la que aparece a continuación");
        for (int i = 0; i < tamannoMatriz; i++) {
            for (int j = 0; j < tamannoMatriz; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        
        //Imprimir la diagonal_primaria y la suma de sus elementos
        System.out.println("La diagonal principal de la matriz insertada por pantalla es: ");
        for (int i = 0; i < diagonal_primaria.length; i++) {
            System.out.print(diagonal_primaria[i]+" ");
        }
        System.out.println();
        System.out.print("La suma de los elementos de la diagonal principal es: " + sumaDiagonalPrimaria);
        System.out.println();
        for (int i = 0; i < tamannoMatriz; i++) {
            for (int j = 0; j < tamannoMatriz; j++) {
                if (j==contador_diagonal_secundaria) {
                    diagonal_secundaria[i]=matriz[i][j];
                    sumaDiagonalSecundaria+=diagonal_secundaria[i];
                }
            }
            contador_diagonal_secundaria--;
        }
         //Imprimir la diagonal_secundaria y la suma de sus elementos
        System.out.println("La diagonal secundaria de la matriz insertada por pantalla es: ");
        for (int i = 0; i < diagonal_secundaria.length; i++) {
            System.out.print(diagonal_secundaria[i]+" ");
        }
        System.out.println();
        System.out.print("La suma de los elementos de la diagonal secundaria es: " + sumaDiagonalSecundaria);
        System.out.println();
    }
    
    
}
