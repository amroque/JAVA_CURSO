/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ceforat.merceria;

import java.util.Scanner;

/**
 Ejercicio: Mercería
Una mercería vende canutillos y mostacillas al por mayor mediante $u
página web. Como se trata de una mercería mayorista, solicita la
cantidad de paquetes en cada venta y dependiendo de esta realiza los
siguientes controles:
* 
• Si la cantidad de productos es menor a 5: Se debe emitir un mensaje
indicando que no se permiten compras inferiores a 5 productos.
* 
• Si la cantidad de productos es mayor o igual a 5 pero menor o igual a
15 Se debe emitir un mensaje que el costo de envío es de $100
* 
• Si la cantidad de productos es mayor a 15: Se debe emitir on mensaje
de que el envío es gratuito.
* 
* 
* Punto Extra
Solicitar, además de la cantidad de paquetes, el costo total que suma la
compra en pesos mexicanos. Y aplicar las siguientes promociones:
* 
• Si el monto total es inferior a 1000 pesos: No hay promociones. Informar
cuantos pesos más necesita para poder entrar a ona promoción.
* 
* 
• Si el monto supera los 1000 pesos pero es menor a los 3000: Informar que
posee un descuento del 5% sobre el total. Especificar cuánto sería
el nuevo monto total con descuento.
* 
* 
• Si el monto sopera los 3000 pesos: Informar que posee on descuento del
10%. Especificar cuánto sería el nuevo monto total con descuento.
 */
public class Merceria {

    public static void main(String[] args) {
        int cantidadProductos;
        int monto;
        int promocion1=1000;
        int promocion2=3000;
        Scanner entrada = new Scanner(System.in);
        System.out.println("*********** BIENVENIDO A LA MERCERÍA JAVA *********** \n Ingrese la cantidad de productos que va a comprar: ");
        cantidadProductos = entrada.nextInt();
        System.out.println("Inserte el monto de la compra");
        monto = entrada.nextInt();
        if (cantidadProductos < 5) {
            if (cantidadProductos <= 0) {
                System.out.println("No se permiten cantidades negativas o nulas");
            } else {
                System.out.println("No se permiten compras inferiores a 5 productos");
            }
        } else {
            if (cantidadProductos >= 5 && cantidadProductos <= 15) {
                System.out.println("El costo de envío es de $100");
            } else {
                System.out.println("El costo del envío es gratis");
            }

        }

    }
}
