/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Owen_04
 */
public class Actividad2 {
        static class Node {
        String word;
        Node next;
        Node(String w) { word = w; next = null; }
    }

    private Node head = null;

    /**
     * Inserta palabra al final.
     */
    public void insertLast(String w) {
        Node n = new Node(w);
        if (head == null) { head = n; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = n;
    } /**********************/

    /**
     * Carga palabras desde archivo en la lista.
     */
    public void loadFromFile(String filename) {
        File f = new File(filename);
        if (!f.exists()) {
            System.out.println("Archivo no existe. Se creará uno nuevo al guardar.");
            return;
        }
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) insertLast(sc.next());
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    } /**********************/

    /**
     * Muestra las palabras en la lista.
     */
    public void printList() {
        Node cur = head;
        if (cur == null) { System.out.println("(vacía)"); return; }
        while (cur != null) {
            System.out.print(cur.word + (cur.next != null ? " " : ""));
            cur = cur.next;
        }
        System.out.println();
    } /**********************/

    /**
     * Elimina la primera aparición de la palabra indicada.
     */
    public boolean removeWord(String target) {
        if (head == null) return false;
        if (head.word.equals(target)) { head = head.next; return true; }
        Node prev = head, cur = head.next;
        while (cur != null) {
            if (cur.word.equals(target)) {
                prev.next = cur.next;
                return true;
            }
            prev = cur; cur = cur.next;
        }
        return false;
    } /**********************/

    /**
     * Guarda la lista en un archivo (palabras separadas por espacios).
     */
    public void writeToFile(String filename) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            Node cur = head;
            boolean first = true;
            while (cur != null) {
                if (!first) pw.print(" ");
                pw.print(cur.word);
                first = false;
                cur = cur.next;
            }
            System.out.println("Archivo guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar archivo: " + e.getMessage());
        }
    } 
}

