package com.company;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            String s = String.valueOf(n);
            n = 0;
            for (int i = 0; i < s.length(); i++) {
                int digit = Character.getNumericValue(s.charAt(i));
                n += digit * digit;
            }
            if (!set.isEmpty() && set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }

    // Floyd Cycle detection algorithm
    public static boolean isHappyFC(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    public static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
}
