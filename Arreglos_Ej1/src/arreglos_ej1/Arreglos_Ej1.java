
package arreglos_ej1;

import java.util.Scanner;

public class Arreglos_Ej1 {

    public static void main(String[] args) {
        int enteros[]=new int[5];
        int suma=0;
        int mayor=0;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Iserte 5 números");
        for (int i = 0; i < enteros.length; i++) {
            enteros[i]=teclado.nextInt();
            suma=enteros[i]+suma;
            if (mayor<enteros[i]) {
                mayor=enteros[i];                
            }
        }
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);            
        }
        System.out.println("La suma de lo selementos es: "+suma);
        System.out.println("El mayor nùmero es: "+mayor);
        
    }
    int matriz1 [][]=new int [4][7];
    
    
    int matriz [][]=new int [3][3];
    
}
