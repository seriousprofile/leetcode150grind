class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; //declare initial profit count to be 0 to add to it as we traverse.
        for (int i = 1; i < prices.length; i++){ //i = 1 to compare the 0th index ele to first index ele
            if (prices[i] > prices[i - 1]){ //if current index ele is greater, it means that the profit can be calculated
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
