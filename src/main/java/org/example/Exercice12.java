package org.example;

public class Exercice12 {
    private String name;
    private int age;

    public Exercice12() {
        this.name = "Unknown";
        this.age = 0;
    }
    public void displayInfo() {
        System.out.println("Nom du chat : " + name);
        System.out.println("Âge du chat : " + age);
    }

    public static void main(String[] args) {
        Exercice12 myCat = new Exercice12();
        myCat.displayInfo();
    }
}
