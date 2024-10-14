class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int t: nums) pq.add(t);

        long res = 0l;
        for(int i=0;i<k;i++){
            int temp = pq.poll();
            res = res + temp;
            temp = (int)Math.ceil(temp/(3*1.0));
            pq.add(temp);
        }
        return res;
    }
}
