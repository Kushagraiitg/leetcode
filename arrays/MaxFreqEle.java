class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] tab = new int[100];
        for(int i=0;i<nums.length;i++){
            tab[nums[i]-1]++;
        }

        int maxFreq = 0;
        int countMaxFreq = 0;
        for(int i=0;i<100;i++){
            if(tab[i]>maxFreq){
                maxFreq = tab[i];
                countMaxFreq = tab[i];
            }
            else if(tab[i]==maxFreq){
                countMaxFreq+= tab[i];
            }
        }
        return countMaxFreq;
    }
}
