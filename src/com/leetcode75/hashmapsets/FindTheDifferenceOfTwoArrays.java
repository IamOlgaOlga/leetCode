package com.leetcode75.hashmapsets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {

    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,3,3};
        int[] nums2 = new int[]{1,1,2,2};
        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println();
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> numbersInNums1 = new HashSet<>(nums1.length);
        Set<Integer> numbersInNums2 = new HashSet<>(nums1.length);
        Set<Integer> helper = new HashSet<>(nums1.length);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++){
            numbersInNums1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            numbersInNums2.add(nums2[i]);
        }

        for (Integer elem: numbersInNums1) {
            if (numbersInNums2.contains(elem)) {
                helper.add(elem);
                numbersInNums2.remove(elem);
            }
        }
        numbersInNums1.removeAll(helper);
        result.add(new ArrayList<>(numbersInNums1));
        result.add(new ArrayList<>(numbersInNums2));
        return result;
    }
}
