package com.ulcdia.experiment_3.overload_swap;

import java.util.Arrays;

public class OverloadSwap {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("main()");
        System.out.println("a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("main()");
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("main()");
        System.out.println(Arrays.toString(array));
        swap(array);
        System.out.println("main()");
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int a, int b) {
        System.out.println("swap(int, int)");
        System.out.println("a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void swap(int[] array) {
        System.out.println("swap(int[])");
        System.out.println(Arrays.toString(array));
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        System.out.println(Arrays.toString(array));
    }
}
