/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;
import java.util.Stack;

/**
 * Actividad 9: Revertir lista usando una pila.
 * 
 * Esta clase demuestra cómo invertir los elementos de una lista utilizando una pila.
 * 
 * Algoritmo:
 *  1. Apilar los elementos de la lista uno por uno.
 *  2. Desapilar los elementos e imprimirlos en orden inverso.
 * 
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class RevertirLista {

    /**
     * Método principal que invierte los elementos de un arreglo usando una pila.
     */
    public static void main(String[] args) {
        System.out.println("=== Actividad 9: Revertir Lista ===");

        // Lista original
        int[] lista = {1, 2, 3, 4};
        System.out.print("Lista original: ");
        for (int n : lista) System.out.print(n + " ");
        System.out.println();

        // Crear pila
        Stack<Integer> pila = new Stack<>();

        // Apilar los elementos
        for (int n : lista) pila.push(n);

        // Desapilar e imprimir en orden inverso
        System.out.print("Lista invertida: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop() + " ");
        }

        System.out.println();
    }
}
/***********************/
