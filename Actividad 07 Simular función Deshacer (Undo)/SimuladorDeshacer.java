/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;
import java.util.Scanner;
import java.util.Stack;

/**
 * Actividad 7: Simular función "Deshacer" (Undo) usando una pila.
 * 
 * Esta clase simula el comportamiento básico de una función "Deshacer".
 * El usuario puede ingresar acciones que se apilan. 
 * Cuando se escribe "UNDO", se elimina (desapila) la última acción realizada.
 * 
 * Funcionalidades:
 *  - Registrar acciones del usuario.
 *  - Deshacer la última acción usando la pila.
 *  - Mostrar el estado actual de acciones en todo momento.
 * 
 * Comandos especiales:
 *  - UNDO → deshace la última acción.
 *  - FIN  → termina la simulación.
 * 
 * Ejemplo de funcionamiento:
 * Entrada:
 *   Acción (UNDO/FIN): escribir Hola
 *   Acción (UNDO/FIN): escribir Mundo
 *   Acción (UNDO/FIN): UNDO
 * 
 * 
 * @author Luis Owen Jaramillo GGuerrero
 */
public class SimuladorDeshacer {

    /**
     * Método principal que permite ingresar acciones
     * y simular el comportamiento de deshacer (UNDO).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> acciones = new Stack<>();

        System.out.println("=== Actividad 7: Simulación de función Deshacer (UNDO) ===");
        System.out.println("Escriba una acción, o 'UNDO' para deshacer, o 'FIN' para salir.\n");

        while (true) {
            System.out.print("Acción (UNDO/FIN): ");
            String act = sc.nextLine();

            if (act.equalsIgnoreCase("FIN")) {
                break;
            } else if (act.equalsIgnoreCase("UNDO")) {
                if (!acciones.isEmpty()) {
                    String deshecha = acciones.pop();
                    System.out.println("Acción deshecha: " + deshecha);
                } else {
                    System.out.println("No hay acciones para deshacer.");
                }
            } else {
                acciones.push(act);
                System.out.println("Acción registrada: " + act);
            }

            System.out.println("Actual: " + acciones);
            System.out.println();
        }

        System.out.println("Simulación finalizada. Acciones restantes: " + acciones);
        sc.close();
    }
}
/***********************/