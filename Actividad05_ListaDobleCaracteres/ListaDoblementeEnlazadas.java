/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

/**
 * Permite:
 * - Construir una lista doblemente enlazada a partir de una cadena de texto.
 * - Mostrar el contenido de la lista.
 * - Ordenar los caracteres de la lista alfabéticamente (usando el método burbuja).
 * 
 * Esta clase demuestra el uso de listas doblemente enlazadas.
 * 
 * @author Luis Owen
 */
public class ListaDoblementeEnlazadas {

    /**
     * Clase interna que representa un nodo de la lista doblemente enlazada.
     * Contiene un carácter y referencias al nodo anterior y siguiente.
     */
    static class Nodo {
        char caracter;
        Nodo anterior, siguiente;

        Nodo(char c) {
            caracter = c;
            anterior = null;
            siguiente = null;
        }
    }

    private Nodo cabeza = null; // Referencia al primer nodo de la lista

    /**
     * Construye la lista doblemente enlazada a partir de una cadena.
     * Cada carácter se convierte en un nodo.
     * 
     * @param cadena Cadena de texto a convertir en lista
     */
    public void construirDesdeCadena(String cadena) {
        cabeza = null;
        Nodo ultimo = null;

        for (char c : cadena.toCharArray()) {
            Nodo nuevo = new Nodo(c);
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                ultimo.siguiente = nuevo;
                nuevo.anterior = ultimo;
            }
            ultimo = nuevo;
        }
    } /**********************/

    /**
     * Muestra el contenido de la lista en orden.
     */
    public void mostrarLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.caracter);
            actual = actual.siguiente;
        }
        System.out.println();
    } /**********************/

    /**
     * Ordena los caracteres de la lista de forma alfabética (A-Z)
     * utilizando el algoritmo de burbuja.
     */
    public void ordenarBurbuja() {
        if (cabeza == null) return;

        boolean intercambio;
        do {
            intercambio = false;
            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                if (Character.toLowerCase(actual.caracter) > Character.toLowerCase(actual.siguiente.caracter)) {
                    char temp = actual.caracter;
                    actual.caracter = actual.siguiente.caracter;
                    actual.siguiente.caracter = temp;
                    intercambio = true;
                }
                actual = actual.siguiente;
            }
        } while (intercambio);
    } /**********************/
}
