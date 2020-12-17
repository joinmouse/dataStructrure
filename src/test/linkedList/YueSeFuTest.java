package test.linkedList;

import linkedList.YueSeFu;

public class YueSeFuTest {
    public static void main(String[] args) {
        YueSeFu yueSeFu = new YueSeFu();
        int[] arr = {6, 20, 1, 12, 9, 19, 14, 2, 18, 5, 11, 3, 13, 4, 15, 7, 8, 16, 17, 10};
        int result = yueSeFu.LastRemaining_Solution(arr, 2);
        System.out.println(result);
    }
}
