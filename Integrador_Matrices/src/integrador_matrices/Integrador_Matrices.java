package integrador_matrices;

import java.util.Scanner;

public class Integrador_Matrices {

    public static void main(String[] args) {
        int calificaciones[][] = new int[4][3];
        int suma = 0;
        int promedio = 0;
        int promedios[] = new int[4];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("Escriba las calificacines del Alumno " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[0].length; j++) {
                calificaciones[i][j] = teclado.nextInt();
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / calificaciones[0].length;
            suma = 0;
        }
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Promedio del Alumno " + (i+1)+ ":" + " " + promedios[i]);
        }

    }

}

