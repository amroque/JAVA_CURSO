package com.ceforat.condicional_switch_new;

import java.util.Scanner;

public class Condicional_Switch_New {

    public static void main(String[] args) {
         
        Scanner entradaDia= new Scanner(System.in);
        System.out.println("Digite un número natural");
        int diaSemana=Integer.parseInt(entradaDia.nextLine());
        //int diaSemana=3;
        String nombreDia= switch(diaSemana){
        case 1->"Lunes";
        case 2->"Martes";
        case 3->"Miercoles";
        case 4->"Jueves";
        case 5->"Viernes";
        case 6->"Sábado";
        case 7->"Domingo";
        default ->"Este dia de la semana no existe";
    };
        System.out.println(nombreDia);
    }
    }

