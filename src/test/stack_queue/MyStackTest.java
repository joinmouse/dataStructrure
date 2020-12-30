package test.stack_queue;

import stack_queue.MyStack;

import java.util.Arrays;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack s1 = new MyStack();
        s1.push(1);
        s1.push(2);
        System.out.println(s1.pop());
        s1.push(3);
        System.out.println(s1.top());
        System.out.println(s1.pop());
        System.out.println(s1.empty());
        System.out.println(s1.pop());
        System.out.println(s1.empty());
    }
}