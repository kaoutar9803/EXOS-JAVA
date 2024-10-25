package org.example;
import java.io.File;
public class Exercice29 {
    public static void listFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Error: Directory does not exist or is not a directory.");
            return;
        }

        File[] files = directory.listFiles();

        if (files != null && files.length > 0) {
            System.out.println("Files in the directory:");
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("The directory is empty or does not contain any files.");
        }
    }
}
