/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;
import java.util.Stack;

/**
 * Actividad 8: Evaluar expresión postfija (Notación Polaca Inversa).
 * 
 * Esta clase permite evaluar expresiones en notación postfija (RPN, Reverse Polish Notation),
 * utilizando una pila para manejar operandos y operadores.
 * 
 * En una expresión postfija, los operadores se colocan después de los operandos.
 * Ejemplo: 5 3 + equivale a (5 + 3)
 * 
 * Algoritmo:
 *  1. Leer los tokens (números u operadores) de la expresión.
 *  2. Apilar los operandos.
 *  3. Al encontrar un operador, desapilar los dos últimos operandos,
 *     aplicar la operación y apilar el resultado.
 * 
 * 
 * @author Luis Owen Jaramillo Guerrero
 */
public class EvaluadorPostfijo {

    /**
     * Evalúa una expresión en notación postfija y devuelve el resultado.
     * 
     * @param expr Expresión postfija separada por espacios (ejemplo: "5 3 + 8 2 - *")
     * @return Resultado numérico de la evaluación
     */
    public static int evaluar(String expr) {
        Stack<Integer> pila = new Stack<>();

        // Recorre cada token (número u operador)
        for (String token : expr.split(" ")) {
            // Si el token es un número, se apila
            if (token.matches("\\d+")) {
                pila.push(Integer.parseInt(token));
            } else {
                // Si es un operador, se desapilan dos operandos
                int b = pila.pop();
                int a = pila.pop();

                // Se aplica la operación correspondiente
                switch (token) {
                    case "+":
                        pila.push(a + b);
                        break;
                    case "-":
                        pila.push(a - b);
                        break;
                    case "*":
                        pila.push(a * b);
                        break;
                    case "/":
                        pila.push(a / b);
                        break;
                    default:
                        System.out.println("Operador no reconocido: " + token);
                        break;
                }
            }
        }

        // El resultado final queda en la cima de la pila
        return pila.pop();
    }
    /***********************/

    /**
     * Método principal para probar la evaluación de expresiones postfijas.
     */
    public static void main(String[] args) {
        String expresion = "5 3 + 8 2 - *";
        System.out.println("=== Actividad 8: Evaluar Expresión Postfija ===");
        System.out.println("Expresión: " + expresion);
        int resultado = evaluar(expresion);
        System.out.println("Resultado: " + resultado);
    }
}
/***********************/
