/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

/**
 *
 * @author Owen_04
 */
public class Actividad3 {
    // Actividad3.java
// Representación y evaluación de polinomios con lista enlazada simple.
    
    static class Term {
        double coef;
        int exp;
        Term next;
        Term(double c, int e) { coef = c; exp = e; next = null; }
    }

    private Term head = null;

    public void insertTerm(double c, int e) {
        Term t = new Term(c, e);
        if (head == null) head = t;
        else {
            Term cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = t;
        }
    } /**********************/

    public double evaluateAt(double x) {
        double sum = 0.0;
        Term cur = head;
        while (cur != null) {
            sum += cur.coef * Math.pow(x, cur.exp);
            cur = cur.next;
        }
        return sum;
    } /**********************/

    public void printTable() {
        System.out.printf("%-6s | %-10s%n", "x", "P(x)");
        System.out.println("--------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5)
            System.out.printf("%-6.1f | %-10.4f%n", x, evaluateAt(x));
    } 
}


