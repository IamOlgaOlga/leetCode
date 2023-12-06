package com.leetcode75.slidingwindow;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int count = 0;
        //look at the first window with length k and calculate vowels
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count ++;
            }
        }
        int result = count;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                count --;
            }
            if (isVowel(s.charAt(i))) {
                count++;
            }
            result = Math.max(result, count);
        }
        return result;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
