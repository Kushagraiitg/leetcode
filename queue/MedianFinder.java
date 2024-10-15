class MedianFinder {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<Integer>((a,b)->b-a);
        minHeap = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        
        if(maxHeap.size()>minHeap.size()){
            if(maxHeap.peek()!=null && num<maxHeap.peek()){
                minHeap.offer(maxHeap.poll());
                maxHeap.offer(num);
            }
            else{
                minHeap.offer(num);
            }
        }
        else{
            if(minHeap.peek()!=null && num>minHeap.peek()){
                maxHeap.offer(minHeap.poll());
                minHeap.offer(num);
            }
            else{
                maxHeap.offer(num);
            }
        }

    }
    
    public double findMedian() {
        if(maxHeap.size()>minHeap.size()){
            System.out.println(maxHeap.peek());
            return maxHeap.peek()*1.0;
        }
        else{
            System.out.println(maxHeap.peek()+"----"+minHeap.peek());
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
