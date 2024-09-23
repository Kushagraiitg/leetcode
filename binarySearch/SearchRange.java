class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findFirst(nums, 0, nums.length-1, target);
        int end = findLast(nums, 0, nums.length-1, target);
        int[] res = new int[2];
        res[0] = start;
        res[1] = end;
        return res;
        
    }

    int findFirst(int[] nums, int start, int end, int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(nums[mid]==target){
            int res = findFirst(nums, start, mid-1, target);
            if(res!=-1){
                return res;
            }
            return mid;
        }
        else if(nums[mid]>target){
            return findFirst(nums, start, mid-1, target);
        }
        else{
            return findFirst(nums, mid+1, end, target);
        }
    }

    int findLast(int[] nums, int start, int end, int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(nums[mid]==target){
            int res = findLast(nums, mid+1, end, target);
            if(res!=-1){
                return res;
            }
            return mid;
        }
        else if(nums[mid]>target){
            return findLast(nums, start, mid-1, target);
        }
        else{
            return findLast(nums, mid+1, end, target);
        }
    }
}
