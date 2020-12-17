package sort;

// 冒泡排序
// 1、遍历数组，依次比较，先将最大的元素提取到最后的位置
// 2、再次遍历剩余的n-i个元素
// 3、重复2的操作，退出条件是剩余的数组n-i个已经遍历完成
public class Bubbling {
    public int[] sort(int[] arr) {
        // 用于交换的临时数
        int temp = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr.length-i; j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}