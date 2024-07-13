package com.company.Concept_Problems.Maths;
// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
public class Pow {
    public static double pow(double x, int n) {
        if(n==0) return 1;
        if(n<0) {
            n = -n;
            x = 1/x;
        }
        double ans = 1;
        while(n>0){
            if((n&1) == 1) ans *= x;
            x *= x;
            n >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(pow(2.10000, 3));
    }
}
