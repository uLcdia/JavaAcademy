package com.ulcdia.experiment_7.out_of_memory;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {
    public static void main(String[] args) {
        try {
            List<byte[]> list = new ArrayList<>();
            while (true) {
                list.add(new byte[Integer.MAX_VALUE]);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
