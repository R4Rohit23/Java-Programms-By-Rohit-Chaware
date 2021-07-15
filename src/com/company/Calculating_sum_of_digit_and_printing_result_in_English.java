package com.company;
import java.util.Scanner;

public class Calculating_sum_of_digit_and_printing_result_in_English {
    public static void main(String[] args) {
        int sum=0;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number:");
        String str = scan.nextLine();
        //Here we convert string into character
        char[] numstr =str.toCharArray();
        //Applying for loop for calculating sum
        for (int i=0;i<numstr.length;i++){
            sum +=numstr[i]-'0';
        }
        System.out.println("Original number:"+str);
        //Here we define new class
        print_number(sum);

    }
    public static void print_number(int n){
        int x;int y;int z;
        String[] number ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println("Sum of the digit of the said number:"+n);
        if (n<10){
            System.out.println(number[n]);
        }
        else if (n<100){
            x=n/10;
            y=n-x *10;
            System.out.println("In English: "+number[x]+" "+number[y]);
        }
        else {
            x=n/100;
            y=(n-x*100)/10;
            z=n-x*100-y*10;
            System.out.println("In English: "+number[x]+" "+number[y]+" "+number[z]);
        }


    }
}
