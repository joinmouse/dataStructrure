package sort;

// 冒泡排序
// 1、遍历数组，依次比较，先将最大的元素提取到最后的位置
// 2、再次遍历剩余的n-i个元素
// 3、重复2的操作，退出条件是剩余的数组n-i个已经遍历完成
public class Bubbling {
    public Integer[] sort(Integer[] arr) {
        int num = 0;  //比较次数
        int swap = 0; //交换次数
        // 用于交换的临时数
        int temp = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr.length-i; j++) {
                num += 1;
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swap += 1;
                }
            }
        }
        System.out.println("简单冒泡排序比较次数: " + num);
        System.out.println("简单冒泡排序交换次数: " + swap);
        return arr;
    }

    public Integer[] optSort(Integer[] arr) {
        int num = 0;  //比较次数
        int swap = 0; //交换次数
        int temp = 0;  //临时交换数
        int len = arr.length;
        int temPosition = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j < len; j++) {
                num += 1;
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    temPosition = j;
                    swap += 1;
                }
            }
            if(temPosition == 0 || temPosition == len) {
                break;
            }
            len = temPosition;
        }
        System.out.println("优化冒泡排序比较次数: " + num);
        System.out.println("优化冒泡排序交换次数: " + swap);
        return arr;
    }
}