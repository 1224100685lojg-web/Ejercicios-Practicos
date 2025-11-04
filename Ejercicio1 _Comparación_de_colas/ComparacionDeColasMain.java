/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cola;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * Clase principal que prueba el método de comparación de colas.
 * 
 * Permite:
 * - Crear dos colas con valores introducidos por el usuario.
 * - Compararlas y mostrar si son idénticas o no.
 * 
 * @author Luis Owen
 */
public class ComparacionDeColasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();

        System.out.println("=== Ejercicio 1: Comparación de Colas ===");

        // Solicita datos para la primera cola
        System.out.print("¿Cuántos elementos tendrá la primera cola?: ");
        int n = sc.nextInt();
        System.out.println("Ingrese los elementos de la primera cola:");
        for (int i = 0; i < n; i++) {
            cola1.offer(sc.nextInt());
        }

        // Solicita datos para la segunda cola
        System.out.print("\n¿Cuántos elementos tendrá la segunda cola?: ");
        int m = sc.nextInt();
        System.out.println("Ingrese los elementos de la segunda cola:");
        for (int i = 0; i < m; i++) {
            cola2.offer(sc.nextInt());
        }

        // Mostrar colas ingresadas
        System.out.println("\nCola 1: " + cola1);
        System.out.println("Cola 2: " + cola2);

        // Comparar
        boolean iguales = ComparacionDeColas.compararColas(cola1, cola2);

        if (iguales)
            System.out.println("\n✅ Las colas son idénticas.");
        else
            System.out.println("\n❌ Las colas son diferentes.");

        sc.close();
    }
}
