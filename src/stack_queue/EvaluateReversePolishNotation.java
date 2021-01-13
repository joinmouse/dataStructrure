package stack_queue;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int top1;
        int top2;
        for(int i=0; i<tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    top1 = stack.pop();
                    top2 = stack.pop();
                    stack.push(top1 + top2);
                    break;
                case "-":
                    top1 = stack.pop();
                    top2 = stack.pop();
                    stack.push(top2 - top1);
                    break;
                case "*":
                    top1 = stack.pop();
                    top2 = stack.pop();
                    stack.push(top1 * top2);
                    break;
                case "/":
                    top1 = stack.pop();
                    top2 = stack.pop();
                    stack.push(top2 / top1);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        return stack.pop();
    };
}
