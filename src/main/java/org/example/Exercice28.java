package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Exercice28 {
    public static void readFile2(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean isEmpty = true;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                isEmpty = false;
            }

            if (isEmpty) {
                throw new IOException("File is empty.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + fileName + " (The system cannot find the file specified)");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
