package org.example;

public class Exercice18 {
    private int x;
    private int y;

    public Exercice18(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Exercice18(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public void displayCoordinates() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Exercice18 point1 = new Exercice18(4, 5);
        Exercice18 point2 = new Exercice18(4.0, 5.0);

        System.out.print("Point 1 ");
        point1.displayCoordinates();

        System.out.print("Point 2 ");
        point2.displayCoordinates();
    }
}
