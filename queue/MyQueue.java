class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<Integer>();
        st2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        while(!st2.empty()){
            int t = st2.pop();
            st1.push(t);
        }
        st2.push(x);
        while(!st1.empty()){
            int t = st1.pop();
            st2.push(t);
        }
    }
    
    public int pop() {
        return st2.pop();
    }
    
    public int peek() {
        return st2.peek();
    }
    
    public boolean empty() {
        return st2.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 * 
 *  Use 2 stacks
 * push(an)->
 * pop()-> a1 - 
 * peek() -> a1 - top of stack
 * empty() -> size
 */
