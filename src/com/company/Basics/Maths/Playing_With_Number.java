package com.company.Basics.Maths;

import java.util.ArrayList;

public class Playing_With_Number {
    public static void countDigitInNumber(int N) {
        int input = N;
        int count = 0;
        while (N > 0) {
            count++;
            N /= 10;
        }
        System.out.println("Count of the digits in the number " + input + " is: " + count);
    }

    public static void countDigitInNumberOptimal(int N) {
        // The logarithmic base 10 of a positive integers gives the number of digits in n. We add 1 to the result to ensure
        // that the count is correct even for numbers that are powers of 10.

        // We cast the result to an integer to ensure that any fractional part is discarded giving the exact count of digits.
        int result = (int) (Math.log10(N) + 1);
        System.out.println("Count of the digits in the number (optimal) " + N + " is: " + result);

        // Time complexity -> O(1)
    }

    public static void reverseDigitOfNumber(int N) {
        int input = N;
        int res = 0;

        while (N > 0) {
            int lastDigit = N % 10;
            res = res * 10 + lastDigit;
            N /= 10;
        }
        System.out.println("The reversed number for input " + input + " is: " + res);
    }

    public static void sumOfDigitsInNumber(int N) {
        int input = N;
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        System.out.println("Sum of the digits in the number " + input + " is: " + sum);
    }

    public static void checkPalindrome(int N) {
        // Palindrome is the number that reads the same backward as forward
        int i = 0, j = String.valueOf(N).length() - 1;
        String input = String.valueOf(N);

        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                System.out.println(N + " is not a palindrome number");
                return;
            }
            i++;
            j--;
        }
        System.out.println(N + " is a palindrome number");
    }

    public static void findGCDBruteForce(int n1, int n2) {
        for (int i = Math.min(n1, n2); i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("GCD of " + n1 + " and " + n2 + " is " + i);
                return;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + 1);
    }

    public static void findGCDOptimal(int n1, int n2) {
        int input1 = n1;
        int input2 = n2;
//        The Euclidean Algorithm is a method for finding the greatest common divisor of two numbers.
//        It operates on the principle that the GCD of two numbers remains the same even if the smaller number
//        is subtracted from the larger number.

//        To find the GCD of n1 and n2 where n1 > n2:
//        Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
//        Once one of them becomes 0, the other number is the GCD of the original numbers.

        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }

        if (n1 == 0) {
            System.out.println("GCD of " + input1 + " and " + input2 + " is " + n2);
        }
        System.out.println("GCD of " + input1 + " and " + input2 + " is " + n1);
    }

    public static void isArmstrongNumber(int N) {
        // An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the
        // number of digits.
        int totalDigits = (int) Math.log10(N) + 1;
        int sum = 0;
        int input = N;

        while (N > 0) {
            sum += Math.pow(N % 10, totalDigits);
            N /= 10;
        }

        System.out.println(input == sum ? input + " is armstrong number" : input + " is not a armstrong number");
    }

    public static void printAllDivisors(int N) {
        // for any non-negative integer n, if d is a divisor of n then n/d is also a divisor of n

        ArrayList<Integer> divisors = new ArrayList<>();

        // Iterate up to the square
        // root of n to find divisors
        // Calculate the square root of n
        int sqrtN = (int) Math.sqrt(N);

        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                divisors.add(i);

                // Add the counterpart divisor
                // if it's different from i
                if (i != N / i) {
                    // Add the counterpart
                    // divisor to the list
                    divisors.add(N / i);
                }
            }
        }
        divisors.sort(null);
        System.out.println("The divisors of " + N + " are " + divisors);
    }

    public static void checkIsPrime(int N) {
        // A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.
        int count = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if ( N % i == 0) {
                count++;

                if (i != N / i) {
                    count++;
                }
            }
        }
        System.out.println(count > 2 ? N +  " is not a prime number" : N + " is prime number" );
    }

    public static void main(String[] args) {
        countDigitInNumber(12345);
        sumOfDigitsInNumber(12345);
        reverseDigitOfNumber(14000);
        checkPalindrome(7913431);
        findGCDBruteForce(11, 13);
        findGCDOptimal(20, 15);
        isArmstrongNumber(153);
        printAllDivisors(36);
        checkIsPrime(1483);
    }
}
