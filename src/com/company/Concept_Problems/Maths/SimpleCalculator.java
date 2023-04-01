package com.company.Concept_Problems.Maths;
import java.util.Scanner;


public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        float num1 = scan.nextFloat();
        System.out.print("Enter the 2nd number:");
        float num2 = scan.nextFloat();
        System.out.print("Enter the which Operation do you want to proceed among (+,-,*,/):");
        String operation = scan.next();

        switch (operation){
            case("+"):
                System.out.println("The addition of given numbers will be :" + String.format("%.2f",num1+num2));
                break;
            case("-"):
                if(num1<num2){
                    System.out.print("The substarction of two numbers will be:"+(num2-num1));
                }
                else {
                    System.out.print("The substraction of two numbers will be"+(num1-num2));
                }
                break;
            case("*"):
                System.out.print("The multiplication of two numbers will be:"+ num1*num2);
                break;
            case("/"):
                System.out.print("The division of two numbers will be:"+ num1/num2);
                break;



        }

    }
}
