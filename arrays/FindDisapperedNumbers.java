class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] x = new int[nums.length];
        for(int y: nums){
            x[y-1] = 1;
        }
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(x[i]==0){
                l.add(i+1);
            }
        }
        return l;
    }
}
