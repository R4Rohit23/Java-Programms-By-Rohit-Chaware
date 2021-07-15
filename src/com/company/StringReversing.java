package com.company;
import java.util.Scanner;

public class StringReversing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string:");
        char[] letters = scan.nextLine().toCharArray();  //toCharArray converts inputed string into character array
        System.out.print("Revers String:");
        for (int i = letters.length-1;i>=0;i--){
            System.out.print(letters[i]);
        }

    }
}
