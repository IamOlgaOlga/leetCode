package com.leetcode75.slidingwindow;

public class MaxConsecutiveOnesIII {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int result = 0;
        int flippedZeros = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0 ) {
                flippedZeros++;
            }
            while (flippedZeros > k) {
                if (nums[left] == 0) {
                    flippedZeros--;
                }
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
