/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

/**
 * Clase que implementa una lista enlazada simple de números enteros.
 * Permite insertar valores, mostrar el contenido y eliminar los nodos
 * cuyos valores sean mayores a un límite especificado.
 * 
 * @author Luis Owen Jaramillo
 */
    public class ListaEnlazadaSimple {

    /**
     * Clase interna que representa un nodo de la lista enlazada.
     * Aplica encapsulamiento a sus atributos.
     */
    static class Nodo {
        private int dato;
        private Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }

        public int getDato() {
            return dato;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    } 

    private Nodo cabeza = null;

    /**
     * Inserta un nuevo nodo al final de la lista.
     * 
     */
    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo);
    } /**********************/

    /**
     * Muestra los elementos de la lista enlazada.
     */
    public void mostrarLista() {
        System.out.println("Contenido de la lista:");
        Nodo actual = cabeza;
        if (actual == null) {
            System.out.println("(Lista vacía)");
            return;
        }
        while (actual != null) {
            System.out.print(actual.getDato());
            if (actual.getSiguiente() != null) System.out.print(" -> ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    } 

    /**
     * Elimina todos los nodos cuyo valor sea mayor que el límite dado.
     * 
     */
    public void eliminarMayoresQue(int limite) {
        // Caso especial: eliminar nodos desde el inicio
        while (cabeza != null && cabeza.getDato() > limite) {
            cabeza = cabeza.getSiguiente();
        }
        if (cabeza == null) return;

        Nodo anterior = cabeza;
        Nodo actual = cabeza.getSiguiente();
        while (actual != null) {
            if (actual.getDato() > limite) {
                anterior.setSiguiente(actual.getSiguiente());
            } else {
                anterior = actual;
            }
            actual = actual.getSiguiente();
        }
    } 
}
