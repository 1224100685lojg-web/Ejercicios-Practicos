/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;
import java.util.Scanner;


/**
 *
* Clase principal para ejecutar la Actividad2.
 * Permite al usuario:
 * - Cargar palabras desde un archivo en una lista enlazada.
 * - Mostrar la lista actual.
 * - Agregar nuevas palabras.
 * - Eliminar palabras existentes.
 * - Guardar los cambios en el archivo.
 *
 * @author Luis Owen Jaramillo Guerrero
 */
public class Actividad2Main {

    /**
    * Método principal que controla la ejecución del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Actividad2 lista = new Actividad2();
        String archivo = "palabras.txt";

        System.out.println("=== Actividad 2 - Lista enlazada de palabras ===");

        // Cargar palabras desde archivo
        lista.loadFromFile(archivo);
        //Monstrar lista actual
        lista.printList();
        
        // Preguntar al usuario si desea agregar una palabra
        System.out.print("¿Desea agregar una palabra? (s/n): ");
        if (sc.nextLine().trim().equalsIgnoreCase("s")) {
            System.out.print("Palabra: ");
            lista.insertLast(sc.nextLine());
        }

        // Preguntar si desea eliminar alguna palabra
        System.out.print("¿Desea eliminar una palabra? (s/n): ");
        if (sc.nextLine().trim().equalsIgnoreCase("s")) {
            System.out.print("Palabra a eliminar: ");
            String w = sc.nextLine();
            if (lista.removeWord(w))
                System.out.println("Palabra eliminada.");
            else
                System.out.println("No se encontró la palabra.");
        }
        // Mostrar lista final después de agregar/eliminar palabras
        lista.printList();

        // Preguntar si desea guardar los cambios en el archivo
        System.out.print("¿Guardar cambios? (s/n): ");
        if (sc.nextLine().trim().equalsIgnoreCase("s"))
            lista.writeToFile(archivo);

        sc.close();
    } 
}
    
