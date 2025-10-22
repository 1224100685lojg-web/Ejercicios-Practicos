/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

/**
 *
 * @author Owen_04
 */
public class Actividad4 {
   static class Term {
        double coef;
        int exp;
        Term next;
        Term(double c, int e) { coef = c; exp = e; next = null; }
    }

    private Term last = null;

    public void insertTerm(double c, int e) {
        Term t = new Term(c, e);
        if (last == null) {
            last = t;
            last.next = last;
        } else {
            t.next = last.next;
            last.next = t;
            last = t;
        }
    } /**********************/

    public void traverse() {
        if (last == null) { System.out.println("(vacía)"); return; }
        Term start = last.next;
        Term cur = start;
        do {
            System.out.print(cur.coef + "x^" + cur.exp);
            cur = cur.next;
            if (cur != start) System.out.print(" -> ");
        } while (cur != start);
        System.out.println();
    } /**********************/

    public double evaluateAt(double x) {
        if (last == null) return 0.0;
        double sum = 0.0;
        Term start = last.next, cur = start;
        do {
            sum += cur.coef * Math.pow(x, cur.exp);
            cur = cur.next;
        } while (cur != start);
        return sum;
    } /**********************/
}

