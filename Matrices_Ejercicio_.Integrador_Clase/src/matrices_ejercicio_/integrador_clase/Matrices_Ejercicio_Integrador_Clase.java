package matrices_ejercicio_.integrador_clase;

import java.util.Scanner;

public class Matrices_Ejercicio_Integrador_Clase {

    public static void main(String[] args) {
        //Crear objeto scanner
        Scanner teclado = new Scanner(System.in);
        //Mensaje informativo al usuario
        System.out.print("Por favor, inserte la cantidad de alumnos: ");
        //Inicialización de la variable que guarda la cantidad de filas que tendrá mi matriz
        int filas = teclado.nextInt();
        System.out.print("Por favor, inserte la cantidad de materias: ");
        //Inicialización de la variable que guarda la cantidad de filas que tendrá mi matriz
        int columnas = teclado.nextInt();
        //Impresión de salto de línea
        System.out.println();
        //Inicialización de la matriz calificaciones
        int calificaciones[][] = new int[filas][columnas];
        double promedios[] = new double[filas];
        //Llenar la matriz con los valores entrados por teclado
        for (int alumno = 0; alumno < calificaciones.length; alumno++) {
            System.out.println("Ingrese las calificaciones del alumno " + (alumno + 1) + ":");
            for (int materia = 0; materia < calificaciones[0].length; materia++) {
                calificaciones[alumno][materia] = teclado.nextInt();
            }
        }
        //Llenar arreglo Promedios
        for (int alumno = 0; alumno < calificaciones.length; alumno++) {
            int suma = 0;
            for (int materias = 0; materias < calificaciones[0].length; materias++) {
                suma += calificaciones[alumno][materias];
            }
            promedios[alumno] = suma / calificaciones[0].length;
        }
        //Mostrar las calificaiones 
        System.out.println("Las calificaciones quedaron de la siguiente manera: ");
        for (int alumnos = 0; alumnos < calificaciones.length; alumnos++) {
            for (int materias = 0; materias < calificaciones[0].length; materias++) {
                System.out.print(calificaciones[alumnos][materias] + " ");
            }
            System.out.println(promedios[alumnos]);
            System.out.println();
        }
    }
}
