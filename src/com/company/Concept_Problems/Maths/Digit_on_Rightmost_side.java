//Print true when the digit of (two or more number) on the rightmost side of an integer is same
package com.company.Concept_Problems.Maths;
import java.util.Scanner;

public class Digit_on_Rightmost_side {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st integer:");
        int num1 = scan.nextInt();
        System.out.print("Enter the 2nd integer:");
        int num2 = scan.nextInt();
        System.out.print("Enter the 3rd integer:");
        int num3 = scan.nextInt();
        System.out.println("It will print true when the digit  on rightmost side of two or more integer is same");
        System.out.println("The result is:" + test_last_digit(num1, num2, num3, true));
     }

    public static boolean test_last_digit(int p,int q,int r,boolean num1num2num3){
        return (p%10==q%10) || (p%10==r%10) || (q%10==r%10);
    }


    }

