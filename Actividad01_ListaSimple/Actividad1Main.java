/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPracticos;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Owen_04
 */
public class Actividad1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic class PrincipalActividad1 {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        Actividad1 lista = new Actividad1();

        System.out.println("=== Actividad 1 - Lista enlazada simple (enteros) ===");
        System.out.print("¿Cuántos números generar aleatoriamente? ");
        int n = sc.nextInt();
        System.out.print("Valor máximo aleatorio: ");
        int max = sc.nextInt();

        for (int i = 0; i < n; i++) {
            lista.insertLast(1 + rnd.nextInt(Math.max(1, max)));
        }

        lista.traversePrint();

        System.out.print("Ingrese valor límite: ");
        int limite = sc.nextInt();

        lista.removeGreaterThan(limite);

        System.out.println("Lista luego de eliminar > " + limite + ":");
        lista.traversePrint();
        sc.close();
    }
}

    

