package com.leetcode75.stringarray;

public class StringCompression {

    public static void main(String[] args) {
        char[] chars = new char[]{'a','a','a','a','a','b'};
        System.out.println(compress(chars));
    }

    /**
     * Can I use Streams or System.arrayCopy(), but it uses one more array inside...
     * @param chars
     * @return
     */
    public static int compress(char[] chars) {

        int i = 0, res = 0;
        while (i < chars.length) {
            int groupLength = 1;
            while (i + groupLength < chars.length && chars[i + groupLength] == chars[i]) {
                groupLength++;
            }
            chars[res++] = chars[i];
            if (groupLength > 1) {
                for (char c : Integer.toString(groupLength).toCharArray()) {
                    chars[res++] = c;
                }
            }
            i += groupLength;
        }
        return res;
        /**
        char groupName = chars[0];
        int groupCount = 1;
        int startOfGroup = 0;
        int endOfArray = chars.length;
        for (int i = 1; i < endOfArray; i++) {
            if (groupName == chars[i]) {
                groupCount ++;
            }
            if (groupName != chars[i] || i == endOfArray - 1){
                if (groupCount != 1) {
                    int endOfGroup = (i == endOfArray - 1 && groupName == chars[i]) ? i + 1 : i;
                    //rewrite an array and put groupName and it's count:
                    // need to change everything > indexOf group and <i(it's a new group) and put a new element(s) with count
                    endOfArray = shiftArray(chars, startOfGroup, endOfGroup, groupCount, endOfArray);
                    groupCount = 1;
                    groupName = chars[i];
                    i = startOfGroup + 2;
                } else {
                    groupName = chars[i];
                }
                startOfGroup = i;
            }
        }
        return endOfArray;
         */
    }

    /**
    //return a new "end" of array
    private static int shiftArray(char[] array, int start, int endOfGroup, int groupCount, int endOfArray) {
        // if groupCount == 2 -> do not shift, put groupCount to index start + 1
        int newIndex = start + 2; // (start+1) for group count: + 1 + 1
        if (groupCount > 9) {
            char[] digits = String.valueOf(groupCount).toCharArray();
            newIndex += digits.length - 1; // (start+1) for group count: length + 1
            endOfGroup += digits.length - 1;
            for (int i = start + 1; i < newIndex; i++) {
                array[i] = digits[i - start - 1];
            }
        } else {
            array[start + 1] = Character.forDigit(groupCount, 10);
        }
        if (groupCount == 2) {
            return endOfArray;
        }
        for (int k = endOfGroup; k < endOfArray; k++) {
            array[newIndex] = array[k];//shift a tail of array to start + (length of insertion) position
            newIndex ++;
        }
        return newIndex;
    }
     */
}
