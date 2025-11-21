package proyecto_uno;

import java.util.Scanner;
import javax.sound.midi.SoundbankResource;

public class Proyecto_Uno {

    public static void main(String[] args) {
        //declaración de variables
        String nombreEstudiante;
        String nombreMateria;
        String aprovadoReprovado = "APROBADO";
        String materiaAprovadoReprovado = "APROBADA";        
        int cantidadMateriasReprobadas=0;
        int cantidadMateriasAprobadas=0;
        int cantidadMaterias;
        double calificacion;
        double promedio;
        double calificacionMasAlta = 0;
        double calificacionMasBaja = 100;
        double sumaCalificaciones = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SISTEMA DE GESTION DE CALIFICACIONES === \n");
       
        System.out.print("Ingrese el nombre del estudiante: ");
        nombreEstudiante = entrada.nextLine();
        System.out.print("Ingrese el numero de materias del estudiante: ");
        cantidadMaterias = Integer.parseInt(entrada.nextLine());
        System.out.println("--- Ingreso de calificaciones ---");

        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.println("Materia " + (i + 1) + ":");
            System.out.print("Nombre de la materia: ");
            nombreMateria = entrada.nextLine();
            System.out.print("Calificacion de la materia (0-100): ");
            calificacion = Double.parseDouble(entrada.nextLine());
            sumaCalificaciones+=calificacion;
            if (calificacion < 60) {
                materiaAprovadoReprovado = "REPROBADA";
                cantidadMateriasReprobadas++;
             
            }else{
                cantidadMateriasAprobadas++;
            }
            if (calificacion > calificacionMasAlta) {
                calificacionMasAlta = calificacion;
            }
            if (calificacion < calificacionMasBaja) {
                calificacionMasBaja = calificacion;
            }
            System.out.println("Materia "+ nombreMateria + " está "+ materiaAprovadoReprovado);

        }
        promedio=sumaCalificaciones/cantidadMaterias;
        entrada.nextLine();
        System.out.println("=== RESUMEN DE CALIFICACIONES ===");
        System.out.println("Cantidad de materias: " +cantidadMaterias);
        System.out.println("Calificacion mas baja: " +calificacionMasBaja);
        System.out.println("Calificacion mas alta: " +calificacionMasAlta);
        System.out.println("Promedio: "+promedio);
        System.out.println("El estudiante "+ nombreEstudiante+ " está:" + aprovadoReprovado);
        System.out.println("Materias aprobadas: "+cantidadMateriasAprobadas );
        System.out.println("Materias reprobadas: "+cantidadMateriasReprobadas );
        
        
    }

}
