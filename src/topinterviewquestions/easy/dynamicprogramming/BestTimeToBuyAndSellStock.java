package topinterviewquestions.easy.dynamicprogramming;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for (int price : prices) {
            if (buy > price) {
                buy = price;
            } else {
                if (profit < price - buy) {
                    profit = price - buy;
                }
            }
        }
        return profit;
    }
}
