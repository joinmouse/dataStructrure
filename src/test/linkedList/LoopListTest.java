package test.linkedList;

import linkedList.LoopList;
import linkedList.Node;

// 测试代码
public class LoopListTest {
    public static void main(String[] args) {

        int[] arr = {6, 20, 1, 12, 9, 19, 14, 2, 18, 5, 11, 3, 13, 4, 15, 7, 8, 16, 17, 10};
        LoopList list = new LoopList();
        // 最先做的应该是: 将数组转为循环链表
        for (int i = 0; i < arr.length; i++) {
            list.addNode(arr[i]);
        }
        list.displayNode(list);

        // 删除头节点
        list.deleteHead();
        list.displayNode(list);

        // 删除第13个节点
        list.deleteIndex(13);
        list.displayNode(list);

        // 尾部追加节点21
        list.addNode(21);
        list.displayNode(list);

        // 约斯夫问题
        list.yueSiFu();
        list.displayNode(list);
    }
}