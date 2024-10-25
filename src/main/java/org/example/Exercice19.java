package org.example;

public class Exercice19 {
    private static Exercice19 instance;

    private Exercice19() {
        System.out.println("Singleton instance created.");
    }

    public static Exercice19 getInstance() {
        if (instance == null) {
            instance = new Exercice19();
        }
        return instance;
    }

    public static void main(String[] args) {
        Exercice19 instance1 = Exercice19.getInstance();
        Exercice19 instance2 = Exercice19.getInstance();

        if (instance1 == instance2) {
            System.out.println("Both instances are the same.");
        }
    }
}
