/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Clase que implementa una lista enlazada simple de palabras (cadenas de texto).
 * 
 * Permite:
 * - Insertar palabras al final de la lista.
 * - Cargar palabras desde un archivo.
 * - Eliminar una palabra específica.
 * - Mostrar el contenido de la lista.
 * - Guardar la lista en un archivo.
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class ListaEnlazadaPalabras {

    /**
     * Clase interna que representa un nodo de la lista enlazada.
     * Cada nodo contiene una palabra y una referencia al siguiente nodo.
     */
    static class Nodo {
        private String palabra;
        private Nodo siguiente;

        public Nodo(String palabra) {
            this.palabra = palabra;
            this.siguiente = null;
        }

        public String getPalabra() {
            return palabra;
        }

        public void setPalabra(String palabra) {
            this.palabra = palabra;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    } /**********************/

    private Nodo cabeza = null;

    /**
     * Inserta una palabra al final de la lista.
     * @param palabra palabra a insertar
     */
    public void insertarFinal(String palabra) {
        Nodo nuevo = new Nodo(palabra);
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
     * Carga palabras desde un archivo de texto y las inserta en la lista.
     * @param nombreArchivo nombre del archivo de texto
     */
    public void cargarDesdeArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            System.out.println("El archivo no existe. Se creará uno nuevo al guardar.");
            return;
        }
        try (Scanner sc = new Scanner(archivo)) {
            while (sc.hasNext()) {
                insertarFinal(sc.next());
            }
            System.out.println("Palabras cargadas correctamente desde el archivo.");
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    } /*

    /**
     * Muestra todas las palabras almacenadas en la lista.
     */
    public void mostrarLista() {
        Nodo actual = cabeza;
        if (actual == null) {
            System.out.println("(Lista vacía)");
            return;
        }
        System.out.print("Contenido de la lista: ");
        while (actual != null) {
            System.out.print(actual.getPalabra());
            if (actual.getSiguiente() != null) System.out.print(" ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    } /**********************/

    /**
     * Elimina la primera aparición de una palabra específica en la lista.
     * @param objetivo palabra que se desea eliminar
     * @return true si se eliminó, false si no se encontró
     */
    public boolean eliminarPalabra(String objetivo) {
        if (cabeza == null) return false;

        if (cabeza.getPalabra().equalsIgnoreCase(objetivo)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        Nodo anterior = cabeza;
        Nodo actual = cabeza.getSiguiente();

        while (actual != null) {
            if (actual.getPalabra().equalsIgnoreCase(objetivo)) {
                anterior.setSiguiente(actual.getSiguiente());
                return true;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
        return false;
    } 

    /**
     * Guarda todas las palabras de la lista en un archivo de texto,
     * separadas por espacios.
     * @param nombreArchivo nombre del archivo donde se guardará el contenido
     */
    public void guardarEnArchivo(String nombreArchivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo))) {
            Nodo actual = cabeza;
            boolean primera = true;
            while (actual != null) {
                if (!primera) pw.print(" ");
                pw.print(actual.getPalabra());
                primera = false;
                actual = actual.getSiguiente();
            }
            System.out.println("Archivo guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar archivo: " + e.getMessage());
        }
    } 
}
