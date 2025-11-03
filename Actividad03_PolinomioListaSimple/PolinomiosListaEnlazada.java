/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPracticos;


/**
 * Clase RepresentacionEvaluacionPolinomiosListaEnlazada
 * 
 * Representa un polinomio utilizando una lista enlazada simple.
 * 
 * Permite:
 * - Insertar términos (coeficiente y exponente).
 * - Evaluar el polinomio en un valor dado de x.
 * - Imprimir una tabla de valores del polinomio en un rango definido.
 * 
 * Actividad 03: Representación y Evaluación de Polinomios con Listas Enlazadas
 * 
 * Autor: Luis Owen Jaramillo Guerrero
 */
    public class PolinomiosListaEnlazada {

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

    // Referencia al primer término del polinomio
    private Termino cabeza = null;

    /**
     * Inserta un término (coeficiente y exponente) al final de la lista enlazada.
     * 
     * @param coeficiente valor del coeficiente
     * @param exponente valor del exponente
     */
    public void insertarTermino(double coeficiente, int exponente) {
        Termino nuevo = new Termino(coeficiente, exponente);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Termino actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    } /**********************/

    /**
     * Evalúa el polinomio en un valor dado de x.
     * 
     * @param x valor a evaluar
     * @return resultado del polinomio P(x)
     */
    public double evaluarEn(double x) {
        double suma = 0.0;
        Termino actual = cabeza;
        while (actual != null) {
            suma += actual.getCoeficiente() * Math.pow(x, actual.getExponente());
            actual = actual.getSiguiente();
        }
        return suma;
    } /**********************/

    /**
     * Muestra una representación textual del polinomio en formato matemático.
     */
    public void mostrarPolinomio() {
        if (cabeza == null) {
            System.out.println("El polinomio está vacío.");
            return;
        }
        Termino actual = cabeza;
        StringBuilder sb = new StringBuilder("P(x) = ");
        boolean primero = true;

        while (actual != null) {
            double c = actual.getCoeficiente();
            int e = actual.getExponente();

            if (!primero && c >= 0) sb.append(" + ");
            if (c < 0) sb.append(" - ");

            sb.append(String.format("%.1f", Math.abs(c)));
            if (e > 0) sb.append("x");
            if (e > 1) sb.append("^").append(e);

            primero = false;
            actual = actual.getSiguiente();
        }

        System.out.println(sb.toString());
    } /**********************/

    /**
     * Imprime una tabla de valores P(x) para x desde 0.0 hasta 5.0 con incremento de 0.5.
     */
    public void imprimirTabla() {
        System.out.printf("%-6s | %-10s%n", "x", "P(x)");
        System.out.println("--------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            System.out.printf("%-6.1f | %-10.4f%n", x, evaluarEn(x));
        }
    } /**********************/
}