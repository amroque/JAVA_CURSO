/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.datospersonales;

import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class DatosPersonales {

    public static void main(String[] args) {
        String nombre;
        String apellidos;
        int edad;
        String sexo;
        double estatura;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba su nombre: ");
        nombre=entrada.nextLine();
        System.out.print("Escriba sus apellidos: ");
        apellidos=entrada.nextLine();
        System.out.print("Escriba su edad: ");
        edad=Integer.parseInt(entrada.nextLine());
        System.out.print("Sexo: ");
        sexo=entrada.nextLine();
        System.out.print("Escriba su estatura: ");
        estatura=Double.parseDouble(entrada.nextLine());
        System.out.println("***********Datos Personales de " + nombre + "***************");
        System.out.println("Nombre completo: " + nombre + " " + apellidos);        
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " +sexo);
        System.out.println("Estatura: " + estatura);
        }    
     }

 