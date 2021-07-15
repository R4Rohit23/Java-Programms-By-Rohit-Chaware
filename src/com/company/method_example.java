package com.company;
import java.util.*;

public class method_example {
    //creating our method
   public static int sum(int x,int y) {
        int z;
        if (x<y){
            z = (x+y) * 5;
        }
        else{
            z = x + y;
        }
        return z;
    }

    //main method
    public static void main(String[] args) {
        int a=5;
        int b=6;
        //calling our method
        int c = sum(a,b);  //sum = method name
        System.out.println(c);
    }
}
