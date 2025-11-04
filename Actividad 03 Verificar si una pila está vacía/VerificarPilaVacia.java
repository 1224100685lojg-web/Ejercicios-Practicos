/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;
import java.util.Stack;

/**
 * Actividad 3: Verificar si una pila está vacía
 * 
 * Esta clase demuestra el uso del método isEmpty() de la clase Stack en Java.
 * Permite comprobar si una pila tiene elementos o está vacía antes y después
 * de realizar una inserción.
 * 
 * Operaciones utilizadas:
 *  - isEmpty(): verifica si la pila está vacía.
 *  - push(): agrega un elemento a la pila.
 * 
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class VerificarPilaVacia {

    /**
     * Método principal que ejecuta la demostración del uso de isEmpty()
     * en una pila de tipo Integer.
     */
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // Verifica si la pila está vacía al inicio
        System.out.println("¿Está vacía la pila? " + pila.isEmpty());

        // Inserta un elemento en la pila
        pila.push(1);

        // Verifica nuevamente si está vacía
        System.out.println("¿Está vacía la pila? " + pila.isEmpty());
    }
}
/***********************/