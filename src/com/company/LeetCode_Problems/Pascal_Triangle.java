package com.company.LeetCode_Problems;
// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it.

import java.util.ArrayList;
import java.util.List;

// Pascal's triangle is a triangular array of numbers where the first and last number in each row is 1,
// and each of the remaining numbers in the row is the sum of the two numbers directly above it in the previous row.
// To generate the first numRows of Pascal's triangle, we can use a nested loop to fill in the values of the triangle.
public class Pascal_Triangle {
    public static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> res = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // end elements
                if (j == 0 || j == i)
                    res.add(1);
                else {
                    // i-1 => get previous row
                    // j-1 => get previous element
                    res.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }

            }
            ans.add(res);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> ans = pascalTriangle(5);
    }
}
