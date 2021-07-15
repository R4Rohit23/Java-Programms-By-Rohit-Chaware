package com.company;
import java.util.Scanner;

public class MultiplicationWithoutArithmaticOperator {
    public static int multiplication(int n1, int n2){
        int result=0;
        boolean negative_num=(n1<0 && n2>=0) || (n1>=0 && n2<0);  //
        boolean positive_num=!negative_num;
        n1=Math.abs(n1);
        for (int i=0;i<n1;i++){
            if (negative_num && n2>0 || positive_num && n2<0)
                result -=n2;
            else
                result +=n2;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = scan.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2 = scan.nextInt();
        System.out.print("Result: "+multiplication(n1,n2));

    }
}
