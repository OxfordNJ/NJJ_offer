import java.util.Stack;

public class Solution {
    Stack<Integer> dataStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    
    public void push(int node) {
        dataStack.push(node);
    	if(minStack.isEmpty()||node<=minStack.peek())
    		minStack.push(node);
    }
    
    public void pop() {
        if(dataStack.isEmpty())
    		throw new RuntimeException("Your stack is empty");
    	int value = dataStack.pop();
    	if(value==minStack.peek())
    		minStack.pop();
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int min() {
        if(minStack.isEmpty())
    		throw new RuntimeException("Your stack is empty");
    	return minStack.peek();
    }
}