class Node {
    int value;
    Node prev;
    int min;
    Node(int val) {
        value = val;
    }
}

public class MinStack {
    Node current;
    int min;
    
    /** initialize your data structure here. */
    public MinStack() {
        current = null;
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        Node next = new Node(x);
        next.min = min;
        next.prev = current;
        current = next;
        
        if(x <= min) {
            min = x;
        }
    }
    
    public void pop() {
        if(current.value == min) {
            min = current.min;
        }
        current = current.prev;
    }
    
    public int top() {
        return current.value;
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */