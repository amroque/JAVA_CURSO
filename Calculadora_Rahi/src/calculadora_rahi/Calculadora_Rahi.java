package calculadora_rahi;

import java.util.Scanner;

public class Calculadora_Rahi {
    public static void main(String[] args) {
        String nombreEstudiante;
        String nombreMateria;
        String AprobadoReprobado = " ";
        String MateriaAprobadoReprobado = " ";
        int cantidadDeMaterias = 0;
        int cantidadDeMateriasAprobadas = 0;
        int cantidadDeMateriasReprobadas = 0;
        double calificacion = 0;
        double promedio = 0;
        double calificacionMasAlta = 0;
        double calificacionMasBaja = 100;
        double sumaCalificaciones = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== SISTEMA DE GESTION DE CALIFICACIONES === \n ");
        System.out.print("Ingrese el nombre del estudiante: ");
        nombreEstudiante = entrada.nextLine();
        System.out.print("Ingrese el numero de materias del estudiante: ");
        cantidadDeMaterias = Integer.parseInt(entrada.nextLine());
        System.out.println("--- Ingreso de calificaciones ---");

        for (int i = 1; i <= cantidadDeMaterias; i++) { //Camel Case cantidad_de_materias (Snape Case)
            System.out.println("Materia " + i + " : ");
            System.out.print("Nombre de la materia: ");
            nombreMateria = entrada.nextLine();
            System.out.print("Calificacion de la materia (0-100): ");
            calificacion = Double.parseDouble(entrada.nextLine());
            sumaCalificaciones +=calificacion;
            if (calificacion < 60) {
                MateriaAprobadoReprobado = "Reprobada";
                cantidadDeMateriasReprobadas++;

            } else {
                MateriaAprobadoReprobado = "Aprobado";
                cantidadDeMateriasAprobadas++;
            }
            if (calificacion > calificacionMasAlta) {
                calificacionMasAlta = calificacion;
            }
            if (calificacion < calificacionMasBaja) {
                calificacionMasBaja = calificacion;
            }
            System.out.println("Materia " + nombreMateria + " esta: " + MateriaAprobadoReprobado);
        }
         promedio = sumaCalificaciones / cantidadDeMaterias;
          if (promedio < 60) {
                AprobadoReprobado = "Reprobada";
            } else {
                AprobadoReprobado = "Aprobado";
                }
        entrada.nextLine();
        System.out.println("=== RESUMEN DE CALIFICACIONES === ");
        System.out.println("Cantidad de materias: " + cantidadDeMaterias);
        System.out.println("Calificacion mas baja: " + calificacionMasBaja);
        System.out.println("Calificacion mas alta: " + calificacionMasAlta);
        System.out.println("Promedio: " + promedio);
        System.out.println("El estudiante " + nombreEstudiante + " esta: " + AprobadoReprobado);
    }
    
}
