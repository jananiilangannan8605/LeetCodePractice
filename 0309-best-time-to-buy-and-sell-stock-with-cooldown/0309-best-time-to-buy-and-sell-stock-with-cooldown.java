class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        if(prices.length==1) return 0;
        int n=prices.length;
        int buy=-prices[0];
        int sell=0;
        int rest=0;
        for(int i=1;i<prices.length;i++){
            int prev=buy;
            int prevsell=sell;
            buy=Math.max(buy, rest-prices[i]);
            sell=prev+prices[i];
            rest=Math.max(rest, prevsell);
        }
        return Math.max(rest,sell);
    }
}