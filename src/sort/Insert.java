package sort;

// 插入排序 insert sort
// https://images2017.cnblogs.com/blog/849589/201710/849589-20171015225645277-1151100000.gif
public class Insert {
    public static int[] sort(int arr[]) {
        // 排序
        for(int i=0; i<arr.length-1; i++) {
            int j = i;
            while (j > 0) {
                if(arr[j] < arr[j-1]) {
                    int temp ;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }else {
                    break;
                }
            }
        }
        return arr;
    }
}