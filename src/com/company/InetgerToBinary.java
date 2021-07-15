package com.company;
import java.util.Scanner;

public class InetgerToBinary {
    public static int countBitsToZeroBasedOnString(int num){
        int ctr =0;
        String binaryNumber =Integer.toBinaryString(num); //It converts integer no. into binary no.
        System.out.print("Binary representation of "+num+" is: "+binaryNumber);
        for (char ch : binaryNumber.toCharArray()){  //this statement converts binary number into list of characters in ch
            ctr +=ch =='0'? 1:0; //if ctr+ch=0 then give ctr=1 else ctr=0
        }
        return ctr;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter which integer you want to convert into Binary:");
        int num=scan.nextInt();
        System.out.print("\nNumber of zero bits:"+countBitsToZeroBasedOnString(num));


    }
}
