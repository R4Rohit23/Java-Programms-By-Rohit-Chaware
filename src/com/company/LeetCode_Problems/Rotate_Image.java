package com.company.LeetCode_Problems;
// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//
// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT
// allocate another 2D matrix and do the rotation.

public class Rotate_Image {
    public static void transpose(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void reverse(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        // to solve this problem you need to have a knowledge about matrix operation like
        // transpose => Interchange row into column and column into row
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 3 * 3 matrix

        // first you need to transpose the matrix

        // 1  2  3        1  4  7
        // 4  5  6   =>   2  5  8
        // 7  8  9        3  6  9

        transpose(matrix);

        // then reverse the transposed matrix

        // 1  4  7     7  4  1
        // 2  5  8 =>  8  5  2
        // 3  6  9     9  6  3

        reverse(matrix);

        for (int[] i: matrix) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
