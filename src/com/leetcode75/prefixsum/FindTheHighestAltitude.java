package com.leetcode75.prefixsum;

public class FindTheHighestAltitude {

    public static void main(String[] args) {
        int[] gain = new int[]{-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int result = Integer.MIN_VALUE;
        int currentAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude = currentAltitude + gain[i];
            result = Math.max(result, currentAltitude);
        }
        return result;
    }
}
