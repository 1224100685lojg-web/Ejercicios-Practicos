/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;
import java.util.Scanner;
import java.util.Stack;

/**
 * Actividad 4: Invertir una palabra usando una pila
 * 
 * Esta clase permite invertir una palabra ingresada por el usuario
 * utilizando una pila de caracteres. Cada letra se apila y luego se desapila
 * para mostrarlas en orden inverso.
 * 
 * Operaciones utilizadas:
 *  - push(): inserta un carácter en la pila.
 *  - pop(): extrae el último carácter insertado.
 *  - isEmpty(): verifica si la pila está vacía.
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class InvertirPalabra {

    /**
     * Método principal que solicita una palabra al usuario,
     * la invierte utilizando una pila y muestra el resultado.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        // Apila cada carácter de la palabra
        for (char c : palabra.toCharArray()) {
            pila.push(c);
        }

        // Desapila los caracteres para mostrarlos en orden inverso
        System.out.print("Palabra invertida: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }

        sc.close();
    }
}
/***********************/

