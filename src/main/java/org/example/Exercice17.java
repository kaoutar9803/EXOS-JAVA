package org.example;

public class Exercice17 {
    private String make;
    private String model;
    private int year;

    public Exercice17(String make, String model, int year) {
        this.make = (make != null && !make.isEmpty()) ? make : "Unknown Make";
        this.model = (model != null && !model.isEmpty()) ? model : "Unknown Model";
        this.year = (year > 0) ? year : 2000;
    }

    public void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        Exercice17 car1 = new Exercice17("Toyota", "Corolla", 2021);
        Exercice17 car2 = new Exercice17(null, null, 0);

        System.out.println("Car 1:");
        car1.displayInfo();
        System.out.println();

        System.out.println("Car 2:");
        car2.displayInfo();
    }
}
