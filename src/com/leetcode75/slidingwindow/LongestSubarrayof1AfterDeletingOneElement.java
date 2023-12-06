package com.leetcode75.slidingwindow;

public class LongestSubarrayof1AfterDeletingOneElement {

    public static void main(String[] args){
        int[] nums = new int[]{1,1,0,1};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int answer = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros --;
                }
                left++;
            }
            answer = Math.max(answer, right - left - zeros + 1);
        }

        return answer == nums.length ? answer - 1 : answer;
    }
}
