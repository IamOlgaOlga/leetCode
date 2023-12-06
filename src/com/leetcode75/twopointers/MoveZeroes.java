package com.leetcode75.twopointers;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0};
        moveZeroes(nums);
        System.out.println(nums);
    }

    public static void moveZeroesBetter(int[] nums){
        if (nums.length == 1) {
            return;
        }

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }


        while(nonZeroIndex<nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }



    public static void moveZeroes(int[] nums) {
        int zeroPointer;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroPointer = i;
                while (i < nums.length - 1) {
                    i++;
                    if (nums[i] != 0) {
                        nums[zeroPointer] = nums[i];
                        nums[i] = 0;
                        if (i != nums.length -1) {
                            i = zeroPointer;
                        }
                        break;
                    }
                }
            }
        }
    }
}
