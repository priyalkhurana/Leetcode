class Solution {
    public int maxProfit(int[] prices) {
        int minprice= prices[0];
        int sum=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }else if(prices[i] - minprice>sum){
                sum=prices[i]-minprice;
            }
        }
        return sum;   
    }
}
