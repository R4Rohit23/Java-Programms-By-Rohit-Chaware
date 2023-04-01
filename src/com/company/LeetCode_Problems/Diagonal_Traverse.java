package com.company.LeetCode_Problems;
// Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order

// ------------- Points to be noted --------------------------------
// (1) The first row and the last column in this problem would serve as the starting point for the corresponding diagonal.
// (2) For going up in the diagonal => [i, j] = [i-1, j+1]
// (3) For going down in the diagonal => [i, j] = [i+1, j-1]

// -------------------- Important Points -----------------------------
// (1) Direction of the diagonal
// => We can simply use a boolean variable and keep alternating it to figure out the direction for a diagonal.

// (2) Next head of the diagonal depending upon its direction
// => The good part is, we already know the end of the previous diagonal. We can use that information to figure out
// the head of the next diagonal.

// ------------ Next Head when going UP ----------------
// For going upward the head lie below the downward diagonal's tail
// if tail lies in last row then the head will be present right next to the tail

// ------------- Next Head when going DOWN -----------------------------
// For going downward the head lie right next to the upward diagonal's tail
// if tail lies in the last column then the head will be present below the tail

// -------------------------------------------- ALGORITHM -------------------------------------------------
// (1) Initialize a boolean variable called direction which will tell us whether the current diagonal is an upwards or downwards going.
//     Based on the current direction and the tail, we will determine the head of the next diagonal. Initially the
//     direction would be 1 which would indicate up. We will keep alternating this value from one iteration to the next.

// (2) Assuming we know the head of a diagonal, say matrix[i][j], we will use the direction to progress along the diagonal and process its elements.
//     For an upwards going diagonal, the next element in the diagonal would be matrix[i - 1][j + 1]
//     For a downwards going diagonal, the next element would be matrix[i + 1][j − 1].

// (3) We keep processing the elements of the current diagonal until we go out of the boundaries of the matrix.

// (4) Now, given that we know the tail of the diagonal (the last node before we went out of bounds), let's see how we can find the next head.
//     Note that in the following pseudocode, the direction is for the current diagonal and we are trying to find the
//     head of the next diagonal. So, if the direction is up, it means the next diagonal would be going down and
//     vice-versa.

//     tail = [i, j]
//     if direction == up, then {
//        if [i, j + 1] is within bounds, then {
//           next_head = [i, j + 1]
//        } else {
//          next_head = [i + 1, j]
//       }
//    } else {
//         if [i + 1, j] is within bounds, then {
//              next_head = [i + 1, j]
//         } else {
//              next_head = [i, j + 1]
//         }
//    }

public class Diagonal_Traverse {
    public static int[] findDiagonalOrder(int[][] matrix) {

        // check for empty martix
        if (matrix == null || matrix.length == 0)
            return new int[0];

        // variable to track the size of the matrix
        int N = matrix.length;
        int M = matrix[0].length;

        // variable to traverse the whole matrix
        int row = 0, column = 0;

        // variable to keep track of the direction of the diagonal
        int direction = 1;

        // result array
        int[] result = new int[N*M];
        int r = 0;

        // while loop to iterate all the elements of the matrix
        while (row < N && column < M) {

            // First add the element to the result array
            result[r++] = matrix[row][column];

            // Now move along the current diagonal
            // UP => [i, j] => [i - 1, j + 1]
            // DOWN => [i, j] => [i + 1, j - 1]
            int newRow = row + (direction == 1 ? -1 : 1);
            int newCol = column + (direction == 1 ? 1 : -1);

            // Checking if the next element in the diagonal is within the
            // bounds of the matrix or not. If it's not within the bounds,
            // we have to find the next head.
            if (newRow < 0 || newRow == N || newCol < 0 || newCol == M) {

                // UP
                if (direction == 1) {
                    // For an upwards going diagonal having [i, j] as its tail
                    // If [i, j + 1] is within bounds, then it becomes
                    // the next head. Otherwise, the element directly below
                    // i.e. the element [i + 1, j] becomes the next head
                    // check NEXT HEAD GOING DOWN notes
                    row += (column == M - 1 ? 1 : 0);
                    column += (column < M - 1 ? 1 : 0);

                }
                else {
                    // For a downwards going diagonal having [i, j] as its tail
                    // if [i + 1, j] is within bounds, then it becomes
                    // the next head. Otherwise, the element directly below
                    // i.e. the element [i, j + 1] becomes the next head
                    column += (row == N - 1 ? 1 : 0);
                    row += (row < N - 1 ? 1 : 0);
                }

                // flip the direction
                direction = 1 - direction;
            }
            else {
                row = newRow;
                column = newCol;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //       /\       /\
        //      /    /   /
        //    1    2    3
        //  /    /    /     /
        //    4     5     6
        //   /    /     /    /\
        // \/   /     /     /
        //    7     8      9
        //  /      /      /
        //       \/     /

        int[] res = findDiagonalOrder(arr);
        for (int i: res) {
            System.out.print(i + " ");
        }
    }
}
