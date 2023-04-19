package com.company.LeetCode_Problems;
// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
// On each day, you may decide to buy and/or sell the stock.
// You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on
// the same day.
//Find and return the maximum profit you can achieve.

public class Best_Time_To_Buy_and_Sell_Stocks {
    public static int maxProfit(int[] arr) {
        // variable to store the profit
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                profit += (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int profit = maxProfit(arr);
        System.out.println("The maximum profit is: " + profit);
    }
}
