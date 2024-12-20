package com.ulcdia.experiment_8.write_if_flag_not_found;

import java.io.File;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIfFlagNotFound {
    public static void main(String[] args) {
        File flag = new File("flag");
        File data = new File("data");
        if (!flag.exists()) {
            writeData(data);
        }
    }

    private static void writeData(File data) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(data, true))) {
            for (int i = 0; i < 100; i++) {
                bos.write(String.valueOf((int) (Math.random() * 10)).getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
