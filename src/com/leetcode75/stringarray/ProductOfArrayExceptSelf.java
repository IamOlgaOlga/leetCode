package com.leetcode75.stringarray;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] result = productExceptSelf(nums);
        for(int num: result){
            System.out.print(num + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];// right
        answer[nums.length - 1] = 1;
        answer[nums.length - 2] = nums[nums.length - 1];

        for (int i = nums.length - 3; i >= 0; i--){
            answer[i] = answer[i + 1]*nums[i + 1];
        }

        int helper = nums[0]; // left
        int prev;

        for (int i = 1; i < answer.length; i++){
            prev = nums[i];
            answer[i] = answer[i] * helper;
            helper *= prev;
        }
        return answer;
    }

//    public static int[] productExceptSelf(int[] nums) {
//        int[] answer = new int[nums.length];
//        answer = recursionSum(0, nums, answer, 0);
//        return answer;
//    }
//
//    private static int[] recursionSum(int index, int[] nums, int[] answer, int sum) {
//        sum += nums[index];
//        if (index == nums.length - 1) {
//            answer[index] = sum - nums[index];
//            answer[index - 1] = sum;
//            return answer;
//        } else {
//            answer = recursionSum(index + 1, nums, answer, sum);
//            if (index != 0) {
//                answer[index - 1] = answer[index];
//            }
//            answer[index] = answer[index] - nums[index];
//        }
//        return answer;
//    }

}
