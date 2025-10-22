/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;
import java.util.Scanner;
/**
 *
* Clase principal para ejecutar la Actividad5.
 * Permite al usuario:
 * - Ingresar una cadena de caracteres.
 * - Crear una lista doblemente enlazada a partir de la cadena.
 * - Mostrar la lista original.
 * - Ordenar alfabéticamente los caracteres y mostrar la lista ordenada.

 * @author Luis Owen Jaramillo Guerrero
 */
public class Actividad5Main {

    /**
    //Método principal que controla la ejecución del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Actividad5 lista = new Actividad5();

        // Solicitar cadena al usuario
        System.out.println("=== Actividad 5 - Lista doblemente enlazada de caracteres ===");
        System.out.print("Ingrese una cadena: ");
        String s = sc.nextLine();

        // Mostrar lista original
        lista.buildFromString(s);
        System.out.println("Lista original:");
        lista.printList();

        // Ordenar la lista alfabéticamente
        lista.bubbleSort();
        System.out.println("Lista ordenada:");
        lista.printList();
        sc.close();
    } 
}
    
