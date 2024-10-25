package org.example;

public class Exercice22 {
}

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        System.out.println("Create a Bank Account object (A/c No. " + accountNumber + ") with initial balance of $" + initialBalance + ":");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit $" + amount + " into account " + accountNumber + ":");
        System.out.println("New balance after depositing $" + amount + ": $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " from account " + accountNumber + ":");
            System.out.println("New balance after withdrawing $" + amount + ": $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if ((this.balance - amount) < 100) {
            System.out.println("Try to withdraw $" + amount + " from " + this.accountNumber + "!");
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount);
        }
    }
}

