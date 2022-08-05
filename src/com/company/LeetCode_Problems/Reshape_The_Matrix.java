//You are given an m x n matrix mat and two integers r and c representing the number of rows and
//        the number of columns of the wanted to be reshaped matrix.

package com.company.LeetCode_Problems;

public class Reshape_The_Matrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (r * c != m * n) return mat;
        int[][] res = new int[r][c];
        for (int i = 0, k = 0, l = 0; i < m; i++) {
            for (int j = 0; j < n; j++, l++) {
                if (l == c) {
                    k++;
                    l = 0;
                }
                res[k][l] = mat[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {

        // creating 2d array
        int[][] mat = {{1, 2}, {3, 4}};

        int[][] ans = matrixReshape(mat, 1, 4);

        for (int[] an : ans) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(an[j] + " ");
            }
        }

    }
}
