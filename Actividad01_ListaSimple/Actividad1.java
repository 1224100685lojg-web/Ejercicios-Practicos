/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;
import java.util.Random;
import java.util.Scanner;
/**
 *
 *El código implementa una lista enlazada simple de números enteros en Java.
 *Una lista enlazada es una estructura donde cada elemento (nodo) contiene un dato y una referencia al siguiente nodo.
 *
 * @author Luis Owen Jaramillo Guerrero
 */
public class Actividad1 {
// Lista enlazada simple de enteros: insertar al final, recorrer, eliminar nodos mayores a un valor.

    // Nodo para lista simple
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    private Node head = null;

    /**
     * Inserta un valor al final de la lista.
     */
    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = newNode;
    } /**********************/

    /**
     * Recorre la lista e imprime los valores.
     */
    public void traversePrint() {
        System.out.println("Contenido de la lista:");
        Node cur = head;
        if (cur == null) {
            System.out.println("(vacía)");
            return;
        }
        while (cur != null) {
            System.out.print(cur.data + (cur.next != null ? " -> " : ""));
            cur = cur.next;
        }
        System.out.println();
    } /**********************/

    /**
     * Elimina todos los nodos cuyo valor sea mayor que 'limit'.
     */
    public void removeGreaterThan(int limit) {
        while (head != null && head.data > limit) {
            head = head.next;
        }
        if (head == null) return;
        Node prev = head;
        Node cur = head.next;
        while (cur != null) {
            if (cur.data > limit) {
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
    } 
}


