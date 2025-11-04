/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;
import java.util.Scanner;
import java.util.Stack;

/**
 * Actividad 5: Verificar balanceo de paréntesis usando una pila
 * 
 * Esta clase permite comprobar si una expresión matemática contiene
 * paréntesis correctamente balanceados. 
 * 
 * Funcionamiento:
 * - Recorre la expresión carácter por carácter.
 * - Apila cada '(' encontrado.
 * - Cuando se encuentra ')', desapila un elemento.
 * - Si al final la pila está vacía, los paréntesis están balanceados.
 * 
 * Operaciones utilizadas:
 *  - push(): inserta un paréntesis en la pila.
 *  - pop(): extrae el último paréntesis insertado.
 *  - isEmpty(): verifica si la pila está vacía.
 * 
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class BalanceoParantesis {

    /**
     * Método que verifica si los paréntesis de una expresión están balanceados.
     * 
     * @param expr expresión a analizar
     * @return true si los paréntesis están balanceados, false en caso contrario
     */
    public static boolean estaBalanceada(String expr) {
        Stack<Character> pila = new Stack<>();

        for (char c : expr.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) return false; // más ')' que '('
                pila.pop();
            }
        }

        return pila.isEmpty(); // Si queda algo, faltaron ')'
    } /**********************/

    /**
     * Método principal que realiza pruebas del balanceo de paréntesis.
     */
    public static void main(String[] args) {
        System.out.println(estaBalanceada("((2+3)*5)"));  // true
        System.out.println(estaBalanceada("((2+3)*5"));   // false
    }
}
/***********************/
