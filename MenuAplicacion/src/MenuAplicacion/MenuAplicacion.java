/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MenuAplicacion;

import java.util.Scanner;

public class MenuAplicacion {

    static String[] array = new String[10];
    static String[][] matriz = new String[4][4];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL --- \n 1. Calcular Área del Círculo \n 2. Ingresar Datos Array \n 3. Listar Datos Array \n 4. Listar Dato Array en Específico \n 5. Ingresar Datos Matriz \n 6. Listar Datos de la Matriz \n 7. Listar Dato Matriz en Específico \n 8. Exit");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    calcularAreaCirculo();
                    break;
                case 2:
                    ingresarDatosArray();
                    break;
                case 3:
                    listarDatosArray();
                    break;
                case 4:
                    listarDatoArrayEspecifico();
                    break;
                case 5:
                    ingresarDatosMatriz();
                    break;
                case 6:
                    listarDatosMatriz();
                    break;
                case 7:
                    listarDatoMatrizEspecifico();
                    break;
                case 8:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);
    }

    public static void calcularAreaCirculo() {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        scanner.nextLine();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El área del círculo es: %.2f\n", area);
    }

    public static void ingresarDatosArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato para la posición " + i + ": ");
            array[i] = scanner.nextLine();
        }
        System.out.println("Datos del array ingresados correctamente.");
    }

    public static void listarDatosArray() {
        System.out.println("Datos del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }

    public static void listarDatoArrayEspecifico() {
        System.out.print("Ingrese la posición del dato a mostrar (0-9): ");
        int pos = scanner.nextInt();
        scanner.nextLine();
        if (pos >= 0 && pos < array.length) {
            System.out.println("Dato en la posición " + pos + ": " + array[pos]);
        } else {
            System.out.println("Posición fuera de rango.");
        }
    }

    public static void ingresarDatosMatriz() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese dato para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextLine();
            }
        }
        System.out.println("Datos de la matriz ingresados correctamente.");
    }

    public static void listarDatosMatriz() {
        System.out.println("Datos de la matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void listarDatoMatrizEspecifico() {
        System.out.print("Ingrese número de fila (0-3): ");
        int fila = scanner.nextInt();
        System.out.print("Ingrese número de columna (0-3): ");
        int columna = scanner.nextInt();
        scanner.nextLine();
        if (fila >= 0 && fila < 4 && columna >= 0 && columna < 4) {
            System.out.println("Dato en la posición [" + fila + "][" + columna + "]: " + matriz[fila][columna]);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
}
    
