/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasfor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Biblioteca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          ArrayList<String> nombres = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        String[] menu = {
            "Agregar Nombre",
            "Eliminar Nombre",
            "Actualizar Nombre",
            "Mostrar Nombres",
            "Salir"
        };

        while (continuar) {
            // Ciclo for para mostrar el menú
            System.out.println("\n--- MENU ---");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }

            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            if (opcion == 1) {
                System.out.print("Ingresa el nombre a agregar: ");
                String nombre = scanner.nextLine();
                nombres.add(nombre);
                System.out.println("Nombre agregado.");
            }

            if (opcion == 2) {
                System.out.print("Ingresa el nombre a eliminar: ");
                String eliminar = scanner.nextLine();
                nombres.remove(eliminar); // elimina si existe
                System.out.println("Intento de eliminación realizado.");
            }

            if (opcion == 3) {
                System.out.print("Ingresa el nombre a actualizar: ");
                String viejo = scanner.nextLine();

                for (int i = 0; i < nombres.size(); i++) {
                    if (nombres.get(i).equals(viejo)) {
                        System.out.print("Ingresa el nuevo nombre: ");
                        String nuevo = scanner.nextLine();
                        nombres.set(i, nuevo); // actualizar
                        System.out.println("Nombre actualizado.");
                        break;
                    }
                }
            }

            if (opcion == 4) {
                System.out.println("Lista de nombres:");
                for (String nombre : nombres) {
                    System.out.println("- " + nombre);
                }
            }

            if (opcion == 5) {
                continuar = false;
                System.out.println("Programa finalizado.");
            }
        }
    }
}
    
    
