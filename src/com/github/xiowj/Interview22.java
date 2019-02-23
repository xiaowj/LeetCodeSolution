package com.github.xiowj;

public class Interview22 {
    public int maxProfit(int[] prices) {
        int count = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                count += prices[i + 1] - prices[i];
            }
        }
        return count;
    }
}
