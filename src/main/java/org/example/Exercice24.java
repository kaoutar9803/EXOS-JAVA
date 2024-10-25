package org.example;

public class Exercice24 {
}
interface Shapeee {
    double getArea();
}

class Rectangleee implements Shapeee{
    private double width;
    private double height;

    public Rectangleee(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circlee implements Shapeee {
    private double radius;

    public Circlee(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangleee implements Shapeee {
    private double base;
    private double height;

    public Triangleee(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}


