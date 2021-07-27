package com.company;
import java.util.Scanner;

public class Finding_Factorial {

     public static long factorial(long n) {
         long s = 1;
         for (long i = 1; i <= n; i++) {
             s = s * i;
         }
         return s;
     }
     /* Do not change code below */
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         long n = Integer.parseInt(scanner.nextLine().trim());
         System.out.println(factorial(n));
     }

}


