/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;

import java.util.Scanner;


/**
 * Contiene el método main para ejecutar la Actividad 04.
 * Permite al usuario ingresar los términos de un polinomio representado
 * mediante una lista enlazada circular y evaluarlo en distintos valores de x.
 * 
 * Autor: Luis Owen Jaramillo Guerrero
 */
public class PolinomioListaCircularMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolinomioListaCircular polinomio = new PolinomioListaCircular();

        System.out.println("=== ACTIVIDAD 04: Polinomio con Lista Enlazada Circular ===");
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
        polinomio.recorrer();

        System.out.print("\nIngrese un valor para x: ");
        double x = sc.nextDouble();
        double resultado = polinomio.evaluarEn(x);

        System.out.printf("P(%.2f) = %.4f%n", x, resultado);

        sc.close();
    }
}