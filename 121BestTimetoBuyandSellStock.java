class Solution {
    public int maxProfit(int[] prices) {
        return calculateMaxProfit(prices);
    }

    public static int calculateMaxProfit(int[] arr) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;
            }
            int currentProfit = price - minPrice;
            if (currentProfit > profit) {
                profit = currentProfit;
            }
        }

        if (profit > 0) {
            return profit;
        } else {
            return 0;
        }
    }
}
