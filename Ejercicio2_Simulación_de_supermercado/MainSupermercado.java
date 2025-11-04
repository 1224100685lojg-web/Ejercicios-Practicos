/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cola;
import java.util.Scanner;

/**
 * Clase principal que ejecuta la simulación del supermercado.
 * 
 * Permite:
 * - Recibir clientes que llegan en intervalos de tiempo.
 * - Simular atención en las cajas.
 * - Mostrar el estado actual de carritos y filas.
 * 
 * @author Luis Owen
 */
public class MainSupermercado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Supermercado mercado = new Supermercado(25, 3);

        System.out.println("=== Ejercicio 2: Simulación de Supermercado ===");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una acción:");
            System.out.println("1. Llega un nuevo cliente");
            System.out.println("2. Atender clientes en las cajas");
            System.out.println("3. Mostrar estado del supermercado");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> mercado.llegaCliente();
                case 2 -> mercado.atenderClientes();
                case 3 -> mercado.mostrarEstado();
                case 4 -> continuar = false;
                default -> System.out.println("⚠️ Opción no válida.");
            }
        }

        System.out.println("\n🏁 Simulación finalizada. ¡Gracias!");
        sc.close();
    }
}
/***********************/