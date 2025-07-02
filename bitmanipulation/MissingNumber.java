class Solution {
    public int missingNumber(int[] nums) {
        int c=0;
        for(int x=0;x<nums.length+1;x++){
            c=c^x;
        }
        for(int x:nums){
            c=c^x;
        }
        return c;
    }
}
