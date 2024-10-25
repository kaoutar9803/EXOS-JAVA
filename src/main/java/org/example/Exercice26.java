package org.example;

public class Exercice26 {
}
class Pet {
    protected String name;
    protected String species;
    protected int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

    public int calculateHumanAge() {
        return age;
    }
}

class Dog extends Pet {
    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void displayDetails() {
        System.out.println("Dog Details:");
        super.displayDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
    }

    @Override
    public int calculateHumanAge() {
        return age * 7;
    }
}

class Bird extends Pet {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bird Details:");
        super.displayDetails();
        System.out.println("Wing Span: " + wingSpan + " meters");
    }

    @Override
    public int calculateHumanAge() {
        return age;
    }
}