/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos2025;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner lectura = new Scanner(System.in);
        boolean ciclo = true;

        double nota1 = 0, nota2 = 0, nota3 = 0;
        boolean nota1Ingresada = false, nota2Ingresada = false, nota3Ingresada = false;

        while (ciclo) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Digitar Nota 1");
            System.out.println("2. Digitar Nota 2");
            System.out.println("3. Digitar Nota 3");
            System.out.println("4. Calcular Nota Final");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = lectura.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("DIGITAR NOTA 1: ");
                    nota1 = lectura.nextDouble();
                    nota1Ingresada = true;
                }
                case 2 -> {
                    System.out.print("DIGITAR NOTA 2: ");
                    nota2 = lectura.nextDouble();
                    nota2Ingresada = true;
                }
                case 3 -> {
                    System.out.print("DIGITAR NOTA 3: ");
                    nota3 = lectura.nextDouble();
                    nota3Ingresada = true;
                }
                case 4 -> {
                    if (nota1Ingresada && nota2Ingresada && nota3Ingresada) {
                        double notaFinal = (nota1 + nota2 + nota3) / 3;
                        System.out.println("La nota final es: " + notaFinal);
                    } else {
                        System.out.println("Por favor ingresa las tres notas antes de calcular.");
                    }
                }
                case 5 -> {
                    System.out.println("Efectivo");
                    ciclo = false;
                }
                default -> {
                    System.out.println("Opción no válida. Intenta de nuevo.");
                }
            }
        }
    }
}
        
   