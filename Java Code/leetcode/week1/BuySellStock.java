package com.leetcode.problems.april.week1;

public class BuySellStock {

	public static void main(String[] args) {
		//int[] arr = new int[] { 7, 1, 5, 3, 6, 4 };
		// int[] arr = new int[] { 1, 2, 3, 4, 5 };
		// int[] arr = new int[] { 7, 6, 4, 3, 1 };
		int[] arr = new int[] { 10, 7, 5, 8, 11, 9 };
		System.out.println(maxProfit(arr));
	}

	public static int maxProfit(int[] prices) {
		return computeProfit(prices, 0);
	}

	private static int computeProfit(int[] prices, int num) {
		int len = prices.length;
		int maxProfit = 0;
		int max = 0;
		if (num >= prices.length) {
			return 0;
		}
		for (int i = num; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (prices[i] < prices[j]) {
					int tempProfit = computeProfit(prices, j + 1) + prices[j] - prices[i];
					System.out.println("Temp Profit : " + tempProfit);
					if (tempProfit > maxProfit) {
						maxProfit = tempProfit;
					}
				}
			}
			if (maxProfit > max) {
				max = maxProfit;
			}
		}
		return max;
	}
	
	  public static int getMaxProfit(int[] stockPrices) {
		    if (stockPrices.length < 2) {
		        throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
		    }
		    // we'll greedily update minPrice and maxProfit, so we initialize
		    // them to the first price and the first possible profit
		    int minPrice = stockPrices[0];
		    int maxProfit = stockPrices[1] - stockPrices[0];
		    // start at the second (index 1) time
		    // we can't sell at the first time, since we must buy first,
		    // and we can't buy and sell at the same time!
		    // if we started at index 0, we'd try to buy *and* sell at time 0.
		    // this would give a profit of 0, which is a problem if our
		    // maxProfit is supposed to be *negative*--we'd return 0.
		    for (int i = 1; i < stockPrices.length; i++) {
		        int currentPrice = stockPrices[i];
		        // see what our profit would be if we bought at the
		        // min price and sold at the current price
		        int potentialProfit = currentPrice - minPrice;
		        // update maxProfit if we can do better
		        maxProfit = Math.max(maxProfit, potentialProfit);
		        // update minPrice so it's always
		        // the lowest price we've seen so far
		        minPrice = Math.min(minPrice, currentPrice);
		    }
		    return maxProfit;
		}

}
