public class Solution123 {

    /**
     * 找出数组中最大的两个间隔和 间隔的第一个结束数据可以和第二个开始时间结合
     * 并且间隔后面的数必须大于前面的数
     *
     * Input: [3,3,5,0,0,3,1,4]
     * Output: 6
     * Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
     *              Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Solution123().maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }


    public int maxProfit(int[] prices) {
        if (prices.length==0){
            return 0;
        }

        int result=Integer.MIN_VALUE;

        for (int i=0;i<prices.length-1;i++){

            int flag=i;

            while (prices[flag]<=prices[i]){
                flag++;
            }


            int frist=prices[flag]-prices[i];

            i=flag;

            for (int j=i+1;j<prices.length;j++){
                if (prices[j]>prices[i]){
                    if (result<frist+prices[j]-prices[i]){
                        result=frist+prices[j]-prices[i];
                    }
                }
            }
        }
        return result;
    }
}
