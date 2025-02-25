package com.company.LeetCode_Problems.Array;
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
// future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class Best_Time_To_Buy_and_Sell_Stocks {
    public static int maxProfit(int[] prices) {
        // the maximum profit will be the maximum difference between the share price on that day
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
            max_profit = Math.max(max_profit, prices[i] - min_price);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int profit = maxProfit(arr);
        System.out.println("The maximum profit is: " + profit);
    }
}
