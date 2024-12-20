package com.ulcdia.experiment_8.writers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        randomWrite(10000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");
    }

    private static void randomWrite(int size) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true))) {
            for (int i = 0; i < size; i++) {
                bufferedWriter.write(String.valueOf(Math.random()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


