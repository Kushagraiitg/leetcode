class Solution {
    /**
    *    create stack to store ele
    *    if next is greater -> pop till no smaller and update for smaller      
    *    if smaller, push and wait to update
    *    
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] arr = new int[10001];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<nums2.length;i++){
            if(i==0){
                st.push(nums2[i]);
            }
            else{
                int next = nums2[i];
                while(!st.isEmpty() && st.peek()<next){
                    int temp = st.pop();

                    arr[temp] = next;
                }
                st.push(next);
            }
        }
        while(!st.isEmpty()){
            arr[st.pop()] = -1;
        }

        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=arr[nums1[i]];
        }

        return res;
        
    }
}





/**
*       4 1 2                       1  3  4  2  5 
*                                   3  4  5  5 -1
*                                   1  3  4  4  5                 
* */
