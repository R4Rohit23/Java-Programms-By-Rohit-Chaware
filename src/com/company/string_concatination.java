package com.company;
import java.util.*;

public class string_concatination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        String str = scan.nextLine();
        System.out.println(i + i2);
        System.out.println(d + d2);
        String str3 = s +str;
        System.out.print(str3);
    }
}
