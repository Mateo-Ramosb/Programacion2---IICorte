/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

/**
 *
 * @author Biblioteca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 4; // Tamaño de la matriz
        int[][] matriz = new int[n][n];

     
        int contador = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = contador++;
            }
        }

        
        System.out.println("Matriz completa:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        
        System.out.println("\nDiagonal 1:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        
        System.out.println("\nDiagonal 2:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][n - 1 - i] + " ");
        }
    }
}
    
    

