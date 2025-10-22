/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

/**
 *
* Permite:
 * - Construir una lista a partir de una cadena de caracteres.
 * - Mostrar la lista de caracteres.
 * - Ordenar los caracteres alfabéticamente usando Bubble Sort.
 *
 * @author Luis Owen Jaramillo Guerrero
 */
public class Actividad5 {
    // Actividad5.java
// Lista doblemente enlazada de caracteres: construir desde cadena, ordenar alfabéticamente y mostrar.
    static class Node {
        char ch; // carácter almacenado
        Node prev, next; // referencia al nodo anterior
        Node(char c) { ch = c; } // referencia al nodo siguiente
    }

    private Node head = null; // referencia al primer nodo de la lista
    
    //Construye la lista a partir de una cadena de caracteres.
    public void buildFromString(String s) {
        head = null;
        Node last = null;
        for (char c : s.toCharArray()) {
            Node n = new Node(c);
            if (head == null) head = n;
            else {
                last.next = n;
                n.prev = last;
            }
            last = n;
        }
    } /**********************/
    //Recorre e imprime los caracteres de la lista en orden.
    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.ch);
            cur = cur.next;
        }
        System.out.println();
    } /**********************/

    //Ordena los caracteres de la lista alfabéticamente (ignorando mayúsculas/minúsculas)
    //usando el algoritmo Bubble Sort.
    public void bubbleSort() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node cur = head;
            while (cur.next != null) {
                if (Character.toLowerCase(cur.ch) > Character.toLowerCase(cur.next.ch)) {
                    // intercambiar valores de los nodos
                    char tmp = cur.ch;
                    cur.ch = cur.next.ch;
                    cur.next.ch = tmp;
                    swapped = true;
                }
                cur = cur.next;
            }
        } while (swapped);
    } /**********************/
}


