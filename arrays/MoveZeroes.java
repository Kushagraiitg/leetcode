class Solution {
    public void moveZeroes(int[] nums) {
        int i;
        int j;
        for(i=0,j=1; j<nums.length;){
            if(nums[i]==0){
                if(nums[j]!=0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
                if(i==j){
                    j++;
                }
            }
        }
    }
}
