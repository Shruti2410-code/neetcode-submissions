class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i = 0, j = 0, profit = 0;
        while( j < n ) {
            profit = Math.max(profit, prices[j]-prices[i]);
           
            if(prices[j] < prices[i]) {
                i = j;
            }
            j++;

        }
        return profit;
    }
}
