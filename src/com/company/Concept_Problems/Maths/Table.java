package com.company.Concept_Problems.Maths;
import  java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tell me which number's table do you want:");
        int num = scan.nextInt();
        int cross = 1;
        System.out.println("The table of given number will be:");
        while (cross<=10){
            System.out.println(num + "x" + cross + "=" +(num*cross));
            cross++;
        }


    }
}
