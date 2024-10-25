package org.example;

import java.util.Scanner;

public class Exercice6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de minutes : ");
        long minutes = scanner.nextLong();
        int minutesInYear = 60 * 24 * 365;
        int minutesInDay = 60 * 24;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;
        System.out.println(minutes + " minutes correspondent à environ " + years + " ans et " + days + " jours.");
    }
}
