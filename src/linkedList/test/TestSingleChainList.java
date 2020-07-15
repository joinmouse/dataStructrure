package linkedList.test;

import linkedList.SingleChainList;

import java.lang.reflect.Array;

public class TestSingleChainList {
    public static void main(String[] args) {
        int[] arr = {2, 7, 8, 5, 3, 6, 4, 9, 1};
        SingleChainList list = new SingleChainList();
        // 1、将数组转为位链表
        for (int i = 0; i < arr.length; i++) {
            list.addNode(arr[i]);
        }
        list.display();
        // 头节点位置插入10
        list.addHeadNode(10);
        list.display();
        // 尾节点插入11
        list.addNode(11);
        list.display();
        // 第三个元素后插入12
        list.insertNode(12, 3);
        list.display();
        // 删除第6个元素
        list.removeNode(6);
        list.display();
    }
}
