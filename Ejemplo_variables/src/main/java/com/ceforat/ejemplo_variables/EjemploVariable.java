/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceforat.ejemplo_variables;

/**
 *
 * @author ARIEL
 */
public class EjemploVariable {
    int edad; // Variable de instancia
    static String nombreEmpresa = "Mi Empresa"; // Variable estática

    public void mostrarEdad() {
        int diasRestantes; // Variable local
        edad = 30; // Se asigna un valor a la variable de instancia
        diasRestantes = 5; // Se asigna un valor a la variable local
        System.out.println("La edad es: " + edad);
        System.out.println("Días restantes: " + diasRestantes);
    
}
}
