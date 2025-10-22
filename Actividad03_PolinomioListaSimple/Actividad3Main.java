/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;
import java.util.Scanner;

/**
 *
* Clase principal para ejecutar la Actividad3.
 * Permite al usuario:
 * - Ingresar términos de un polinomio (coeficiente y exponente) de manera interactiva.
 * - Mostrar una tabla de valores del polinomio evaluado en un rango de x.
 *
 * @author Luis Owen Jaramillo Guerrero
 */
public class Actividad3Main {

    /**
      Método principal que controla la ejecución del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Actividad3 poli = new Actividad3();

        System.out.println("=== Actividad 3 - Polinomio con lista enlazada ===");
        System.out.println("Ingrese pares (coeficiente exponente). Escriba 'fin' para terminar.");

        // Ciclo para ingresar términos hasta que el usuario escriba "fin"
        while (true) {
            System.out.print("Coeficiente (o 'fin'): ");
            String in = sc.next();
            if (in.equalsIgnoreCase("fin")) break;
            double c = Double.parseDouble(in);
            System.out.print("Exponente: ");
            int e = sc.nextInt();
            // Inserta el término en la lista del polinomio
            poli.insertTerm(c, e);
        }
        // Muestra la tabla de valores P(x) para x desde 0.0 hasta 5.0
        System.out.println("\nTabla de valores:");
        poli.printTable();
        sc.close();
    } /**********************/
}
