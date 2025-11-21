
package com.ceforat.condicional_switch_old;

import java.util.Scanner;

public class Condicional_Switch_Old {

    public static void main(String[] args) {
        Scanner entradaNumero = new Scanner(System.in);
        int diaSemana=Integer.parseInt(entradaNumero.nextLine());             ;
        String nombreDia="";
        System.out.println("Escriba un numero");
        switch (diaSemana) {
            case 1: nombreDia="Lunes";
               break;
            case 2: nombreDia="Martes";
               break;
            case 3: nombreDia="Miercoles";
               break;
            case 4: nombreDia="Jueves";
               break;
            case 5: nombreDia="Viernes";
               break;
            case 6: nombreDia="Sábado";
               break;
            case 7: nombreDia="Domingo";
               break;
            default:
        System.out.println("El dia " + diaSemana +" no es un día de la semana" );
        }
        System.out.println(nombreDia);
    }
}
