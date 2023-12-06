package com.leetcode75.stringarray;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1,0,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean prevOccupied = false;
        for (int i = 0; i < flowerbed.length; i++) {
           if (flowerbed[i] == 1) {
                prevOccupied = true;
           } else {
               if (!prevOccupied && (i + 1 == flowerbed.length || flowerbed[i + 1] == 0)) {
                   n--;
                   prevOccupied = true;
               } else {
                   prevOccupied = false;
               }
           }
        }
        return n <= 0;
    }
}
