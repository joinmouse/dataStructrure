package stack_queue;

import java.util.Stack;

// 1、使用栈来实现队列：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
// push(x) -- 将一个元素放入队列的尾部。
// pop() -- 从队列首部移除元素。
// peek() -- 返回队列首部的元素。
// empty() -- 返回队列是否为空。
public class MyQueue {
    // 定义一个输入栈、一个输出栈
    private Stack<Integer> stack_in;
    private Stack<Integer> stack_out;

    public MyQueue() {
        stack_in = new Stack<Integer>();
        stack_out = new Stack<Integer>();
    }

    // push元素到进入栈
    public boolean push(int x) {
        stack_in.push(x);
        return true;
    }

    // pop元素
    public int pop() {
        // 当stack_out为空的时候，将stack_in导入数据
        if(stack_out.empty()) {
            if(stack_in.empty()) return -1;
            while (!stack_in.empty()) {
                stack_out.push(stack_in.peek());
                stack_in.pop();
            }
        }
        int result = stack_out.peek();
        stack_out.pop();
        return result;
    }

    // peek元素, 使用pop函数后将其再push进去
    public int peek() {
        int result = this.pop();
        stack_out.push(result);
        return result;
    }

    // 队列是否为空
    public boolean empty() {
        return stack_in.empty() && stack_out.empty();
    }
}