public class MaxProfit1 {
    public int maxProfit(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }
        int minElement = prices[0];
        int maxDiff = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minElement) {
                minElement = prices[i];
                continue;
            }
            int currentDiff = prices[i] - minElement;
            if (currentDiff > maxDiff) {
                maxDiff = currentDiff;
            }
        }
        return maxDiff;
    }
}
