class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; //it will increase as we traverse thru array and encounter higher profits if they exist.
        int buy = prices[0]; //set the first element as the initial 'buy'
        for (int i = 1; i < prices.length; i++){ 
            if (prices[i] < buy){ //if the next ele is smaller than initial buy ele,
                buy = prices[i]; //replace the initial buy ele with the smaller ele.
            }
             else if (prices[i] - buy > profit){ //if the profit is greater than initially set profit, replace it with the new profit. 
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
