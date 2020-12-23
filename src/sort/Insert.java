package sort;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;

// 插入排序 Insert sort
// https://images2017.cnblogs.com/blog/849589/201710/849589-20171015225645277-1151100000.gif
public class Insert {
    // 基础版本的插入排序
    public Integer[] sort(Integer[] arr) {
        for(int i=1; i<arr.length; i++) {
            int currentVal = arr[i];
            // insert a[i] into the sorted arr
            int j = i-1;
            while (j>=0 && arr[j] > currentVal) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            // j退出循环前-1了，因此这里是a[j+1]
            arr[j+1] = currentVal;
        }
        return arr;
    }

    // 优化的插入排序
    public Integer[] optSort(Integer[] arr) {
        // 外层循环
        for(int i=1; i<arr.length; i++) {
            int currentVal = arr[i];  //当前待插入的元素
            // 找出currentVal需要插入的位置
            int index = bindary_sort(arr, 0, i, currentVal);
            // 移动位置
            for(int j=i; j>index; j--){
                arr[j] = arr[j-1];
            }
            // 将currentVal元素插入进去
            arr[index] = currentVal;
        }
        return arr;
    }

    // 二分查找
    // @param arr: 原始数组
    // int[] arr = {22,3,25,12,16,18,20,21};
    public int bindary_sort(Integer[] arr,int start, int end, int val) {
        int middle = (start+end)/2;
        if(start >= end) {
            return start;
        }else {
            if(arr[middle] > val) {
                return bindary_sort(arr, start, middle, val);
            }else{
                return bindary_sort(arr, middle+1, end, val);
            }
        }
    };
}