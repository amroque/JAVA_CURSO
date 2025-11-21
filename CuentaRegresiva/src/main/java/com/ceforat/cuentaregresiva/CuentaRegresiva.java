package com.ceforat.cuentaregresiva;

import java.util.Scanner;

public class CuentaRegresiva {

    public static void main(String[] args) {
        System.out.println("Escribe un nùmero entero positivo");
        Scanner entrada = new Scanner(System.in);
        int numero=Integer.parseInt(entrada.nextLine());
        while (numero>=0) {
            System.out.println(numero);
           //Retraso de 1 segundo entre cada iteración 
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numero--;
        }

        System.out.println("Hello World! despues de 2 segundos");
        
    }
}
