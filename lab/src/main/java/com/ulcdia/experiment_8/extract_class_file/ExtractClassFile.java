package com.ulcdia.experiment_8.extract_class_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;

public class ExtractClassFile {
    public static void main(String[] args) {
        String sourceFilePath = getCurrentClassFilePath();
        String outputFilePath = "temp.txt";
        extractClassFile(sourceFilePath, outputFilePath);
    }

    private static String getCurrentClassFilePath() {
        try {
            Class<?> currentClass = ExtractClassFile.class;
            
            String classFilePath = currentClass.getProtectionDomain().getCodeSource().getLocation().toURI().getPath() +
                    currentClass.getName().replace('.', File.separatorChar) + ".class";

            String javaFilePath = classFilePath.replace("target/classes/", "src/main/java/")
                                               .replace(".class", ".java");

            System.out.println("Current class file path: " + classFilePath);
            System.out.println("Current class java file path: " + javaFilePath);
            return javaFilePath;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void extractClassFile(String sourceFilePath, String outputFilePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFilePath)); 
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath))) {
            
            System.out.println("Reading from " + sourceFilePath);

            String line;
            int lineNumber = 1;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(lineNumber + ": " + line);
                bufferedWriter.newLine();
                lineNumber++;
            }

            System.out.println("Written " + lineNumber + " lines to " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error reading from " + sourceFilePath);
            e.printStackTrace();
        }
    }
}
