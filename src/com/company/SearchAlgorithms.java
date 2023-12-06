package com.company;

public class SearchAlgorithms {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int target = 3;
        System.out.println(binarySearch(array, target));
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (target < array[mid])
                high = mid - 1;
            else if (target > array[mid])
                low = mid + 1;
            else break;
        }
        return mid;
    }
}
