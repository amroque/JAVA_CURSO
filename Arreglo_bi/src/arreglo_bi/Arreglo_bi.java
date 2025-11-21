
package arreglo_bi;

import java.util.Arrays;
import java.util.Scanner;

public class Arreglo_bi {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabla[][] = new int[3][3];
        System.out.println("Inserte valores para llenar una tabla de 3x3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabla[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {                
              System.out.print(tabla[i][j] + " ");
            }
            System.out.print("\n");
            
        }

    }

}
