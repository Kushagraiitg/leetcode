class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        if(arr.length<k){
            return null;
        }
        int[] ans = new int[arr.length-k+1];
        PriorityQueue<Pair> heap = new PriorityQueue<>(
            (a, b) -> b.value - a.value);

        // Initialize the heap with the first k elements
        for (int i = 0; i < k; i++) {
            heap.offer(new Pair(arr[i], i));
        }

        // The maximum element in the first window
        ans[0] = (heap.peek().value);

        // Process the remaining elements
        for (int i = k; i < arr.length; i++) {
            heap.offer(new Pair(arr[i], i));

            // Remove elements that are outside the current
            // window
            while (heap.peek().index <= i - k) {
                heap.poll();
            }

            // The maximum element in the current window
            ans[i-k+1]=(heap.peek().value);
        }

        return ans;
    }

    static class Pair {
        int value;
        int index;

        public Pair(int value, int index)
        {
            this.value = value;
            this.index = index;
        }
    }
}





/**
*   nums = [1,3,-1,-3,5,3,6,7], k = 3
*   --first traverse all, add and retain the max
*   --on adding a new one, remove first and then keep popping until greater and store the greater
 */
