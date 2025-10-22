/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;
import java.util.Scanner;


/**
 *
 * @author Owen_04
 */
public class Actividad2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Actividad2 lista = new Actividad2();
        String archivo = "palabras.txt";

        System.out.println("=== Actividad 2 - Lista enlazada de palabras ===");
        lista.loadFromFile(archivo);
        lista.printList();

        System.out.print("¿Desea agregar una palabra? (s/n): ");
        if (sc.nextLine().trim().equalsIgnoreCase("s")) {
            System.out.print("Palabra: ");
            lista.insertLast(sc.nextLine());
        }

        System.out.print("¿Desea eliminar una palabra? (s/n): ");
        if (sc.nextLine().trim().equalsIgnoreCase("s")) {
            System.out.print("Palabra a eliminar: ");
            String w = sc.nextLine();
            if (lista.removeWord(w))
                System.out.println("Palabra eliminada.");
            else
                System.out.println("No se encontró la palabra.");
        }

        lista.printList();

        System.out.print("¿Guardar cambios? (s/n): ");
        if (sc.nextLine().trim().equalsIgnoreCase("s"))
            lista.writeToFile(archivo);

        sc.close();
    } 
}
    
