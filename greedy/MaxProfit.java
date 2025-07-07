class Solution {
    public int maxProfit(int[] prices) {
        int t=0;
        int c=prices[0];
        for(int x:prices){
            if(x-c>t){
                t = x-c;
            }
            else if(x<c){
                c=x;
            }
        }
        return t;
    }
}
