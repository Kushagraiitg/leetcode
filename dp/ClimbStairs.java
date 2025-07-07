class Solution {
    /**
    * 1 -> 1
    * 2 -> 2
    * 3 -> 
     */
     int[] x;

    private int find(int n){
        if(x[n]!=0){
            return x[n];
        }
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        x[n] = find(n-1)+find(n-2);
        return x[n];
    }
    public int climbStairs(int n) {
        x = new int[n+1];
        return find(n);
    }
}
