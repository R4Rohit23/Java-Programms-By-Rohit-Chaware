package com.company.Concept_Problems.Array;

import java.util.Arrays;

public class Multiplication_of_2Arrays {
    public static void main(String[] args) {
        int[] right_array = {0, 3, -8, 45, 689};
        int[] left_array = {9, -8, -73, 56, 7895};
        System.out.println("Right Array: " + Arrays.toString(right_array));
        System.out.println("Left Array: " + Arrays.toString(left_array));
        //Decalring result variable
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < left_array.length; i++) {
            int num1 = left_array[i];
            int num2 = right_array[i];
             result.append(num1 * num2).append(" ");


        }
        System.out.println("The result is: " + result);
    }
}
