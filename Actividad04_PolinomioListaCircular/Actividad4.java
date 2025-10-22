/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

/**
 * Permite:
 * - Insertar términos en un polinomio en una lista circular.
 * - Recorrer e imprimir todos los términos en orden.
 * - Evaluar el polinomio en un valor dado de x.
 *
 * @author Luis Owen Jaramillo Guerrero
 */
public class Actividad4 {
   // Clase interna que representa un término del polinomio
   static class Term {
        double coef; // coeficiente del término
        int exp; // exponente del término
        Term next; // referencia al siguiente término
        Term(double c, int e) { coef = c; exp = e; next = null; }
    }

    private Term last = null; // referencia al último término de la lista circular

   
   //Inserta un término (coeficiente y exponente) en la lista circular.
    public void insertTerm(double c, int e) {
        Term t = new Term(c, e);
        if (last == null) {
            last = t;
            last.next = last; // apunta a sí mismo, formando la lista circular
        } else {
            t.next = last.next; // nuevo nodo apunta al primero
            last.next = t; // último nodo apunta al nuevo
            last = t; // actualiza el último nodo
        }
    } /**********************/

   //Recorre e imprime todos los términos de la lista circular.

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

   //Evalúa el polinomio en un valor x dado.
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

