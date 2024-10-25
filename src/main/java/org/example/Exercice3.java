package org.example;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier entre 0 et 1000 : ");
        int number = scanner.nextInt();
        if (number < 0 || number > 1000) {
            System.out.println("Le nombre doit être compris entre 0 et 1000.");
        } else {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            System.out.println("La somme de tous les chiffres est : " + sum);
        }
    }
}
