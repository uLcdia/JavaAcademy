package com.ulcdia.experiment_3.custom_sort;

// import java.util.ArrayList;

public class CustomSort {
    public static void main(String[] args) {
        final int[] array = {7, 4, 3, 9, 0, 6};
        System.out.println("Original array:");
        System.out.println(java.util.Arrays.toString(array));

        int[] bubbleSortedArray = array.clone();
        bubbleSort(bubbleSortedArray);
        System.out.println("Bubble sorted array:");
        System.out.println(java.util.Arrays.toString(bubbleSortedArray));

        int[] selectionSortedArray = array.clone();
        selectionSort(selectionSortedArray);
        System.out.println("Selection sorted array:");
        System.out.println(java.util.Arrays.toString(selectionSortedArray));

        int[] insertionSortedArray = array.clone();
        insertionSort(insertionSortedArray);
        System.out.println("Insertion sorted array:");
        System.out.println(java.util.Arrays.toString(insertionSortedArray));

        /*
         * But you definitely can (and should) use Java's built-in sort
         * ArrayList<Integer> arrayList = new ArrayList<>();
         * for (int num : array) {
         *     arrayList.add(num);
         * }
         * arrayList.sort(null);
         */
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Outer loop: Choose the current element to be compared
        // From the first element to the last element
        for (int i = 0; i < n - 1; i++) {
            // Initialize swapped as false for this pass
            swapped = false;
            // Inner loop: Compare the current element with the next element
            // From the first element to the last UNSORTED element
            for (int j = 0; j < n - i - 1; j++) {
                // If the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    // Set swapped to true to indicate a swap occurred
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        // Outer loop: Choose the current element to be compared
        // From the first element to the last element
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element's index in the remaining unsorted array
            int minIndex = i;
            // Inner loop: Compare the current element with elements in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the new found minimum element with the first element of the unsorted array
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
    
        // i = 1: for i = 0, no elements to compare with
        for (int i = 1; i < n; i++) {
            int currentValue = array[i];
            int j = i - 1;
    
            // Move elements of array[0..i-1] (reversed), that are greater than currentValue,
            // to one position ahead of their current position
            // From the element before the current element
            // To the first element less than or equal to the current element
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }
            // Insert the current element at its correct position
            array[j + 1] = currentValue;
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        // Check if the indices are out of bounds
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        // Swap the elements
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
