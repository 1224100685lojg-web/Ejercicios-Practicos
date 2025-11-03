/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;

import java.util.Scanner;


/**
 * Clase principal que demuestra el uso de la lista enlazada de palabras.
 * 
 * Permite al usuario:
 * - Cargar palabras desde un archivo existente.
 * - Insertar nuevas palabras.
 * - Eliminar una palabra.
 * - Mostrar el contenido actual de la lista.
 * - Guardar los cambios en el archivo.
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class ListaEnlazadaPalabrasMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazadaPalabras lista = new ListaEnlazadaPalabras();
        String archivo = "palabras.txt";
        int opcion;

        System.out.println("=== ACTIVIDAD 2: Lista enlazada de palabras ===");

        lista.cargarDesdeArchivo(archivo);

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar palabra");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Eliminar palabra");
            System.out.println("4. Guardar en archivo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese la palabra: ");
                    String palabra = sc.nextLine();
                    lista.insertarFinal(palabra);
                    System.out.println("Palabra agregada correctamente.");
                }
                case 2 -> lista.mostrarLista();
                case 3 -> {
                    System.out.print("Ingrese la palabra a eliminar: ");
                    String palabra = sc.nextLine();
                    boolean eliminado = lista.eliminarPalabra(palabra);
                    if (eliminado)
                        System.out.println("Palabra eliminada correctamente.");
                    else
                        System.out.println("La palabra no se encontró en la lista.");
                }
                case 4 -> lista.guardarEnArchivo(archivo);
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}