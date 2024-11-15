package com.ulcdia.experiment_3.array_copy;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 0, 4, 8, 5, 7, 6};
        int[] copiedArray = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray, 1, originalArray.length - 1);
        copiedArray[0] = 10;

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        Arrays.sort(originalArray);
        System.out.println("Sorted original array: " + Arrays.toString(originalArray));

        int index = Arrays.binarySearch(copiedArray, 5);
        System.out.println("Index of 5 in copied array: " + index);
    }
}
