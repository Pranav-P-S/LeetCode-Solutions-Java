// NONLeetCode Problem: StackSorting
// Solution by: @Pranav-P-S

public class StackSorter {
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            int num = stack.pop();
            
            // Move elements from tempStack back to stack
            // until we find the correct position for 'num'
            while (!tempStack.isEmpty() && tempStack.peek() < num) {
                stack.push(tempStack.pop());
            }
            
            tempStack.push(num);
        }
        
        return tempStack;
    }
}
