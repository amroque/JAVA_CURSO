

package com.ceforat.calculadora_calificaciones;
import java.util.Scanner;

public class Calculadora_calificaciones {

    public static void main(String[] args) {
        Scanner calificacion=new Scanner(System.in);
        int calificacionGuardada;
        String aprobadoReprobado="Aprobado";
        String calificacionCualitativa;
        do {   
        System.out.println("Escriba la calificación entre 0 y 100");
        calificacionGuardada=calificacion.nextInt();
        if (calificacionGuardada<0 || calificacionGuardada>100) {
            System.out.println("Error. La calificacion debe estar entre 0 y 100");
        }
        else{
        if (calificacionGuardada>=90) {
            calificacionCualitativa="A";
            }else{
                if (calificacionGuardada>=80 && calificacionGuardada<=89) {
                    calificacionCualitativa="B";                
                }else{
                    if (calificacionGuardada>=70 && calificacionGuardada<=79) {
                    calificacionCualitativa="C";                
                    }else{
                        if (calificacionGuardada>=60 && calificacionGuardada<=69) {
                        calificacionCualitativa="D";                
                            }else{
                            calificacionCualitativa="F";
                            aprobadoReprobado="Reprobado";
                            }
                        }
                    }
                }
        System.out.println("Calificación cualitativa: "+calificacionCualitativa+ ". Con esta calilficacion el estudiante esta "+aprobadoReprobado);
            }
        } while (calificacionGuardada<0 || calificacionGuardada>100);
        System.out.println("Gracias por utilizar nuestra calculadora!!!");
    }
    }
