package org.example;
import java.util.Scanner;
import java.util.Stack;

import static org.example.Exercice27.readFile;
import static org.example.Exercice28.readFile2;
import static org.example.Exercice29.listFilesInDirectory;
import static org.example.Exercice30.getFileSize;
import static org.example.Exercice31.displayStack;
import static org.example.Exercice31.rotate;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 6.0);
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

        Employee employee = new Employee(40000);
        HRManager hrManager = new HRManager(70000);

        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());

        hrManager.work();
        System.out.println("Manager salary: " + hrManager.getSalary());
        hrManager.addEmployee();

        BankAccount account1 = new BankAccount("BA1234", 500);
        account1.deposit(1000);
        account1.withdraw(600);

        SavingsAccount savingsAccount1 = new SavingsAccount("SA1234", 450);
        savingsAccount1.withdraw(300);
        System.out.println("Balance after trying to withdraw $300: $" + savingsAccount1.getBalance());

        SavingsAccount savingsAccount2 = new SavingsAccount("SA1000", 300);
        savingsAccount2.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + savingsAccount2.getBalance());

        Circle circle = new Circle(4.0);
        System.out.println("Radius of the Circle: " + circle.getRadius());
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Sides of the Triangle are: " + triangle.getSide1() + ", " + triangle.getSide2() + ", " + triangle.getSide3());
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());

        Shapeee rectangleee = new Rectangleee(10.0, 12.0);
        System.out.println("Area of the Rectangle: " + rectangle.getArea());

        Shapeee circleee = new Circlee(3.0);
        System.out.println("Area of the Circle: " + circleee.getArea());

        Shapeee triangleee = new Triangleee(6.0, 4.0);
        System.out.println("Area of the Triangle: " + triangleee.getArea());

        Sports football = new Football();
        football.play();

        Sports basketball = new Basketball();
        basketball.play();

        Sports rugby = new Rugby();
        rugby.play();

        Dog dog = new Dog("Cooper", 3, "Ball");
        dog.displayDetails();
        System.out.println("Dog's age in human years: " + dog.calculateHumanAge());

        System.out.println();

        Bird bird = new Bird("Pelican", 2, 0.5);
        bird.displayDetails();
        System.out.println("Bird's age in human years: " + bird.calculateHumanAge());
        readFile("test1.txt");
        readFile2("test1.txt");
        String directoryPath = "c:/Downloads/java/filetest.txt";
        listFilesInDirectory(directoryPath);
        String filePath = "c:/Downloads/java/filetest.txt";
        getFileSize(filePath);

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Input some elements on the stack (enter -1 to stop):");

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) break; // Stop input on -1
            stack.push(input);
        }

        System.out.print("Stack elements: ");
        displayStack(stack);

        for (int i = 1; i <= 3; i++) {
            rotate(stack, i);
            System.out.println("Rotate the stack elements to the right by " + i + " position(s):");
            System.out.print("Display the rotated stack: ");
            displayStack(stack);
        }


    }
}