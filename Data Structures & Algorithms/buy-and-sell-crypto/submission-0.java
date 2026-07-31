class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int price=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<price){
                price=prices[i];
            }
            else{
                int current_profit=prices[i]-price;
                if(current_profit>max){
                    max=current_profit;
                }
            }
        }
        return max;
    }
}
