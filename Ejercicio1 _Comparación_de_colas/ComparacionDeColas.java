/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Contiene métodos para trabajar con estructuras tipo cola.
 * En este ejercicio se implementa la comparación de dos colas.
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class ComparacionDeColas {
    
    /**
     * Compara dos colas y devuelve true si son idénticas (mismo tamaño y mismos elementos en orden).
     * 
     * @param <T> Tipo de dato contenido en la cola
     * @param cola1 Primera cola
     * @param cola2 Segunda cola
     * @return true si las colas son iguales, false en caso contrario
     */
    public static <T> boolean compararColas(Queue<T> cola1, Queue<T> cola2) {
        // Si los tamaños son diferentes, ya no son iguales
        if (cola1.size() != cola2.size()) {
            return false;
        }

        // Colas auxiliares para preservar el estado original
        Queue<T> aux1 = new LinkedList<>();
        Queue<T> aux2 = new LinkedList<>();

        boolean iguales = true;

        while (!cola1.isEmpty()) {
            T elem1 = cola1.poll();
            T elem2 = cola2.poll();

            // Guardamos los elementos en las colas auxiliares para restaurarlos después
            aux1.offer(elem1);
            aux2.offer(elem2);

            if (!elem1.equals(elem2)) {
                iguales = false;
            }
        }

        // Restauramos las colas originales
        while (!aux1.isEmpty()) {
            cola1.offer(aux1.poll());
            cola2.offer(aux2.poll());
        }

        return iguales;
    }
}