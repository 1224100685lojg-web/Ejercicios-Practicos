/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;
import java.util.*;


/**
 * Clase Supermercado
 * 
 * Simula el funcionamiento de un supermercado con carritos y cajas.
 * Se utilizan colas para modelar las cajas y una cola adicional para los carritos disponibles.
 * 
 * @author Luis Owen
 */
public class Supermercado {
    
    private Queue<Integer> carritos;          // Carritos disponibles
    private Queue<Cliente>[] cajas;           // Colas de cajas
    private int totalClientes = 0;            // Contador de clientes que han llegado
    private Random random = new Random();

    /**
     * Constructor: Inicializa las colas de carritos y cajas.
     */
    @SuppressWarnings("unchecked")
    public Supermercado(int numCarritos, int numCajas) {
        carritos = new LinkedList<>();
        for (int i = 1; i <= numCarritos; i++) {
            carritos.offer(i); // Los carritos se numeran del 1 al n
        }

        cajas = new LinkedList[numCajas];
        for (int i = 0; i < numCajas; i++) {
            cajas[i] = new LinkedList<>();
        }
    }

    /**
     * Simula un nuevo cliente que llega al supermercado.
     * - Si hay carritos, lo toma y se forma en la caja con menos clientes.
     * - Si no hay carritos, el cliente espera afuera.
     */
    public void llegaCliente() {
        totalClientes++;
        System.out.println("\n🧍 Llega el cliente #" + totalClientes);

        if (carritos.isEmpty()) {
            System.out.println("🚫 No hay carritos disponibles, el cliente espera...");
            return;
        }

        int carrito = carritos.poll(); // Toma un carrito
        Cliente nuevo = new Cliente(totalClientes, carrito);

        // Busca la caja con menos clientes
        int cajaElegida = 0;
        for (int i = 1; i < cajas.length; i++) {
            if (cajas[i].size() < cajas[cajaElegida].size()) {
                cajaElegida = i;
            }
        }

        cajas[cajaElegida].offer(nuevo);
        System.out.println("🛒 Cliente #" + nuevo.getId() + " toma el carrito #" + carrito + " y se forma en la caja " + (cajaElegida + 1));
    }

    /**
     * Atiende un cliente de cada caja (si hay alguno).
     * Al pagar, libera su carrito.
     */
    public void atenderClientes() {
        for (int i = 0; i < cajas.length; i++) {
            if (!cajas[i].isEmpty()) {
                Cliente atendido = cajas[i].poll();
                System.out.println("💰 Caja " + (i + 1) + " atendió al cliente #" + atendido.getId());
                carritos.offer(atendido.getCarrito());
                System.out.println("🛒 Carrito #" + atendido.getCarrito() + " ha sido liberado.");
            } else {
                System.out.println("🕓 Caja " + (i + 1) + " no tiene clientes en este turno.");
            }
        }
    }

    /**
     * Muestra el estado actual del supermercado.
     */
    public void mostrarEstado() {
        System.out.println("\n===== ESTADO ACTUAL =====");
        System.out.println("Carritos disponibles: " + carritos.size());
        for (int i = 0; i < cajas.length; i++) {
            System.out.print("Caja " + (i + 1) + ": ");
            if (cajas[i].isEmpty()) {
                System.out.println("(vacía)");
            } else {
                for (Cliente c : cajas[i]) {
                    System.out.print("#" + c.getId() + " ");
                }
                System.out.println();
            }
        }
        System.out.println("==========================");
    }
}

/***********************/
