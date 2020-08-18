package linkedList;

import java.util.Arrays;
import java.util.LinkedList;

// 约瑟夫环问题: 通过链表来模拟实现
public class YueSeFu {
    public int LastRemaining_Solution(int[] arr, int m) {
        if(arr.length == 0 || m == 0) {
            return -1;
        }
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < arr.length ; i++) {
            list.add(arr[i]);
        }
        int removeIndex = 0;
        while (list.size() != 1) {
            removeIndex = (removeIndex + m) % list.size();
            System.out.println("remove " + list.get(removeIndex));
            list.remove(removeIndex);
        }
        return list.get(0);
    }
}