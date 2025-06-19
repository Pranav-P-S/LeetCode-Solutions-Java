// LeetCode Problem: BestTimeToBuyAndSellStock 121
// Solution by: @Pranav-P-S

class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int sell=0;
        int profit=0;
        while (sell<prices.length){
            
            if(prices[sell]<prices[buy])
                buy=sell;
            else{
                int diff=prices[sell]-prices[buy];
                if (diff>profit)
                    profit=diff;
            }
            sell++;
        }
        return profit;
    }
}
