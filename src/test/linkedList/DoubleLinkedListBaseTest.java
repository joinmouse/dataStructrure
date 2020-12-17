package test.linkedList;

import linkedList.DoubleLinkedList;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class DoubleLinkedListBaseTest {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        int[] array = {6, 20, 1, 12, 9, 19, 14, 2, 18, 5, 11, 3, 13, 4, 15, 7, 8, 16, 17, 10};
        for(int i = 0; i < array.length; i++) {
            doubleLinkedList.add(array[i]);
        }
        doubleLinkedList.display();

        System.out.println("头部节点前面插入21");
        doubleLinkedList.addHead(21);
        doubleLinkedList.display();

        System.out.println("在尾结点后面插入22");
        doubleLinkedList.add(22);
        doubleLinkedList.display();

        System.out.println("在第三个位置后面插入23");
        doubleLinkedList.insert(23, 3);
        doubleLinkedList.display();

        System.out.println("在倒数第三个位置前面插入24");
        doubleLinkedList.insertReverse(24, 3);
        doubleLinkedList.display();

        System.out.println("删除第六个元素");
        doubleLinkedList.delete(6);
        doubleLinkedList.display();

        System.out.println("删除倒序第5个元素");
        doubleLinkedList.deleteReverse(5);
        doubleLinkedList.display();
    }
}