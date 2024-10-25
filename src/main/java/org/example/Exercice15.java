package org.example;

public class Exercice15 {
    private int studentId;
    private String studentName;
    private String grade;

    public Exercice15() {
        this(0, "Unknown", "None");
    }

    public Exercice15(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("ID étudiant : " + studentId);
        System.out.println("Nom de l'étudiant : " + studentName);
        System.out.println("Niveau : " + grade);
    }

    public static void main(String[] args) {
        Exercice15 student1 = new Exercice15();
        Exercice15 student2 = new Exercice15(101, "Cullen", "A");

        System.out.println("Étudiant 1 :");
        student1.displayInfo();
        System.out.println();

        System.out.println("Étudiant 2 :");
        student2.displayInfo();
    }
}
