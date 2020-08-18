package test;

import linkedList.SingleChainList;

public class SingleChainListTest {
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

        // 反转链表
        list.reversal();
        list.display();

        /*
         * 求链表倒数第 n 个结点（链表为常规单链表，没有记录长度）。
         * 示例：[6, 20, 1, 12, 9, 19, 14, 2, 18, 5, 11, 3, 13, 4, 15, 7, 8, 16, 17, 10]求倒数第5个结点
         */
        System.out.println("链表的倒数第5个: ");
        list.formEnd(5);

        /*
         * 求链表的中间结点（链表为常规单链表，没有记录长度）。
         * 示例：[6, 20, 1, 12, 9, 19, 14, 2, 18, 5, 11, 3, 13, 4, 15, 7, 8, 16, 17, 10]
         * */
        System.out.println("链表中间的数字: ");
        list.addNode(99);
        list.display();
        list.middleNode();
    }
}