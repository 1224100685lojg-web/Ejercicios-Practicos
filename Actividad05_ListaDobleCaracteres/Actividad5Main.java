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
public class Actividad5Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Actividad5 lista = new Actividad5();

        System.out.println("=== Actividad 5 - Lista doblemente enlazada de caracteres ===");
        System.out.print("Ingrese una cadena: ");
        String s = sc.nextLine();

        lista.buildFromString(s);
        System.out.println("Lista original:");
        lista.printList();

        lista.bubbleSort();
        System.out.println("Lista ordenada:");
        lista.printList();
        sc.close();
    } 
}
    
