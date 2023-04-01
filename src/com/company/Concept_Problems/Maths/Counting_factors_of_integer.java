package com.company.Concept_Problems.Maths;
import java.util.Scanner;

public class Counting_factors_of_integer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the integer:");
        int num = scan.nextInt();
        System.out.println(result(num));
    }

    public static int result(int num) {
        int fact=0;
        for (int i=1;i<=(int)Math.sqrt(num);i++){
            if (num%i==0 && i*i!=num){
                fact+=2;
            }
            else if (i*i==num){
                fact++;
            }
        }
        System.out.print("The factors of"+" "+num+" "+"Are:");
        return fact;
    }



}

