class Solution {
    public int maxSubArray(int[] nums) {
        int start = 0; 
        int end = 0;
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;
        while(start<=end && end<nums.length){
            int t = tempSum + nums[end];
            if(t>maxSum){
                maxSum = t;
            }
            if(t<1){
                end = end+1;
                start = end;
                tempSum = 0;
            }
            else{
                end++;
                tempSum =t;
            }
            
        }
        return maxSum;
    }
}
