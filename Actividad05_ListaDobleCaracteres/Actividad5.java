/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

/**
 *
 * @author Owen_04
 */
public class Actividad5 {
    // Actividad5.java
// Lista doblemente enlazada de caracteres: construir desde cadena, ordenar alfabéticamente y mostrar.
    static class Node {
        char ch;
        Node prev, next;
        Node(char c) { ch = c; }
    }

    private Node head = null;

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

    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.ch);
            cur = cur.next;
        }
        System.out.println();
    } /**********************/

    public void bubbleSort() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node cur = head;
            while (cur.next != null) {
                if (Character.toLowerCase(cur.ch) > Character.toLowerCase(cur.next.ch)) {
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


