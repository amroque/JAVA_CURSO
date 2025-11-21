/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.flujo_switch;

import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class Flujo_Switch {

    public static void main(String[] args) {
        int dia;
        System.out.println("Escriba un numero de dia de la Semana");
        Scanner dia_usuario=new Scanner(System.in);
        dia=dia_usuario.nextInt();
                
        switch (dia) {
            case 1->System.out.println("Domingo");                
             
            case 2->System.out.println("Lunes");
         
            case 3->System.out.println("Martes");
               
            default-> System.out.println("Otro día");
        }
    }
}
