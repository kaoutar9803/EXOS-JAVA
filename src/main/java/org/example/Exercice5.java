package org.example;
import java.util.Scanner;
public class Exercice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("La somme est de " + sum);
    }
}
