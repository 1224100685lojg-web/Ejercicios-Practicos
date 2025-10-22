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
public class Actividad4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Actividad4 poli = new Actividad4();

        System.out.println("=== Actividad 4 - Polinomio con lista circular ===");
        System.out.println("Ingrese coeficiente y exponente (fin para terminar):");

        while (true) {
            System.out.print("Coeficiente (o 'fin'): ");
            String in = sc.next();
            if (in.equalsIgnoreCase("fin")) break;
            double c = Double.parseDouble(in);
            System.out.print("Exponente: ");
            int e = sc.nextInt();
            poli.insertTerm(c, e);
        }

        System.out.println("\nRecorrido circular:");
        poli.traverse();

        System.out.println("\nTabla de valores:");
        System.out.printf("%-6s | %-10s%n", "x", "P(x)");
        for (double x = 0.0; x <= 5.0; x += 0.5)
            System.out.printf("%-6.1f | %-10.4f%n", x, poli.evaluateAt(x));
        sc.close();
    } /**********************/
}

