class Solution {
    public int findPeakElement(int[] nums) {
        return peak(0, nums.length-1);
    }
    
    private int peak(int start, int end){
    	if(start>end){
    		return -1;
    	}
    	int mid= start+(end-start)/2;
    	int earlier = mid>0? nums[mid-1]:Integer.MIN_VALUE;
    	int later = mid<nums.length? nums[mid+1]:Integer.MIN_VALUE;
    	
    	if(mid>earlier && mid>later){
    		return mid;
    	}
    	else{
    		int t1 = nums[mid]>earlier?peak(start, mid-1):peak(start, mid);
    		int t2 = nums[mid]>later?peak(mid+1, end):peak(mid, end);
    		return t1!=-1?t1:t2;
    	}
    	
    }
}
