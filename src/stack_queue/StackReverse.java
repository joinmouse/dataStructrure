package stack_queue;

import java.util.Stack;
// 参考：https://blog.csdn.net/weixin_43258870/article/details/91069695
public class StackReverse {
    // Get and remove the tail element of a stack
    public int getAndRemoveTailElement(Stack<Integer> stack) {
        int result = stack.pop();   // 先pop出来
        // 递归结束条件
        if(stack.isEmpty()) {
            return result;
        }
        int tail = getAndRemoveTailElement(stack);  //返回栈底元素
        stack.push(result);  //递归结束条件触发后，将弹出的非栈底元素入栈，保持栈原始结构
        return tail;
    }

    // Reverse a stack
    public void reverse(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int temp = getAndRemoveTailElement(stack);  // 去掉栈底的元素
        reverse(stack);  // 递归调用，触发上一步的操作
        stack.push(temp);  // 原始栈逆序入栈
    }
}