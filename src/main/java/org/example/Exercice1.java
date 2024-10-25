package org.example;
import java.util.Scanner;

public class Exercice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of terms is: ");
        int n = scanner.nextInt();
        int sum = 0;
        int oddNumber = 1;
        System.out.println("The odd numbers are :");
        for (int i = 1; i <= n; i++) {
            System.out.println(oddNumber);
            sum += oddNumber;
            oddNumber += 2;
        }
        System.out.println("The Sum of odd Natural Number upto " + n + " terms is: " + sum);
    }
}
