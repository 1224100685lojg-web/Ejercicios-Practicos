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
public class Actividad3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Actividad3 poli = new Actividad3();

        System.out.println("=== Actividad 3 - Polinomio con lista enlazada ===");
        System.out.println("Ingrese pares (coeficiente exponente). Escriba 'fin' para terminar.");

        while (true) {
            System.out.print("Coeficiente (o 'fin'): ");
            String in = sc.next();
            if (in.equalsIgnoreCase("fin")) break;
            double c = Double.parseDouble(in);
            System.out.print("Exponente: ");
            int e = sc.nextInt();
            poli.insertTerm(c, e);
        }

        System.out.println("\nTabla de valores:");
        poli.printTable();
        sc.close();
    } /**********************/
}
