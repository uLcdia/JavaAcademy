package com.ulcdia.experiment_3.random_char_count;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomCharCount {
    public static void main(String[] args) {
        final int LENGTH = 100;
        final char START_CHAR = 'a';
        final int ALPHABET_SIZE = 26;
        
        StringBuilder stringBuilder = new StringBuilder(LENGTH);
        Map<Character, Integer> characterCount = new HashMap<>();
        
        Random random = new Random();
        
        for (int i = 0; i < LENGTH; i++) {
            char randomChar = (char) (START_CHAR + random.nextInt(ALPHABET_SIZE));
            stringBuilder.append(randomChar);
            characterCount.put(randomChar, characterCount.getOrDefault(randomChar, 0) + 1);
        }
        
        String randomString = stringBuilder.toString();
        System.out.println(randomString);
        System.out.println(characterCount);
    }
}
