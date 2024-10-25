package org.example;

public class Exercice16 {
    private String accountNumber;
    private double balance;

    public Exercice16(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
            this.accountNumber = "Invalid";
        } else {
            this.accountNumber = accountNumber;
        }

        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {
        Exercice16 account1 = new Exercice16("12340009", 1000.0);
        Exercice16 account2 = new Exercice16(null, 500.0);
        Exercice16 account3 = new Exercice16("ABCD1234", -200.0);

        System.out.println("Account 1:");
        account1.displayInfo();
        System.out.println();

        System.out.println("Account 2:");
        account2.displayInfo();
        System.out.println();

        System.out.println("Account 3:");
        account3.displayInfo();
    }
}
