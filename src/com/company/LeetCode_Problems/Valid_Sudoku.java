package com.company.LeetCode_Problems;

import java.util.HashSet;
import java.util.Set;

// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following
// Rules:
// (1) Each row must contain the digits 1-9 without repetition.
// (2) Each column must contain the digits 1-9 without repetition.
// (3) Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:
// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.
public class Valid_Sudoku {
    public static boolean validSudoku(char[][] board) {
        // we are taking help of the HashSet data structure to store the occurrence of the digit
        Set<String> seen = new HashSet<>();

        for (int row = 0; row < 9; ++row) {
            for (int column = 0; column < 9; ++column) {
                char number = board[row][column];
                if (number != '.') {
                    // if this string already in the seen set then this condition return false
                    // row/3 and column/3 => partioning the board subbox into index value of 0 1 2
                    // if row = 4 then its index 3/3 = 1, 4/3 = 1, 5/3 = 1 and so on
                    if(!seen.add(number + "is in " + row) ||
                       !seen.add(number + "is in " + column) ||
                       !seen.add(number + "is in block " + row/3 + "-" + column/3)) return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                          {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                          {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                          {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                          {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                          {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                          {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                          {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                          {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(validSudoku(board));
    }
}
