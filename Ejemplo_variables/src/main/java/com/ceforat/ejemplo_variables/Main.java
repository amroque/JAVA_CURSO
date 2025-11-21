/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.ejemplo_variables;

/**
 *
 * @author ARIEL
 */


public class Main {
    static String nombreEmpresa = "Mi Empresa"; // Variable estática

    public static void main(String[] args) {
        EjemploVariable obj = new EjemploVariable();
        obj.mostrarEdad();
        System.out.println("Nombre de la empresa: " + nombreEmpresa);
    }
}
