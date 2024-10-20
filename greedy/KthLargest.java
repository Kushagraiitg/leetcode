class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Approach 1
        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        // for(int n: nums){
        //     pq.add(n);
        //     while(pq.size()>k){
        //         pq.poll();
        //     }
        // }
        // return pq.peek();

        // Approach 2- Using quick select algorithm
        // partition with random pivot; 
        // check if index after partition equals k and then reduce the size
        return findKth(0, nums.length-1, nums, nums.length-k);
    }

    private int findKth(int start, int end, int[] nums, int k) {
        if (start > end) {
            return -1; // This condition should typically not be reached
        }

        int pivotIndex = partition(start, end, nums);
        
        // Check if the pivot index is the k-th index
        if (pivotIndex == k) {
            return nums[pivotIndex];
        } else if (pivotIndex < k) {
            return findKth(pivotIndex + 1, end, nums, k); // Search right
        } else {
            return findKth(start, pivotIndex - 1, nums, k); // Search left
        }
    }

    private int partition(int start, int end, int[] nums) {
        int pivotValue = nums[start];
        int low = start + 1;
        int high = end;

        while (low <= high) {
            if (nums[low] > pivotValue && nums[high] < pivotValue) {
                // Swap nums[low] and nums[high]
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
            }
            if (nums[low] <= pivotValue) low++;
            if (nums[high] >= pivotValue) high--;
        }
        
        // Swap pivot with high
        int temp = nums[start];
        nums[start] = nums[high];
        nums[high] = temp;
        
        return high; // Return the pivot index
    }
}
