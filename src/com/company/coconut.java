package com.company;
import java.util.Scanner;

public class coconut {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int xa,xb,Xa,Xb,A = 0,B = 0;
        while (T <= 0){
             xa = scan.nextInt();
             xb = scan.nextInt();
             Xa = scan.nextInt();
             Xb = scan.nextInt();
             A = Xa / xa;
             B = Xb / xb;
            int total = A + B;
          T--;
        }

        int total = 0;
        System.out.println(total);

    }
}
