//https://leetcode.com/problems/minimum-string-length-after-removing-substrings/?envType=daily-question&envId=2024-10-07
class Solution {
    public int minLength(String s) {
        List<Character> arr = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(arr.size()>0){
                if((arr.get(arr.size()-1)=='A' && c=='B')||(arr.get(arr.size()-1)=='C' && c=='D')){
                    arr.remove(arr.size()-1);
                }
                else{
                    arr.add(c);
                }
            }
            else{
                arr.add(c);
            }
        }
        return arr.size();
    }
}
