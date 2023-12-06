package com.leetcode75.stringarray;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfString {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels1(String s) {
        String vowels = "aeiou";
        StringBuilder result = new StringBuilder();
        List<String> reverseVowels = new ArrayList<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            String character = String.valueOf(s.charAt(i));
            if (vowels.contains(character.toLowerCase())) {
                reverseVowels.add(character);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            String character = String.valueOf(s.charAt(i));
            if (vowels.contains(character.toLowerCase())) {
                character = reverseVowels.remove(0);
            }
            result.append(character);
        }
        return result.toString();
    }

    public static String reverseVowels(String s) {

        char[] string = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !isVowel(string[start])) {
                start++;
            }
            while (start < end && !isVowel(string[end])){
                end--;
            }
            char temp = string[start];
            string[start] = string[end];
            string[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(string);
    }

    private static final String VOWELS = "aeiou";

    private static boolean isVowel(char character) {
        return VOWELS.contains(String.valueOf(character).toLowerCase());
    }
}
