package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Exercice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Entrez le nombre de plus grands éléments à trouver : ");
        int k = scanner.nextInt();
        if (k > size) {
            System.out.println("Le nombre k ne peut pas être supérieur à la taille du tableau.");
            return;
        }

        Arrays.sort(array);
        int[] largestElements = new int[k];
        for (int i = 0; i < k; i++) {
            largestElements[i] = array[size - 1 - i];
        }

        System.out.println("Tableau original : " + Arrays.toString(array));
        System.out.println(k + " plus grands éléments du tableau sont :");
        for (int element : largestElements) {
            System.out.print(element + " ");
        }
    }
}
