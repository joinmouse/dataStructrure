package test;

import linkedList.DoubleLinkedList;

// 合并链表测试
public class DoubleLinkedListMergeTest {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList1 = new DoubleLinkedList();
        int[] array1 = {5, 9, 7, 2, 8, 3, 1, 6, 4};
        for(int i = 0; i < array1.length; i++) {
            doubleLinkedList1.add(array1[i]);
        }
        doubleLinkedList1.display();

        DoubleLinkedList doubleLinkedList2 = new DoubleLinkedList();
        int[] array2 = {11, 13, 18, 15, 12, 16, 19, 17, 14};
        for(int i = 0; i < array2.length; i++) {
            doubleLinkedList2.add(array2[i]);
        }
        doubleLinkedList2.display();

        // doubleLinkedList1
        System.out.println("合并链表: 在链表1的第4个位置之后插入链表2");
        doubleLinkedList1.merge(4, doubleLinkedList2);
        doubleLinkedList1.display();
    }
}
