class Solution {
    public int minAddToMakeValid(String s) {
        int diff=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(c<0){
                    diff=diff+Math.abs(c);
                    c=1;
                }
                else{
                    c++;
                }
            }
            else{
                c--;
            }
        }
        return Math.abs(c)+diff;
    }
}
