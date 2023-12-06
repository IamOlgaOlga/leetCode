package com.company;

public class WhereWillTheBallFall {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,-1,-1,1,-1,1,1,1,1,1,-1,1,1,1,1,1,1,-1,-1,-1,-1,-1,-1,1,-1,1,-1,1,-1,-1,-1,-1,1,-1,1,1,-1,-1,-1,-1,-1,1},
                {-1,1,1,1,-1,-1,-1,-1,1,1,1,-1,-1,-1,1,-1,-1,1,1,1,1,1,1,-1,1,-1,-1,-1,-1,-1,1,-1,1,-1,-1,-1,-1,1,1,-1,1,1},
                {1,-1,-1,-1,-1,1,-1,1,1,1,1,1,1,1,-1,1,-1,-1,-1,1,-1,-1,1,-1,1,-1,1,-1,-1,1,-1,1,-1,1,1,-1,-1,1,1,-1,1,-1}};

        for(int step: findBall(matrix)){
            System.out.print(step + " ");
        }
    }

    public static int[] findBall(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] result = new int[cols];

        for(int ball = 0; ball < result.length; ball ++) {
            int i = ball, j = 0, from = 1;

            while (0 <= i && cols > i && 0 <= j && rows > j) {
                int diagonal = grid[j][i];
                if (diagonal == 1) {
                    if (from == 1) {
                        i++;
                        from = 4;
                    } else if (from == 2) {
                        break;
                    } else {
                        j++;
                        from = 1;
                    }
                } else {
                    if (from == 1) {
                        i--;
                        from = 2;
                    } else if (from == 2) {
                        j++;
                        from = 1;
                    } else {
                        break;
                    }
                }
            }
            result[ball] = (j == rows) ? i : -1;
        }
        return result;
    }

    /*
    public int[] findBall(int[][] grid) {
        int [] res = new int[grid[0].length];
        for(int i = 0; i < grid[0].length; i++)
        {
            res[i] = FindBallState(i, grid);
        }
        return res;
    }

    public int FindBallState(int col, int [][] grid)
    {
        int row = 0;
        while(row < grid.length && col < grid[0].length)
        {
            int nextColumn = col + grid[row][col];
            if(nextColumn < 0 || nextColumn > grid[0].length - 1 ||
                grid[row][col] != grid[row][nextColumn])
            return -1;

            if(grid[row][col] == 1)
            col+=1;

            else
            col-=1;
            row+=1;
        }
        return col;
    }
     */


    //DFS

    /*
    public int[] findBall(int[][] grid) {
        int result[] = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            result[i] = findBallDropColumn(0, i, grid);
        }
        return result;
    }

    public int findBallDropColumn(int row, int col, int[][] grid) {
        // base case; ball reached the last row
        if (row == grid.length)
            return col;
        int nextColumn = col + grid[row][col];
        if (nextColumn < 0 ||
                nextColumn > grid[0].length - 1 ||
                grid[row][col] != grid[row][nextColumn]) {
            return -1;
        }
        return findBallDropColumn(row + 1, nextColumn, grid);
    }
     */
}
