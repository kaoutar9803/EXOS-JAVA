package org.example;

public class Exercice14 {
        private String title;
        private String author;
        private double price;

        public Exercice14() {
            this.title = "Unknown";
            this.author = "Unknown";
            this.price = 0.0;
        }

        public Exercice14(String title, String author) {
            this.title = title;
            this.author = author;
            this.price = 0.0;
        }

        public Exercice14(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Titre du livre: " + title);
            System.out.println("Auteur du livre: " + author);
            System.out.println("Prix du livre: " + price);
        }

        public static void main(String[] args) {
            Exercice14 book1 = new Exercice14();
            Exercice14 book2 = new Exercice14("Amatka", "Karin Tidbeck");
            Exercice14 book3 = new Exercice14("Altered Carbon", "Richard K. Morgan", 18.9);

            System.out.println("Book1:");
            book1.displayInfo();
            System.out.println();

            System.out.println("Book2:");
            book2.displayInfo();
            System.out.println();

            System.out.println("Book3:");
            book3.displayInfo();
        }

}
