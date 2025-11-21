
package arreglos_ejercicios_clase;

import java.util.Scanner;

public class Arreglos_Ejercicios_Clase {

    public static void main(String[] args) {
        int arreglo_5[] = new int[5];
        int suma = 0;
        int mayor = 0;
        double promedio = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta 5 valores enteros");

        for (int i = 0; i < arreglo_5.length; i++) {
            arreglo_5[i] = teclado.nextInt();
            if ((i+1)%2!=0) {
            suma = suma + arreglo_5[i];
            }
            if (arreglo_5[i] > mayor) {
                mayor = arreglo_5[i];
            }
        }
        promedio = suma / arreglo_5.length;
        System.out.println("La suma de los valores del arreglo es igual a: " + suma);
        System.out.println("El mayor de los valores del arreglo es: " + mayor);
        System.out.println("El promedio de los valores del arreglo es: " + promedio);
        for (int i = 0; i < arreglo_5.length; i++) {
            System.out.println(arreglo_5[i] + " ");
        }
        
    }

}
