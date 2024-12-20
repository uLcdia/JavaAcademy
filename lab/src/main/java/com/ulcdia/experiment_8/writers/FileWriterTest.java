package com.ulcdia.experiment_8.writers;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        randomWrite(10000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");
    }

    private static void randomWrite(int size) {
        try (FileWriter fileWriter = new FileWriter("test.txt", true)) {
            for (int i = 0; i < size; i++) {
                fileWriter.write(String.valueOf(Math.random()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

