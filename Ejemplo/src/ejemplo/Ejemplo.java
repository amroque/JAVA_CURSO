/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

/**
 *
 * @author ARIEL
 */
public class Ejemplo {
// EJERCICIO 1: Crear e imprimir una matriz
    // Crea una matriz de 3x3 con números del 1 al 9 e imprímela

    public static void ejercicio1() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("=== EJERCICIO 1: Imprimir matriz ===");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // EJERCICIO 2: Suma de elementos
    // Calcula la suma de todos los elementos de una matriz
    public static int ejercicio2() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println("\n=== EJERCICIO 2: Suma de elementos ===");
        System.out.println("Suma total: " + suma);
        return suma;
    }

    // EJERCICIO 3: Encontrar el mayor elemento
    // Encuentra el número mayor en la matriz
    public static int ejercicio3() {
        int[][] matriz = {
            {15, 28, 3},
            {42, 7, 19},
            {33, 11, 5}
        };

        int mayor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        System.out.println("\n=== EJERCICIO 3: Mayor elemento ===");
        System.out.println("Mayor: " + mayor);
        return mayor;
    }

    // EJERCICIO 4: Diagonal principal
    // Suma los elementos de la diagonal principal (matriz cuadrada)
    public static int ejercicio4() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }

        System.out.println("\n=== EJERCICIO 4: Diagonal principal ===");
        System.out.println("Suma diagonal: " + suma);
        return suma;
    }

    // EJERCICIO 5: Transpuesta de una matriz
    // Crea la matriz transpuesta (intercambia filas por columnas)
    public static int[][] ejercicio5() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\n=== EJERCICIO 5: Matriz transpuesta ===");
        System.out.println("Original:");
        imprimirMatriz(matriz);
        System.out.println("Transpuesta:");
        imprimirMatriz(transpuesta);

        return transpuesta;
    }

    // EJERCICIO 6: Suma de matrices
    // Suma dos matrices del mismo tamaño
    public static int[][] ejercicio6() {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matriz2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("\n=== EJERCICIO 6: Suma de matrices ===");
        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);
        System.out.println("Resultado:");
        imprimirMatriz(resultado);

        return resultado;
    }

    // EJERCICIO 7: Buscar un elemento
    // Busca un número en la matriz y retorna su posición
    public static void ejercicio7() {
        int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int buscar = 50;
        boolean encontrado = false;

        System.out.println("\n=== EJERCICIO 7: Buscar elemento ===");
        System.out.println("Buscando: " + buscar);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == buscar) {
                    System.out.println("Encontrado en posición [" + i + "][" + j + "]");
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No encontrado");
        }
    }

    // EJERCICIO 8: Matriz identidad
    // Crea una matriz identidad de tamaño n x n
    public static int[][] ejercicio8(int n) {
        int[][] identidad = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    identidad[i][j] = 1;
                } else {
                    identidad[i][j] = 0;
                }
            }
        }

        System.out.println("\n=== EJERCICIO 8: Matriz identidad ===");
        System.out.println("Matriz identidad de " + n + "x" + n + ":");
        imprimirMatriz(identidad);

        return identidad;
    }

    // MÉTODO AUXILIAR: Imprimir matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8(4);
    }

}
