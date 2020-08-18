package linkedList;

public class DoubleLinkedList {
    DoubleNode head = null;

    // 添加节点
    public void add(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if(head == null) {
            head = newNode;
            return;
        }
        // System.out.println(newNode.data);
        DoubleNode currentNode = head;
        // 在最末尾处添加一个元素
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
    }

    // 添加头节点
    public void addHead(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if(head == null) {
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    // 查找位置
    public DoubleNode currentPosition(int index) {
        if(head == null) return null;
        DoubleNode currentNode = head;
        while (index > 1) {
            index--;
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    // 查找位置倒序
    public DoubleNode currentReversePosition(int index) {
        if(head == null) return null;
        DoubleNode currentNode = head;
        // 先遍历到最后
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        while (index > 0) {
            index--;
            currentNode = currentNode.prev;
        }
        return currentNode;
    }

    public int size() {
        if(head == null) return 0;
        DoubleNode currentNode = head;
        int size = 1;
        while (currentNode.next != null) {
            size = size + 1;
            currentNode = currentNode.next;
        }
        System.out.println("size大小为: " + size);
        return size;
    }

    public void insert(int data, int index) {
        if(index == 1) this.addHead(data);
        DoubleNode newNode = new DoubleNode(data);
        DoubleNode currentNode = currentPosition(index);
        // 下一个指向currentNode的下一个
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        newNode.prev = currentNode;
    }

    public void insertReverse(int data, int index) {
        DoubleNode newNode = new DoubleNode(data);
        DoubleNode currentNode = currentReversePosition(index);
        // 下一个指向currentNode的下一个
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        newNode.prev = currentNode;
    }

    // 删除: 顺序
    public void delete(int index) {
        DoubleNode currentPreNode = currentPosition(index-1);
        // 下一个指向currentNode的下一个
        DoubleNode nextNode = currentPreNode.next.next;
        currentPreNode.next = nextNode;
        nextNode.prev = currentPreNode;
    }

    // 删除: 倒序
    public void deleteReverse(int index) {
        DoubleNode currentPreNode = currentReversePosition(index-1);
        // 下一个指向currentNode的下一个
        DoubleNode nextNode = currentPreNode.next.next;
        currentPreNode.next = nextNode;
        nextNode.prev = currentPreNode;
    }

    // 合并链表
    public void merge(int index, DoubleLinkedList list) {
        DoubleNode listHeadNode = list.head;
        DoubleNode currentNode = currentPosition(index);
        // 接入头部
        DoubleNode currentNextNode = currentNode.next;
        currentNode.next = listHeadNode;
        listHeadNode.prev = currentNode;
        // 接入尾部
        while (listHeadNode.next != null) {
            listHeadNode = listHeadNode.next;
        }
        listHeadNode.next = currentNextNode;
        currentNextNode.prev = listHeadNode;
    }

    // 打印
    public void display() {
        if(head == null) return;
        DoubleNode currentNode = head;
        System.out.print("双向链表的数据为: [");
        while (currentNode.next != null) {
            System.out.print(" " + currentNode.data );
            currentNode = currentNode.next;
        }
        // 最后一个元素
        System.out.print(" " + currentNode.data);
        System.out.println(" ]");
    }
}