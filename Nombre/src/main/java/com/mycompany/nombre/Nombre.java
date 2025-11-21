/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nombre;
import com.mycompany.HolaMundo.HolaMundo;
import java.util.Scanner;

/**
 *
 * @author ARIEL
 */
public class Nombre {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = sc.next();
        HolaMundo hi = new HolaMundo();
        System.out.println("Hola " + nombre + hi.saludo());
        
        System.out.println("");
                
        
    }
}
