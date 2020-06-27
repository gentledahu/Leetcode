class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int cost = prices[0],res = 0;
        for(int i=1;i<prices.length;i++){
            cost = Math.min(cost,prices[i]);
            res = Math.max(res,prices[i]-cost);
        }
        return res;
    }
}