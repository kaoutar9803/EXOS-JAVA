package org.example;
import java.util.HashSet;
import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Tableau d'origine : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int longestStreak = findLongestConsecutiveSequence(array);
        System.out.println("La longueur de la séquence consécutive la plus longue est : " + longestStreak);
    }

    public static int findLongestConsecutiveSequence(int[] array) {
        HashSet<Integer> numSet = new HashSet<>();

        for (int num : array) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : array) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
