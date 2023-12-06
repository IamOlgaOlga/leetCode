package com.company;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "baa";
        System.out.println(canConstruct( ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> characterCollection = new HashMap<>();
        char c;
        int count;
        for (int i = 0; i < magazine.length(); i++){
            c = magazine.charAt(i);
            count = characterCollection.getOrDefault(c, 0);
            characterCollection.put(c, count + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            c = ransomNote.charAt(i);
            count = characterCollection.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            characterCollection.put(c, count - 1);
        }
        return true;
    }

    /*
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] arr = new int[26];
        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--arr[c - 'a'] < 0) return false;
        }
        return true;
    }
     */

    /*
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] letters = new int[26];

        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, letters[c - 'a']);

            if (index == -1) {
                return false;
            }
            letters[c - 'a'] = index + 1;
        }
        return true;
    }
     */

    /*
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] frequency = new int[26];

        for (int i = 0; i < magazine.length(); i++)
            frequency[magazine.charAt(i) - 'a']++;

        for (int i = 0; i < ransomNote.length(); i++)
            if (--frequency[ransomNote.charAt(i) - 'a'] < 0) return false;
        return true;
    }
     */
}
