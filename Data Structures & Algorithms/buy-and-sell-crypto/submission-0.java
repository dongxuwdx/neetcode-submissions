class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int ans = 0;
        for(int i = 0;i<len;i++){
            for(int j = i+1;j<len;j++){
                ans = Math.max(ans, prices[j] - prices[i]);
            }
        }
        return ans;
    }
}
