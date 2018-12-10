public class Solution121 {


    /**
     * 只能购买一次股票 并卖出 且卖出的股价要比买入的大 最大利润
     * Input: [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     *              Not 7-1 = 6, as selling price needs to be larger than buying
     * @param args
     */
    public static void main(String[] args) {

    }


    public int maxProfit(int[] prices) {
        if (prices.length==0){
            return 0;
        }

        int max=Integer.MIN_VALUE;
        for (int i=0;i<prices.length;i++){
            for (int j=i+1;j<prices.length;j++){
                if (prices[j]>prices[i]&&max<(prices[j]-prices[i])){
                    max=prices[j]-prices[i];
                }
            }
        }

        if (max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}
