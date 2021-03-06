package linkedList;

import java.util.List;

public class SingleChainList {
    Node head = null;
    /*
    * 尾部添加节点 O(n)
    * */
    public void addNode(int data) {
        Node newNode = new Node(data);
        // 处理链表为空的情况
        if(head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        // 遍历到最后一个节点
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    /*
     * 头部添加节点 O(1)
     * */
    public void addHeadNode(int data) {
        Node newNode = new Node(data);
        // 处理链表为空的情况
        if(head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        // 将当前链表的下一个指向原链表
        newNode.next = currentNode;
        head = newNode;
    }

    /*
    *  依据index获取某个节点
    * */
    public Node getCurrentNode(int index) {
        // 先判空
        if(head == null || index < 1) return null;
        Node currentNode = head;
        while (index > 1) {
            index--;
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    /*
    *  依据index插入一个节点
    * */
    public void insertNode(int data, int index) {
        Node newNode = new Node(data);
        // 获取index序列对应的节点
        Node currentNode = this.getCurrentNode(index);
        // 新节点的下一个指向当前节点的下一个
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    /*
    *  依据index删除一个节点
    * */
    public void removeNode(int index) {
        Node currentPrevNode = this.getCurrentNode(index - 1);
        // 节点的上一个节点指向节点的下一个节点
        currentPrevNode.next = currentPrevNode.next.next;
    }

    /*
    *  反转链表, 使用2个指针pre temp;
    * */
    public Node reverseList(Node head) {
        Node pre = null;
        Node temp = null;
        Node currnet = head;
        while(currnet != null) {
            //记录当前节点的下一个节点
            temp = currnet.next;
            //然后将当前节点指向pre
            currnet.next = pre;
            //pre和cur节点都前进到一位
            pre = currnet;
            currnet = temp;
        }
        head = pre;
        return pre;
    }

    /*
    * 快慢指针, 求链表倒数的某个
    * */
    public Node formEnd(int index) {
        Node slow = null;
        Node fast = null;
        Node slowCurrent = head;
        Node fastCurrent = head;
        // 先让快指针跑5个
        while (index > 0) {
            fastCurrent = fastCurrent.next;
            index--;
        }
        // 快慢指针同时走
        while (fastCurrent != null) {
            fastCurrent = fastCurrent.next;
            slowCurrent = slowCurrent.next;
        }
        System.out.println(slowCurrent.data);
        return slowCurrent;
    }

    /*
     * 快慢指针, 求链表中间的数字
    */
    public Node middleNode() {
        Node slow = null;
        Node fast = null;
        Node slowCurrent = head;
        Node fastCurrent = head;
        while (fastCurrent.next != null && fastCurrent.next.next != null) {
            // 处理最后的边界情况
            slowCurrent = slowCurrent.next;
            fastCurrent = fastCurrent.next.next;
            // System.out.println(fastCurrent.data);
            // System.out.println(slowCurrent.data);
        }
        System.out.println(slowCurrent.data);
        return slowCurrent;
    }

    /*
    * 显示所有的节点
    */
    public void display() {
        if(head == null) {
            System.out.println("当前链表是空链表");
            return;
        }
        System.out.println("当前链表的节点依次是: ");
        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.data + "\n\n");
    }
}