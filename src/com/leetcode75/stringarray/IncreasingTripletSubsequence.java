package com.leetcode75.stringarray;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {
        int[] nums = new int[]{1,5,0,4,1,3};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int firstMax = Integer.MAX_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= firstMax) {
                firstMax = num;
            } else if (num <= secondMax) {
                secondMax = num;
            } else return true;
        }
        return false;
    }
}
