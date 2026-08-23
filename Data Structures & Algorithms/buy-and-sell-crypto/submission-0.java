class Solution {
    public int maxProfit(int[] prices) {
        int minval = prices[0];
        int maxPrf = 0;
        for(int i = 1; i < prices.length; i++)
        {
            minval = Math.min(minval, prices[i]);
            maxPrf = Math.max(maxPrf, prices[i] - minval);
        }
        return maxPrf;
    }
}