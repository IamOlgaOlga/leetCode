package com.leetcode75.slidingwindow;

public class MaximumAverageSubarrayI {

    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        int k = 1;
        System.out.println(findMaxAverage(nums, k));
    }

    //contiguous -- смежный
    public static double findMaxAverage(int[] nums, int k) {
        int cur = 0;
        for(int j=0;j<k;j++){
            cur += nums[j];
        }
        int max = cur;
        for(int i=k;i<nums.length;i++){
            cur += nums[i] - nums[i-k];
            max = Math.max(max,cur);
        }
        return (double)max/k;
    }

}
