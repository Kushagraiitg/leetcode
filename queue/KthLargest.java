class KthLargest {

    PriorityQueue<Integer> small;
    int size = -1;
    public KthLargest(int k, int[] nums) {
        small = new PriorityQueue<Integer>();
        size = k;
        for(int n:nums){
            small.add(n);
        }
        while(small.size()>k){
            int t = small.poll();
        }
    }
    
    public int add(int val) {

        if(small.size()<size){
            small.add(val);
        }
        else if(small.size()>0 && val>small.peek()){
            int t = small.poll();
            small.add(val);
        }
        return small.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
