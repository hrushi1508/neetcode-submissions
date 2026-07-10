class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j =0;
        int max = 0;
        int n = prices.length;
        while(j<n){
            if(prices[i]<=prices[j]){
                max = Math.max(max,prices[j]-prices[i]);
            }else{
                i = j;
            }
            j++;
        }
        return max;
    }
}
