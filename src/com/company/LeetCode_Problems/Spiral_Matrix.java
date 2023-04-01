package com.company.LeetCode_Problems;
// Given an m x n matrix, return all elements of the matrix in spiral order.

import java.util.ArrayList;

public class Spiral_Matrix {

    public static ArrayList<Integer> spiralMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        // basic variables
        int left = 0;
        int right = matrix.length - 1;
        int top = 0;
        int bottom = matrix[0].length - 1;

        while (left <= right && top <= bottom) {

            // LEFT => RIGHT
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // TOP => BOTTOM
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            // RIGHT => LEFT
            for (int i = right; i >= left && bottom >= top; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;

            // BOTTOM => UP
            for (int i = bottom; i >= top && right >= left; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> res = spiralMatrix(arr);

        for (int i: res) {
            System.out.print(i + " ");
        }
    }
}
