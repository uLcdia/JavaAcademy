package com.ulcdia.experiment_8.integer_file_write_read;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;

public class IntegerFileWriteRead {
    public static void main(String[] args) {
        writeData("data");
        readData("data");
    }

    private static void readData(String file) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            int sum = 0;
            try {
                while (true) {
                    sum += dis.readInt();
                }
            } catch (EOFException e) {
                System.out.println("End of file");
            } finally {
                System.out.println("Sum: " + sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeData(String file) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            int count = (int) (Math.random() * 100);
            for (int i = 0; i < count; i++) {
                dos.writeInt((int) (Math.random() * 1000));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
