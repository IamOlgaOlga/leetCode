package com.leetcode75.prefixsum;

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = new int[] {2,1,-1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i=0; i < nums.length; i++) {
            rightSum += nums[i];
        }
        for (int i=0; i< nums.length; i++) {
            leftSum += (i==0) ? 0: nums[i-1];
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
