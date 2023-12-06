package com.leetcode75.stringarray;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.Queue;
import java.util.Stack;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergeWord = new StringBuilder();

        int maxLength = word1.length();
        if (word1.length() < word2.length()){
            maxLength = word2.length();
        }
        for (int i = 0; i < maxLength; i++) {
            if (word1.length() > i) {
                mergeWord.append(word1.charAt(i));
            }
            if (word2.length() > i) {
                mergeWord.append(word2.charAt(i));
            }


        }
        return mergeWord.toString();
    }
}
