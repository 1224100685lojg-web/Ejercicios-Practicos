/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;
import java.util.Scanner;
import java.util.Stack;

/**
 * Actividad 2: Pila de Nombres
 * 
 * Esta clase permite al usuario ingresar nombres y almacenarlos en una pila.
 * Cuando el usuario escribe "FIN", el programa muestra los nombres en orden inverso
 * al que fueron ingresados, utilizando las operaciones básicas de una pila:
 *  - push(): para apilar nombres.
 *  - pop(): para desapilar e imprimir en orden inverso.
 * 
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class PilaDeNombres {

    /**
     * Método principal que controla el flujo del programa.
     * Permite al usuario ingresar nombres hasta escribir "FIN",
     * y luego los muestra en orden inverso usando una pila.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pila = new Stack<>();
        String nombre;

        System.out.println("=== Actividad 2: Pila de Nombres ===");

        // Leer nombres hasta que el usuario escriba 'FIN'
        while (true) {
            System.out.print("Ingrese un nombre (FIN para salir): ");
            nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("FIN")) break;
            pila.push(nombre); // Apilar el nombre
        }

        // Mostrar los nombres en orden inverso (desapilando)
        System.out.println("\n--- Nombres en orden inverso ---");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        sc.close();
    }
}
/***********************/
