package com.company;
import java.util.Scanner;

//public class codchef
// Remember that the class name should be "Main" and should be "public".
public class codchef {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read the number of test cases.
        int T = scan.nextInt();
        while (T-- > 0) {
            // Read the numbers a.
            int num = scan.nextInt();
            System.out.println(sumDigit(num));

        }

    }

    //we are going to make another function
    public static int sumDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;


    }
}


