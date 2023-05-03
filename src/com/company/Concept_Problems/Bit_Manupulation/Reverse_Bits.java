package com.company.Concept_Problems.Bit_Manupulation;
// Reverse bits of a given 32 bits unsigned integer.
public class Reverse_Bits {
    public static long reverseBit(long n) {
        if (n == 0) return 0;

        long result = 0;

        // integer is 32 bit long
        for (int i = 0; i < 32; i++) {
            // making space for last bit of n
            result <<= 1;

            // if last bit is 1 then add 1 to the space we created
            if ((n & 1) == 1) result++;

            // now shift n 1 bit right
            n >>= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        long n = 1100101010101L;
        System.out.println(reverseBit(n));
    }
}
