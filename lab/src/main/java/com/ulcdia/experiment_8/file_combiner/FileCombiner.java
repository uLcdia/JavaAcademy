package com.ulcdia.experiment_8.file_combiner;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCombiner {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileCombiner <sourceFile1> <sourceFile2> ... <sourceFileN> <outputFile>");
            System.exit(1);
        }

        String[] sourceFileNames = Arrays.copyOfRange(args, 0, args.length - 1);
        String outputFileName = args[args.length - 1];
        combineFiles(sourceFileNames, outputFileName);
    }

    private static void combineFiles(String[] sourceFileNames, String outputFileName) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFileName))) {
            for (String sourceFileName : sourceFileNames) {
                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFileName))) {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = bis.read(buffer)) != -1) {
                        bos.write(buffer, 0, bytesRead);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
