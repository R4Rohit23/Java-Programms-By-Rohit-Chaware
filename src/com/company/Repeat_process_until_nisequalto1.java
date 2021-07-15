package com.company;
import java.util.Scanner;

public class Repeat_process_until_nisequalto1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the integer:");
        int n= scan.nextInt();
        int ctr=0;
        while(n!=1){
            if (n%2==0){
                n=n/2;
                ctr +=1;
            }
            else {
                n=((3*n)+1);
                ctr +=1;
            }
        }
        System.out.println(ctr);
        scan.close();

    }
}
