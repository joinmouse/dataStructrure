package sort;

import java.util.Arrays;

// 选择排序, 递归实现
// sort(a1~an)
// 1、n = 1, a1
// 2、n>1, min(a1~an) + sort(a1-a(n-1))
public class Select {
    public int[] sort(int[] arr, int start) {
        // n=1 || 排序完成
        if(arr.length == 1 || start == arr.length-1)  {
            return arr;
        }
        // n>1
        int min = arr[start];
        int temp = 0;
        // 找到最小的数字, 并做一个交换
        for(int i=start+1; i<arr.length; i++) {
            if(arr[i] < min) {
                temp = arr[i];
                arr[i] = min;
                min = temp;
            }
        }
        // 将min放在index=start位置上
        arr[start] = min;
        return sort(arr, start+1);
    }
}