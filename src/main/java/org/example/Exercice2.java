package org.example;

import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Input second string: ");
        String secondString = scanner.nextLine();
        boolean contains = secondString.contains(firstString);
        System.out.println("If the second string contains the first one? " + contains);
    }
}
