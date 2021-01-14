package stack_queue;

import java.util.*;

public class EvaluateReversePolishNotation {
    public List<String> infixToPostfix(String str) throws EmptyStackException {
        // 定义一个栈, 保存操作符
        Stack<String> stack = new Stack<>();
        // 定义一个hashMap, 存储操作符
        HashMap<String, Integer> map = new HashMap<>();
        map.put("*", 5);
        map.put("/", 5);
        map.put("+", 1);
        map.put("-", 1);
        // 定义一个token数组返回元素
        List<String> token = new ArrayList<>();
        String[] strArr = str.split("\\s+");
        String top;  //栈顶元素
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].equals("(")) { // cur元素为(
                stack.push(strArr[i]);
            } else if(strArr[i].equals(")")) {
                // 弹出栈中的操作符到token中
                top = stack.peek();
                while (!stack.isEmpty() && !top.equals("(")) {
                    String op = stack.pop();
                    token.add(op);
                    if(!stack.isEmpty()) top = stack.peek();
                }
                // 弹出“(”元素
                if(!stack.isEmpty()) stack.pop();
            } else if(map.containsKey(strArr[i])) { // cur元素为操作符的时候
                if(!stack.isEmpty()) {
                    top = stack.peek();
                    // 栈顶元素也是操作符切优先级高于cur元素的情况下
                    while (!stack.isEmpty() && map.containsKey(top) && map.get(top) >= map.get(strArr[i])) {
                        String el = stack.pop();
                        token.add(el);
                        if(!stack.isEmpty()) top = stack.peek();
                    }
                }
                stack.push(strArr[i]);
            } else {  // cur元素为数字
                token.add(strArr[i]);
            }
        }

        while (!stack.isEmpty()) {
            top = stack.pop();
            token.add(top);
        }
        return token;
    }



    public int evalRPN(List<String> tokens) {
        Stack<Integer> stack = new Stack<>();
        int top1;
        int top2;
        for(String token : tokens) {
            switch (token) {
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
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop();
    };
}
