package com.company;

public class SubstringSearch {

    public static void main(String[] args) {
        String ransomNote = "aca";
        String magazine = "babacbacaabbb";
        System.out.println(isContain( ransomNote, magazine));
    }

    public static boolean isContain(String ransomNote, String magazine) {
        char[] ransomNoteChar = ransomNote.toCharArray();
        char[] magazineChar = magazine.toCharArray();
        boolean isContain = false;
        for (int i = 0; i < (magazineChar.length - ransomNoteChar.length) && !isContain; i++) {
            for (char c : ransomNoteChar) {
                if (magazineChar[i] != c) {
                    isContain = false;
                    break;
                }
                isContain = true;
                i++;
            }
        }
        return isContain;
    }
}
