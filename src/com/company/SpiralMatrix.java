package com.company;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = { {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        spiralOrder(matrix).forEach(v -> System.out.print(v + " "));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int cols = matrix.length;
        int rows = matrix[0].length;

        int top = 0, bottom = cols-1, left = 0, right = rows-1;
        System.out.println(top + " " + bottom + " " + left + " " + right);

        int dir = 1;

        while (top <= bottom && left <= right){
            if (dir == 1) {    // moving left->right
                for (int i = left; i <= right; ++i) {
                    System.out.println(matrix[top][i]);
                    result.add(matrix[top][i]);
                }
                ++top;
                dir = 2;
            }

            else if (dir == 2) {     // moving top->bottom
                for (int i = top; i <= bottom; ++i) {
                    System.out.println(matrix[i][right]);
                    result.add(matrix[i][right]);
                }
                --right;
                dir = 3;
            }

            else if (dir == 3) {     // moving right->left
                for (int i = right; i >= left; --i) {
                    System.out.println(matrix[bottom][i]);
                    result.add(matrix[bottom][i]);
                }
                --bottom;
                dir = 4;
            }
            else {
                for (int i = bottom; i >= top; --i) {
                    System.out.println(matrix[i][left]);
                    result.add(matrix[i][left]);
                }
                ++left;
                dir = 1;
            }
        }
        return result;
    }
}
