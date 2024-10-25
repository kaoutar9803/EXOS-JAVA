package org.example;
import java.io.File;
public class Exercice30 {
    public static void getFileSize(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("Error: The file does not exist.");
            return;
        }

        long fileSizeInBytes = file.length();
        double fileSizeInKiloBytes = fileSizeInBytes / 1024.0;
        double fileSizeInMegaBytes = fileSizeInKiloBytes / 1024.0;

        System.out.println(fileSizeInBytes + " octets");
        System.out.printf("%.10f Ko%n", fileSizeInKiloBytes);
        System.out.printf("%.10f Mo%n", fileSizeInMegaBytes);
    }

}
