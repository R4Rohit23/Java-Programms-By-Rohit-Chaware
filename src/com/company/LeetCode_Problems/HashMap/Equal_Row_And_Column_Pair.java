package com.company.LeetCode_Problems.HashMap;
// Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
// A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Equal_Row_And_Column_Pair {
    public static int checkRowAndCol(int[][] grid) {
        // ALGORITHM
        // (1) Create an empty hash map row_counter and set count to 0.
        // (2) For each row in the grid, convert it into an equivalent hashable object and use it as a key to the
        // row_counter. Increment the value of the corresponding key by 1.
        // (3) For each column in the grid, convert it into the same type of hashable object and check if it appears in
        // the row_counter. If it does, increment count by the frequency.
        // (4) Return the answer count.

        int count = 0;
        int n = grid.length;
        // Map to store the count of particular row in the grid
        Map<String, Integer> row_counter = new HashMap<>();

        for (int[] row: grid) {
            String rowString = Arrays.toString(row);
            row_counter.put(rowString, row_counter.getOrDefault(rowString, 0) + 1);
        }

        for (int c = 0; c < n; c++) {
            int[] column = new int[n];
            for (int i = 0; i < n; i++) {
                column[i] = grid[i][c];
            }
            count += row_counter.getOrDefault(Arrays.toString(column), 0);
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println("Number of similar row and column " + checkRowAndCol(grid));
    }
}
