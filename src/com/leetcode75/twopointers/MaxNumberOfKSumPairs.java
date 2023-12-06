package com.leetcode75.twopointers;

public class MaxNumberOfKSumPairs {

    public static void main(String[] args) {
        int[] nums = new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int k = 2;
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int countOfOperations = 0;
        while (left < nums.length) {
            while (right > left) {
                if (nums[left]!= 0 && nums[right] !=0 && nums[left] + nums[right] == k) {
                    countOfOperations++;
                    nums[left] = 0;
                    nums[right] = 0;
                    left++;
                }
                right --;
            }
            right = nums.length - 1;
            left++;
        }
        return countOfOperations;
    }
}
