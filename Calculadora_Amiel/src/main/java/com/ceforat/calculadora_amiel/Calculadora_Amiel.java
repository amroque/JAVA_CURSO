package com.ceforat.calculadora_amiel;

import java.util.Scanner;

public class Calculadora_Amiel {

    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      Double numUno;
      Double numDos;
      Double resultado;
      String operacion;
        System.out.println("Ingresa un numero");
        numUno = Double.parseDouble(entrada.nextLine());;
        System.out.println("Ingresa otro numero");
        numDos = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese la operacion");
        operacion =entrada.nextLine();
        switch (operacion) {
            case "+": resultado=numUno+numDos;
                break;
            case "-": resultado=numUno-numDos;
                break;
            case "*":resultado=numUno*numDos;
                break;
            case "/":resultado=numUno/numDos;
                break;
            default:
                throw new AssertionError();
        }
        System.out.println(resultado);
}
}