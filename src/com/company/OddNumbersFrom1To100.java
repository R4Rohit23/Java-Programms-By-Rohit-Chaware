package com.company;

public class OddNumbersFrom1To100 {
    public static void main(String[] args) {
        int num=0;
        System.out.println("The odd Numbers are:");
        for (num=0;num<=100;num++){
            if (num%2!=0){
                System.out.println(num);
            }
        }
    }
}
