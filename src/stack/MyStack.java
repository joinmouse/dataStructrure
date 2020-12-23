package stack;

import java.util.EmptyStackException;

// Java类库: Stack<String> stack = new Stack<>()
// 1、在数组的基础上实现
// 2、属性: element, size, capacity
// 3、构造器实现，，定义方法 push pop peek isEmpty
public class MyStack<T> {
    // 定义私有变量
    private int size;
    private int capacity;
    private T[] elementData;  //数组T
    // 构造器
    public MyStack(int capacity) {
        this.size = 0;
        this.capacity = capacity;
    }
    // push元素入栈
    public T push(T element) {
        elementData[this.size+1] = element;
        return element;
    }
    // pop元素出栈
    public T pop() {
        if(this.size == 0) throw new EmptyStackException();
        T element = elementData[this.size-1];
        return element;
    }
    // 判断栈是否为空
    public boolean isEmpty() {
        return this.size == 0;
    }
}