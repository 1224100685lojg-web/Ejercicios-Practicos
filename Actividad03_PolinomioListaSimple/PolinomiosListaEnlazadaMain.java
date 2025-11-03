/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;
import java.util.Scanner;

/**
 * Clase PrincipalActividad3
 * 
 * Contiene el método main para ejecutar la Actividad 03.
 * Permite al usuario crear un polinomio, mostrarlo y ver su tabla de evaluación.
 * 
 * Autor: Luis Owen Jaramillo Guerrero
 */
public class PolinomiosListaEnlazadaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolinomiosListaEnlazada polinomio = new PolinomiosListaEnlazada();

        System.out.println("=== ACTIVIDAD 03: Representación y Evaluación de Polinomios ===");
        System.out.print("¿Cuántos términos desea ingresar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTérmino #" + i);
            System.out.print("Coeficiente: ");
            double coef = sc.nextDouble();
            System.out.print("Exponente: ");
            int exp = sc.nextInt();
            polinomio.insertarTermino(coef, exp);
        }

        System.out.println("\nPolinomio ingresado:");
        polinomio.mostrarPolinomio();

        System.out.println("\nTabla de valores para x = 0.0 hasta 5.0:");
        polinomio.imprimirTabla();

        sc.close();
    }
}
