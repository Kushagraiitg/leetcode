class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;
        Stack<String> st = new Stack<String>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int t1 = Integer.parseInt(st.pop());
                int t2 = Integer.parseInt(st.pop());
                st.push((t1+t2)+"");
            }
            else if(tokens[i].equals("-")){
                int t1 = Integer.parseInt(st.pop());
                int t2 = Integer.parseInt(st.pop());
                st.push((t2-t1)+"");
            }
            else if(tokens[i].equals("*")){
                int t1 = Integer.parseInt(st.pop());
                int t2 = Integer.parseInt(st.pop());
                st.push((t1*t2)+"");
            }
            else if(tokens[i].equals("/")){
                int t1 = Integer.parseInt(st.pop());
                int t2 = Integer.parseInt(st.pop());
                st.push((t2/t1)+"");
            }
            else{
                st.push(tokens[i]);
            }
        }
        if(st.isEmpty()){
            return -1;
        }
        return Integer.parseInt(st.pop());
    }
}
