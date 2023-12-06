package com.leetcode75.twopointers;

public class IsSubsequence {

    public static void main(String[] args) {
        String s = "abc";
        String t = "afrcd";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        if (s.length() > t.length()) return false;
        for (int i = 0; i < t.length() && j != s.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }
        return j == s.length();
    }
}
