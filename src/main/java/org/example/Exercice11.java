package org.example;
import java.util.Scanner;
public class Exercice11 {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la position (n) pour le nombre de Fibonacci : ");
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println("Le nombre de Fibonacci à la position " + n + " est : " + result);
    }
}
