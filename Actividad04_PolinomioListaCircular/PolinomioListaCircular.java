/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;

/**
 * Clase PolinomioListaCircular
 * 
 * Representa un polinomio utilizando una lista enlazada circular.
 * 
 * Permite:
 * - Insertar términos con coeficiente y exponente.
 * - Recorrer e imprimir el polinomio en formato legible.
 * - Evaluar el polinomio para un valor de x.
 * 
 * Actividad 04: Polinomio con Lista Enlazada Circular
 * 
 * Autor: Luis Owen Jaramillo Guerrero
 */
public class PolinomioListaCircular {

    /**
     * Clase interna Termino
     * 
     * Representa un término del polinomio con su coeficiente y exponente.
     * Aplica encapsulamiento utilizando atributos privados y métodos de acceso.
     */
    private static class Termino {
        private double coeficiente;
        private int exponente;
        private Termino siguiente;

        public Termino(double c, int e) {
            this.coeficiente = c;
            this.exponente = e;
            this.siguiente = null;
        }

        public double getCoeficiente() { return coeficiente; }
        public int getExponente() { return exponente; }
        public Termino getSiguiente() { return siguiente; }
        public void setSiguiente(Termino siguiente) { this.siguiente = siguiente; }
    }

    // Último nodo de la lista circular
    private Termino ultimo = null;

    /**
     * Inserta un nuevo término al final de la lista circular.
     * 
     * @param coeficiente Valor del coeficiente.
     * @param exponente Valor del exponente.
     */
    public void insertarTermino(double coeficiente, int exponente) {
        Termino nuevo = new Termino(coeficiente, exponente);
        if (ultimo == null) {
            ultimo = nuevo;
            ultimo.setSiguiente(ultimo);
        } else {
            nuevo.setSiguiente(ultimo.getSiguiente());
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    } /**********************/

    /**
     * Recorre e imprime el polinomio en formato legible.
     */
    public void recorrer() {
        if (ultimo == null) {
            System.out.println("El polinomio está vacío.");
            return;
        }

        Termino inicio = ultimo.getSiguiente();
        Termino actual = inicio;
        StringBuilder sb = new StringBuilder("P(x) = ");

        do {
            double c = actual.getCoeficiente();
            int e = actual.getExponente();

            if (c >= 0 && actual != inicio) sb.append(" + ");
            else if (c < 0) sb.append(" - ");

            sb.append(String.format("%.1f", Math.abs(c)));
            if (e > 0) sb.append("x");
            if (e > 1) sb.append("^").append(e);

            actual = actual.getSiguiente();
        } while (actual != inicio);

        System.out.println(sb.toString());
    } /**********************/

    /**
     * Evalúa el polinomio en un valor dado de x.
     * 
     * @param x valor de entrada
     * @return resultado de P(x)
     */
    public double evaluarEn(double x) {
        if (ultimo == null) return 0.0;

        double suma = 0.0;
        Termino inicio = ultimo.getSiguiente();
        Termino actual = inicio;

        do {
            suma += actual.getCoeficiente() * Math.pow(x, actual.getExponente());
            actual = actual.getSiguiente();
        } while (actual != inicio);

        return suma;
    } /**********************/
}
