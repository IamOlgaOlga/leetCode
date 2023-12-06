package com.leetcode75.stringarray;

public class ReverseWordsInString {

    public static void main(String[] args){
        String s = "  the sky   is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for (int i = words.length-1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
