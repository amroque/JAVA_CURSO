
package arreglo1;

import java.util.Scanner;

public class Arreglo1 {
        

    public static void main(String[] args) {
        int enteros[]=new int[5];
        int longitudDeArreglo=enteros.length;
        int numero;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserta 5 valores");       
        
        for (int i = 0; i < longitudDeArreglo; i++) {
            numero=teclado.nextInt();
            enteros[i]=numero;            
        }
        for (int i = 0; i < longitudDeArreglo; i++) {
            System.out.println("Areglo en la posioción " +i+ ": "+enteros[i]);          
        }
               
        
    }
   
}
