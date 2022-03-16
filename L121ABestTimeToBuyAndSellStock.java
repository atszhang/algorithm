public class L121ABestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPeak = Integer.MAX_VALUE / 2;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPeak);
            minPeak = Math.min(minPeak, prices[i]);
        }
        return maxProfit;
    }
}
