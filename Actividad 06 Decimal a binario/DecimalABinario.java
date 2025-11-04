/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;
import java.util.Stack;
import java.util.Scanner;



/**
 * Actividad 6: Conversión de número decimal a binario usando una pila
 * 
 * Esta clase convierte un número decimal ingresado por el usuario a su 
 * representación binaria. Para lograrlo, utiliza una pila donde se apilan 
 * los restos de las divisiones sucesivas entre 2, y luego se desapilan 
 * para mostrar el número binario en orden correcto.
 * 
 * Operaciones utilizadas:
 *  - push(): apila el residuo de la división entre 2.
 *  - pop(): desapila los valores para formar el binario.
 *  - isEmpty(): verifica si la pila está vacía.
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class DecimalABinario {

    /**
     * Método principal que solicita un número al usuario,
     * lo convierte a binario y muestra el resultado.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.print("Ingrese número decimal: ");
        int num = sc.nextInt();

        // División sucesiva entre 2, apilando los restos
        while (num > 0) {
            pila.push(num % 2);
            num /= 2;
        }

        // Mostrar el binario desapilando los restos
        System.out.print("Número en binario: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }

        sc.close();
    }
}
/***********************/
