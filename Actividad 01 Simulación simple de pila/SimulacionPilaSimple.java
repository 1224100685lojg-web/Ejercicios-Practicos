/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

import java.util.Stack;

/**
 * Actividad 1: Simulación simple de pila
 * 
 * Esta clase demuestra las operaciones básicas de una pila (Stack):
 *  - Inserción de elementos (push)
 *  - Eliminación de elementos (pop)
 *  - Visualización del contenido actual de la pila
 * 
 * Permite observar cómo los elementos se apilan y desapilan siguiendo
 * el principio LIFO (Last In, First Out).
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class SimulacionPilaSimple {

    /**
     * Método principal que ejecuta la simulación de la pila.
     * Crea una pila de enteros, inserta algunos valores, elimina
     * los dos últimos y muestra el estado final.
     */
    public static void main(String[] args) {
        // Crear una pila vacía de tipo Integer
        Stack<Integer> pila = new Stack<>();

        // Insertar elementos (operación push)
        pila.push(5);
        pila.push(10);
        pila.push(15);
        pila.push(20);

        // Eliminar los dos elementos más recientes (operación pop)
        pila.pop();
        pila.pop();

        // Mostrar el contenido actual de la pila
        System.out.println("Contenido actual de la pila: " + pila);
    }
}
/***********************/
