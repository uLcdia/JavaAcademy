package com.ulcdia.experiment_8.character_counter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCounter {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CharacterCounter <file_path> <character>");
            System.exit(1);
        }
        
        String filePath = args[0];
        char characterToCount = args[1].charAt(0);

        long start = System.currentTimeMillis();
        int count = countCharacterInFile(filePath, characterToCount);
        long end = System.currentTimeMillis();
        System.out.println("In file " + filePath + ", the character '" + characterToCount + "' occurs " + count + " times.");
        System.out.println("Time taken: " + (end - start) + "ms");
    }
    
    public static int countCharacterInFile(String filePath, char character) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int currentChar;
            while ((currentChar = br.read()) != -1) {
                if (currentChar == character) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return count;
    }
}
