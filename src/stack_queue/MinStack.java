package stack_queue;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> stackHelp;   //辅助栈
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        stackHelp = new Stack<Integer>();
    }
    // push进入元素
    public void push(int x) {
        stack.push(x);
        if(stackHelp.empty() || stackHelp.peek() >= x) {
            stackHelp.push(x);
        }
    }
    // pop出元素
    public void pop() {
        if(stack.peek().equals(stackHelp.peek())) {
            stackHelp.pop();
        }
        stack.pop();
    }
    // 查看栈顶元素top
    public int top() {
        return stack.peek();
    }
    // 获取最小元素
    public int getMin() {
        return stackHelp.peek();
    }
}
