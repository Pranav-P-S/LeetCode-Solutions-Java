// LeetCode Problem: ImplementStackUsingQueues 225
// Solution by: @Pranav-P-S

class MyStack {
    private Queue<Integer> queue;
    
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    // Push element x onto stack
    public void push(int x) {
        queue.offer(x);
        // Rotate the queue to make the new element at the front
        for (int i = 1; i < queue.size(); i++) {
            queue.offer(queue.poll());
        }
    }
    
    // Removes the element on top of the stack
    public int pop() {
        return queue.poll();
    }
    
    // Get the top element
    public int top() {
        return queue.peek();
    }
    
    // Return whether the stack is empty
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */ 

