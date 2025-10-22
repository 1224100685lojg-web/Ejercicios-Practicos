/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

/**
 *
* Clase Actividad3 - Representación y evaluación de polinomios usando lista enlazada simple.
 * 
 * Permite:
 * - Insertar términos (coeficiente y exponente) en un polinomio.
 * - Evaluar el polinomio en un valor dado de x.
 * - Mostrar una tabla de valores P(x) para x en un rango definido.
 *
 * @author Luis Owen Jaramillo Guerrero
 */
public class Actividad3 {

    // Clase interna que representa un término del polinomio
    static class Term {
        double coef;
        int exp;
        Term next;
        Term(double c, int e) { coef = c; exp = e; next = null; }
    }

    private Term head = null; // referencia al primer término del polinomio

     //Inserta un término (coeficiente y exponente) al final de la lista.

    public void insertTerm(double c, int e) {
        Term t = new Term(c, e);
        if (head == null) head = t;
        else {
            Term cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = t;
        }
    } /**********************/
    
//Evalúa el polinomio en un valor x dado.
    public double evaluateAt(double x) {
        double sum = 0.0;
        Term cur = head;
        while (cur != null) {
            sum += cur.coef * Math.pow(x, cur.exp);
            cur = cur.next;
        }
        return sum;
    } /**********************/
    //Imprime una tabla de valores P(x) para x desde 0.0 hasta 5.0 con incremento 0.5.
    public void printTable() {
        System.out.printf("%-6s | %-10s%n", "x", "P(x)");
        System.out.println("--------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5)
            System.out.printf("%-6.1f | %-10.4f%n", x, evaluateAt(x));
    } 
}


