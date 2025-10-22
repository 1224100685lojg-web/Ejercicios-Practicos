/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;
import java.util.Scanner;

/**
 *
 * Clase principal para ejecutar la Actividad4.
 * Permite al usuario:
 * - Ingresar términos de un polinomio (coeficiente y exponente) en una lista circular.
 * - Recorrer e imprimir todos los términos en orden.
 * - Evaluar el polinomio y mostrar una tabla de valores P(x) para x en un rango definido.
 *
 * @author Luis Owen Jaramillo Guerrero
 */
public class Actividad4Main {

    /**
     * Método principal que controla la ejecución del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Actividad4 poli = new Actividad4();

        System.out.println("=== Actividad 4 - Polinomio con lista circular ===");
        System.out.println("Ingrese coeficiente y exponente (fin para terminar):");
        
        // Ciclo para ingresar términos hasta que el usuario escriba "fin"
        while (true) {
            System.out.print("Coeficiente (o 'fin'): ");
            String in = sc.next();
            if (in.equalsIgnoreCase("fin")) break;
            double c = Double.parseDouble(in);
            System.out.print("Exponente: ");
            int e = sc.nextInt();
            // Inserta el término en la lista circular
            poli.insertTerm(c, e);
        }

        // Mostrar recorrido circular de los términos
        System.out.println("\nRecorrido circular:");
        poli.traverse();

        // Mostrar tabla de valores P(x) para x desde 0.0 hasta 5.0
        System.out.println("\nTabla de valores:");
        System.out.printf("%-6s | %-10s%n", "x", "P(x)");
        for (double x = 0.0; x <= 5.0; x += 0.5)
            System.out.printf("%-6.1f | %-10.4f%n", x, poli.evaluateAt(x));
        sc.close();
    } /**********************/
}

