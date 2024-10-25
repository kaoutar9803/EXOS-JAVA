package org.example;
import java.util.Scanner;
public class Exercice7 {

    public static int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return pgcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre : ");
        int num1 = scanner.nextInt();
        System.out.print("Entrez le deuxième nombre : ");
        int num2 = scanner.nextInt();
        int result = pgcd(num1, num2);
        System.out.println("Le PGCD de " + num1 + " et " + num2 + " est : " + result);
    }
}

