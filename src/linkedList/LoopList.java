package linkedList;

public class LoopList {
    private Node head = null;  // 链表开始的点
    private Node last = null;  // 指向链表中最后的一个元素last
    /*
     * 尾部添加节点 O(n)
    * */
    public Node addNode(int data) {
        Node newNode = new Node(data);
        // 处理链表为空的情况
        if(head == null) {
            head = newNode;
            newNode.next = head;
            last = head;
            return head;
        }
        Node currentNode = head;
        // 遍历到最后一个节点, 最后一个节点的下一个会指向第一个元素
        while (currentNode.next != head) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.next = head;
        // last指向最后一个
        last = currentNode.next;
        return head;
    }

    /*
    * 删除头部节点
    * */
    public Node deleteHead() {
        if(head.next == head) {
            head = null;
            return head;
        }
        Node currentNode = head;
        while (currentNode.next != head) {
            currentNode = currentNode.next;
        }
        currentNode.next = head.next;
        head = head.next;
        return head;
    }

    /*
    * 删除第13个节点的位置
    * */
    public Node deleteIndex(int index) {
        if(head.next == head) {
            head = null;
            return head;
        }
        Node currentNode = head;
        while (index > 2) {
            index--;
            currentNode = currentNode.next;
        }
        // 判断第13个节点是否为头结点
        if(currentNode.next == head) {
            deleteHead();
        }
        currentNode.next = currentNode.next.next.next;
        return currentNode;
    }

    /*
    * 约瑟夫问题
    * */
    public Node yueSiFu() {
        if(head.next == head) {
            return head;
        }
        Node currentNode = head;
        while (currentNode.next != currentNode) {
            currentNode = currentNode.next;
            // currentNode = currentNode.next.next;
            System.out.println("remove: " + currentNode.data);
        }
        System.out.println(currentNode.data);
        // head = currentNode;
        return currentNode;
    }

    /*
     *  打印节点 displayNode
    */
    public void displayNode(LoopList node) {
        if(node == null) {
            System.out.println("当前链表是空链表");
            return;
        }
        System.out.println("当前链表的节点依次是: ");
        Node currentNode = head;
        while (currentNode.next != head) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.data + "\n\n");
        System.out.println("last指针指向: " + last.data);
        System.out.println("list指针的下一个指向: " + last.next.data + "\n");
    }
}