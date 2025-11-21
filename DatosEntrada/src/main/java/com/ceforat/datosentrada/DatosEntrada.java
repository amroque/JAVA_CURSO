/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.datosentrada;

import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class DatosEntrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.print("Escriba su nombre: ");
        nombre= entrada.nextLine();
        System.out.println("Bienvenido " + nombre);
    
    }
}
