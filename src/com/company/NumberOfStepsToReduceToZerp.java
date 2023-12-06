package com.company;

public class NumberOfStepsToReduceToZerp {

    public static void main(String[] args) {
        int num = 123;
        int steps = 0;
        int extraStep;
        while (num >= 1) {
            extraStep = num == 1 ? 0: num&1 ;
            steps += 1 + extraStep;
            num >>= 1;
        }
        System.out.println(steps);
    }
}
