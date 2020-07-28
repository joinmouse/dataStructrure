package linkedList;

public class Node {
    Node next;
    public int data;
    /*
    * 初始化节点
    * */
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}