package com.leetcode75.twopointers;

public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxS = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int currentS = Math.min(height[left], height[right]) * (right - left);
            maxS = Math.max(maxS, currentS);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxS;
    }
}
