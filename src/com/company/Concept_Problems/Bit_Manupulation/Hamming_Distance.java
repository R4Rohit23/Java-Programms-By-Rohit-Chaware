package com.company.Concept_Problems.Bit_Manupulation;

import java.util.Scanner;

// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
// Given two integers x and y, return the Hamming distance between them.
public class Hamming_Distance {
    public static int hammingDis(int x, int y) {
        // The Hamming distance between two equal-length strings of symbols is the number of positions at which the
        // corresponding symbols are different.
        // i.e simply xor of two integers
        int xor = x ^ y;
        int count = 0;

        while (xor != 0) {
            // 1 if two bits are different
            // 0 if two bits are same
            count += (xor & 1);
            xor = xor>>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(hammingDis(x, y));
    }
}
