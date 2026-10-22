class Solution {
    public int maxProfit(int[] prices) {
        int historyMinPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i] < historyMinPrice){
                historyMinPrice = prices[i];
            }else if(prices[i] - historyMinPrice > maxProfit){
                maxProfit = prices[i] - historyMinPrice;
            }
        }
        return maxProfit;
    }
}
