package com.company.Concept_Problems.Maths;

// We are actually counting the number of notes particular value contains
// The current Indian denominations are 2000, 500, 200, 100, 50, 20, 10, 2, 1

public class Count_Notes {

    public static void main(String[] args) {

        int amount = 25519;

        int count2000=0, count500=0, count200=0, count100=0, count50=0, count20=0, count10=0, count2=0, count1=0;
        int denominationCount = 9;

        for(int i=0; i<denominationCount; i++)
        {
            if(amount >= 2000)
            {
                count2000 = amount/2000;
                amount -= (count2000 * 2000);
            }
            else if(amount >= 500)
            {
                count500 = amount/500;
                amount -= (count500 * 500);
            }
            else if(amount >= 200)
            {
                count200 = amount/200;
                amount -= (count200 * 200);
            }
            else if(amount >= 100)
            {
                count100 = amount/100;
                amount -= (count100 * 100);
            }
            else if(amount >= 50)
            {
                count50 = amount/50;
                amount -= (count50 * 50);
            }
            else if(amount >= 20)
            {
                count20 = amount/20;
                amount -= (count20 * 20);
            }
            else if(amount >= 10)
            {
                count10 = amount/10;
                amount -= (count10 * 10);
            }
            else if(amount >= 2)
            {
                count2 = amount/2;
                amount -= (count2 * 2);
            }
            else {
                count1 = amount;
            }

        }
        System.out.println("2000: " + count2000);
        System.out.println("500: " + count500);
        System.out.println("200: " + count200);
        System.out.println("100: " + count100);
        System.out.println("50: " + count50);
        System.out.println("20: " + count20);
        System.out.println("10: " + count10);
        System.out.println("2: " + count2);
        System.out.println("1: " + count1);
    }
}
