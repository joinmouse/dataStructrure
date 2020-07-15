package linkedList;

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
    * 显示所有的节点
    * */
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
