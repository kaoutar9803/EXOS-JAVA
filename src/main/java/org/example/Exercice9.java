package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Exercice9{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Tableau d'origine : " + Arrays.toString(array));

        moveZerosToEnd(array);

        System.out.println("Après avoir déplacé les 0 à la fin du tableau : " + Arrays.toString(array));
    }

    public static void moveZerosToEnd(int[] array) {
        int nonZeroIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex] = array[i];
                nonZeroIndex++;
            }
        }
        while (nonZeroIndex < array.length) {
            array[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
