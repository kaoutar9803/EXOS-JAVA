package org.example;

public class Exercice13 {
    private String name;
    private String color;

    public Exercice13(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Nom du chien : " + name);
        System.out.println("Couleur du chien : " + color);
    }

    public static void main(String[] args) {
        Exercice13 myDog = new Exercice13("Bailey", "Black");
        myDog.displayInfo();
    }
}
