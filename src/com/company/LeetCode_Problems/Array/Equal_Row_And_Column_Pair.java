package com.company.LeetCode_Problems.Array;
// Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
//A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
public class Equal_Row_And_Column_Pair {
    public static int checkRowAndCol(int[][] grid) {
        // ALGORITHM
        // (1) Initialize count to 0.
        // (2) Iterate over each row R in grid.
        // (3) For each row, iterate over each column C in grid.
        // (4) Check if row R equals column C by comparing each element at the same index i in both R and C. If row R
        // equals column C, increment count by 1.
        // (5) Return count after iterating over all row-column pairs.

        int count = 0;
        int n = grid.length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                boolean match = true;

                for (int i = 0; i < n; i++) {
                    if (grid[row][i] != grid[i][col]) {
                        match = false;
                        break;
                    }
                }

                count += match ? 1 : 0;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println("Number of similar row and column " + checkRowAndCol(grid));
    }
}
