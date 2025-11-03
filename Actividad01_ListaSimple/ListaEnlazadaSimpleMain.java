/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * Clase principal que ejecuta la prueba de la lista enlazada simple.
 * 
 * Permite:
 * - Generar una lista enlazada simple con números aleatorios.
 * - Mostrar el contenido de la lista.
 * - Eliminar los nodos con valores mayores a un límite dado por el usuario.
 * 
 * Esta clase demuestra que la implementación de la lista funciona correctamente.
 * 
 * @author Luis Owen
 */
public class ListaEnlazadaSimpleMain {

    /**
     * Método principal que controla la ejecución del programa.
     * Solicita datos al usuario, genera números aleatorios y utiliza
     * los métodos definidos en la clase ListaEnlazadaSimple.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        System.out.println("=== Actividad 1: Lista Enlazada Simple de Enteros ===");
        System.out.print("¿Cuántos números aleatorios desea generar?: ");
        int n = sc.nextInt();
        System.out.print("Valor máximo aleatorio: ");
        int max = sc.nextInt();

        // Inserta 'n' números aleatorios entre 1 y 'max' en la lista
        for (int i = 0; i < n; i++) {
            lista.insertarFinal(1 + rnd.nextInt(Math.max(1, max)));
        }

        System.out.println("\n--- Lista generada ---");
        lista.mostrarLista();

        // Pide el valor límite y elimina los nodos mayores a ese valor
        System.out.print("\nIngrese valor límite para eliminar mayores: ");
        int limite = sc.nextInt();
        lista.eliminarMayoresQue(limite);

        System.out.println("\n--- Lista después de eliminar valores mayores a " + limite + " ---");
        lista.mostrarLista();

        System.out.println("\n✅ Ejecución finalizada correctamente.");
        sc.close();
    }
}
/***********************/
