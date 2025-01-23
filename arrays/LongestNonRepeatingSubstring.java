class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<Character>();
        int maxLen = 0;
        while(j<s.length()){
            char c = s.charAt(j);
            if(set.contains(c)){

                while(s.charAt(i)!=c){
                    set.remove(s.charAt(i++));
                }
                //System.out.println(i++);
                i++;
            }
            else{
                set.add(c);
            }
            maxLen = maxLen>set.size() ? maxLen:set.size();
            j++;
        }
        return maxLen;
    }
}
