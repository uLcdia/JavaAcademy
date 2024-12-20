package com.ulcdia.experiment_8.serialization;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Serialization {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Date date = new Date(2024, 12, 20);
        double data = 123.456;
        writeObject("file.ser", array, date, data);
    }

    private static void writeObject(String fileName, int[] array, Date date, double data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(array);
            oos.writeObject(date);
            oos.writeDouble(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
