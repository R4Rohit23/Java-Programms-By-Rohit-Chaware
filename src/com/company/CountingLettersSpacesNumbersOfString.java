package com.company;
import java.util.Scanner;

public class CountingLettersSpacesNumbersOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string:");
        String test =scan.nextLine().toString();
        System.out.println("The string is:" + test);
        count(test);
    }
    //count function is starts here
    private static void count(String x) {
        char[] ch =x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i=0;i<x.length();i++){
            if (Character.isLetter(ch[i])){
                letter++;
            }
            else if (Character.isDigit(ch[i])){
                num++;
            }
            else if (Character.isSpaceChar(ch[i])){
                space++;
            }
            else {
                other++;
            }

        }
        System.out.println("Letters:" + letter);
        System.out.println("Spaces:" + space);
        System.out.println("Numbers:" + num);
        System.out.println("Other:" + other);


    }

}
