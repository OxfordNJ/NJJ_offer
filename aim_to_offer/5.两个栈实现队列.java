import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    int head = 0;
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
               
            }
                head = stack2.pop();
        }
        else
              head = stack2.pop();
        return head;
    }
    
}