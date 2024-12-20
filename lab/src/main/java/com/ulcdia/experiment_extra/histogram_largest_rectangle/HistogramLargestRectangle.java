package com.ulcdia.experiment_extra.histogram_largest_rectangle;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class HistogramLargestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("Please enter a positive number");
                return;
            }
            
            List<Integer> histogram = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input: Please enter integers only");
                    return;
                }
                int height = scanner.nextInt();
                if (height < 0) {
                    System.out.println("Invalid input: Heights cannot be negative");
                    return;
                }
                histogram.add(height);
            }
            
            int maxArea = findLargestRectangleArea(histogram);
            System.out.println(maxArea);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number");
        } finally {
            scanner.close();
        }
    }

    // https://www.geeksforgeeks.org/largest-rectangular-area-in-a-histogram-using-stack/
    public static int findLargestRectangleArea(List<Integer> heights) {
        if (heights == null || heights.isEmpty()) {
            return 0;
        }

        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < heights.size()) {
            // If stack is empty or current height is larger than the previous height,
            // push current index to stack
            if (stack.isEmpty() || heights.get(stack.peek()) <= heights.get(i)) {
                stack.push(i);
                i++;
            } else {
                // Calculate area with the height of the stack top as the smallest height
                int height = heights.get(stack.pop());
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
        }

        // Process remaining elements in the stack
        while (!stack.isEmpty()) {
            int height = heights.get(stack.pop());
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }

    public static int findLargestRectangleArea2(List<Integer> heights) {
        int maxArea = 0;

        for (int i = 0; i < heights.size(); i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < heights.size(); j++) {
                int height = heights.get(j);
                if (height < minHeight) {
                    minHeight = height;
                }
                int width = j - i + 1;
                int area = width * minHeight;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }
}
