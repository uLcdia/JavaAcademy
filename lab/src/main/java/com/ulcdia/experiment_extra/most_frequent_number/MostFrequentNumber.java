package com.ulcdia.experiment_extra.most_frequent_number;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        Map<Integer, Integer> frequency = new HashMap<>();
        int maxFreq = 0;
        int mostFrequentNum = 0;
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int freq = frequency.getOrDefault(num, 0) + 1;
            frequency.put(num, freq);
            
            if (freq > maxFreq) {
                maxFreq = freq;
                mostFrequentNum = num;
            }
        }
        
        System.out.println(mostFrequentNum);
        scanner.close();
    }
}
