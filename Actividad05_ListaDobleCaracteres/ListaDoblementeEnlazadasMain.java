/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;

import java.util.Scanner;
/**
 * Clase principal que prueba la funcionalidad de la lista doblemente enlazada de caracteres.
 * 
 * Permite al usuario ingresar una cadena, mostrarla como lista y luego
 * ordenarla alfabéticamente.
 * 
 * @author Luis Owen
 */
public class ListaDoblementeEnlazadasMain {

    /**
     * Método principal que ejecuta la prueba.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDoblementeEnlazadas lista = new ListaDoblementeEnlazadas();

        System.out.println("=== Actividad 5: Lista Doblemente Enlazada de Caracteres ===");
        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

        // Construir lista desde la cadena
        lista.construirDesdeCadena(texto);
        System.out.println("\n--- Lista original ---");
        lista.mostrarLista();

        // Ordenar lista
        lista.ordenarBurbuja();
        System.out.println("\n--- Lista ordenada alfabéticamente ---");
        lista.mostrarLista();

        System.out.println("\n✅ Ejecución finalizada correctamente.");
        sc.close();
    }
}
/***********************/
