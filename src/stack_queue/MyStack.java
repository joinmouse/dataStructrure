package stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 用队列实现栈: https://leetcode-cn.com/problems/implement-stack-using-queues/
// push(x) -- 元素 x 入栈
// pop() -- 移除栈顶元素
// top() -- 获取栈顶元素
// empty() -- 返回栈是否为空
public class MyStack {
    private Queue<Integer> queue;
    private Queue<Integer> queueCopy;  //辅助队列，用来做备份用的temp
    public MyStack() {
        queue = new LinkedList<Integer>();
        queueCopy = new LinkedList<Integer>();
    }

    /** Push element x onto stack **/
    public void push(int x) {
        queueCopy.add(x);  //添加的元素先放入copy队列中
        while (!queue.isEmpty()) {  // 依次将queue队列值清空，元素放到queueCopy中
            queueCopy.add(queue.remove());
        }
        // queue同queueCopy 交换
        Queue<Integer> temp = queue;
        queue = queueCopy;
        queueCopy = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.remove();
    }

    // 查询头部元素
    public int top() {
        return queue.peek();
    };

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}