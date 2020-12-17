package sort;

// 插入排序 Insert sort
// https://images2017.cnblogs.com/blog/849589/201710/849589-20171015225645277-1151100000.gif
public class Insert {
    public int[] sort(int arr[]) {
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
}