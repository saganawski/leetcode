package com.leetcode.leetcode;

public class BuySellStock {
    public static void main(String[] args) {
//        final int[] prices = {7, 1, 5, 3, 6, 4};
//        final int[] prices = {7, 6, 4, 3, 1}; result should be 0
//        final int[] prices = {2, 4, 1}; //result should be 2
//        final int[] prices = {3,2,6,5,0,3}; //result should be 4
        final int[] prices = {4,7,2,1}; //result should be 3
        final int result = maxProfit(prices);
        System.out.println("Result: " + result);

        System.out.println(result == 3? "Test Passed" : "Test Failed");
    }

    private static int maxProfit(int[] prices) {
        // create two variables to store the minimum price and the maximum price
        int minPrice = prices[0];
        int minPriceIndex = 0;
        int maxPrice = 0;
        int maxProfit = 0;
        // need to track max profit


        for (int i = 0; i < prices.length; i++) {
            final int currentPrice = prices[i];
            //set the minimum price if the current price is less than the minimum price
//            minPrice = Math.min(minPrice, currentPrice);
            if(currentPrice < minPrice && i > minPriceIndex && i < prices.length -1){
                minPrice = currentPrice;
                minPriceIndex = i;
                maxPrice = 0;
            }
            if(currentPrice > minPrice && currentPrice > maxPrice){
                maxPrice = currentPrice;
                int currentProfit = maxPrice - minPrice;
                if(currentProfit > maxProfit){
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }
}
