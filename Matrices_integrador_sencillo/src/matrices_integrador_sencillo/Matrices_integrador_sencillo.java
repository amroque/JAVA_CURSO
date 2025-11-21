package matrices_integrador_sencillo;

import java.util.Scanner;

public class Matrices_integrador_sencillo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int calificacionesAlumnos[][] = new int[4][3];
        int suma = 0;
        double promedio[] = new double[4];
        for (int i = 0; i < calificacionesAlumnos.length; i++) {
            System.out.println("Inserta las calificaciones del alumno: " + (i + 1));
            for (int j = 0; j < calificacionesAlumnos[0].length; j++) {
                calificacionesAlumnos[i][j] = teclado.nextInt();
                suma += calificacionesAlumnos[i][j];
            }
            promedio[i] = suma / calificacionesAlumnos[0].length;
            suma = 0;
        }
        //Imprimir los valores
        System.out.println("Matriz de calificaciones");
        for (int i = 0; i < calificacionesAlumnos.length; i++) {
            for (int j = 0; j < calificacionesAlumnos[0].length; j++) {
                System.out.print(calificacionesAlumnos[i][j] + " ");
            }
            System.out.println(promedio[i]);
        }

    }

}
