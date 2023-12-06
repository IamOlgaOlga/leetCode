package com.company;

public class BitOperations {
//    /**
//     * Basic solution
//     * @param n number
//     * @return count set bits
//     */
//    private static int helper(int n) {
//        int count = 0;
//        while (n > 0) {
//            count += (n & 1);
//            n >>= 1;
//        }
//        return count;
//    }

//    /**
//     * Brian Kernighan’s algorithm
//     * @param n
//     * @return count set bits
//     */
//    private static int helper(int n) {
//        int count = 0;
//        while (n > 0) {
//            n &= (n - 1);
//            count++;
//        }
//        return count;
//    }

    /**
     * Lookup table approach
     * @param n number
     * @return count set bits
     */
    private static int helper(int n) {
        int[] table = new int[256];
        table[0] = 0;

        for (int i = 1; i < 256; i++) {
            table[i] = (i & 1) + table[i >> 1]; // i >> 1 equals to i/2
        }

        int res = 0;
        for (int i = 0; i < 4; i++) {
            res += table[n & 0xff];
            System.out.println("tab[ " + (n & 0xff) + "] = " + table[n & 0xff]);
            n >>= 8;
            System.out.println("n:" + n);
        }

        return res;
    }

//    /**
//     * Main for SetBit count issues
//     */
//    public static void main(String[] args) {
//        int number = 125;
//        System.out.println("SetBit Count is : " + helper(number));
//    }


//    /**
//     * Bit shifting algorithm
//     * @return hammingDistance
//     */
//    public static int hammingDistance(int a, int b) {
//        int xor = a ^ b;
//        System.out.println("xor = " + xor);
//        int distance = 0;
//
//        while (xor != 0) {
//            if (xor % 2 == 1) {
//                System.out.println("xor % 2 = " + xor % 2);
//                distance += 1;
//            }
//            xor >>= 1;
//            System.out.println("xor after shift= " + xor);
//        }
//
//        return distance;
//    }

    /**
     * Brian Kernighan's algorithm
     * @return hammingDistance
     */
    public static int hammingDistance(int a, int b) {
        int xor = a ^ b;
        int distance = 0;

        while (xor != 0) {
            distance += 1;
            xor &= ( xor - 1); // equals to `xor = xor & ( xor - 1);`
        }

        return distance;
    }

    /**
     * Main for HammingDistance issues
     */
//    public static void main(String[] args) {
//        int a = 1;
//        int b = 8;
//        System.out.println("Hamming Distance between two integers is " + hammingDistance(a, b));
//    }

    public static void main(String[] args) {
        int pos = 41;
        int neg = -41;
        while (pos > 0) {
            System.out.println(pos);
            pos = pos >>> 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " shifts: " + neg + ", binary: " + Integer.toBinaryString(neg));
            neg = neg >> 1;
        }
    }
}
