package test.stack_queue;

import java.util.Stack;
import stack_queue.StackReverse;

public class StackReverseTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        StackReverse stackReverse = new StackReverse();
        stackReverse.reverse(stack);
        System.out.println(stack);
    }
}