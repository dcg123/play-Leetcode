public class Solution122 {


    /**
     * 多次购买/卖出股票  求最大利润
     *
     * Input: [7,1,5,3,6,4]
     * Output: 7
     * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
     *              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     * @param args
     */
    public static void main(String[] args) {

    }


    public int maxProfit(int[] prices) {
        if (prices.length==0){
            return 0;
        }

        int sum=0;

        for (int i=0;i<prices.length-1;i++){
            if (prices[i+1]>prices[i]){
                sum+=prices[i+1]-prices[i];
            }
        }
        return sum;
    }
}
