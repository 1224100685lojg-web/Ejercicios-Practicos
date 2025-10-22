/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;
import java.util.Random;
import java.util.Scanner;

/**
 *
* Clase principal que ejecuta la Actividad 1.
 * 
 * Permite:
 * - Generar una lista enlazada simple con números aleatorios.
 * - Mostrar el contenido de la lista.
 * - Eliminar los nodos con valores mayores a un límite dado por el usuario.
 *
 * @author Luis Owen Jaramillo Guerrero
 */
public class Actividad1Main {

    /**
     * Método principal que controla la ejecución del programa.
     * Solicita datos al usuario, genera números aleatorios y utiliza
     * los métodos definidos en la clase Actividad1
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic class PrincipalActividad1 {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        Actividad1 lista = new Actividad1();
        
        // Solicitar al usuario cuántos números generar y el valor máximo
        System.out.println("=== Actividad 1 - Lista enlazada simple (enteros) ===");
        System.out.print("¿Cuántos números generar aleatoriamente? ");
        int n = sc.nextInt();
        System.out.print("Valor máximo aleatorio: ");
        int max = sc.nextInt();

        // Inserta 'n' números aleatorios entre 1 y 'max' en la lista
        for (int i = 0; i < n; i++) {
            lista.insertLast(1 + rnd.nextInt(Math.max(1, max)));
        }
        // Muestra el contenido inicial de la lista
        lista.traversePrint();
        
        // Pide el valor límite y elimina los nodos mayores a ese valor
        System.out.print("Ingrese valor límite: ");
        int limite = sc.nextInt();

        lista.removeGreaterThan(limite);

        // Muestra el contenido final de la lista después de eliminar
        System.out.println("Lista luego de eliminar > " + limite + ":");
        lista.traversePrint();
        sc.close();
    }
}

    

