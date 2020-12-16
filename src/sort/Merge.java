package sort;

import com.sun.deploy.util.ArrayUtil;

// 归并排序
public class Merge {
    public void merge(int[] arr, int p, int q, int r)  {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = {};
        int[] R = {};
        for(int i=0; i < n1; i++) {
            L[i] = arr[p+i];
        }
        for (int j=0; j < n2; j++) {
            R[j] = arr[q + j];
        }
        // 开始合并数组
        int i = 0;
        int j = 0;
        for(int k = p; k<r; k++) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i = i+1;
            }else {
                arr[k] = R[j];
                j = j+1;
            }
        }
    }

    public int[] mergeSort(int[] arr, int p, int r) {
        if(p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);  //左子树排序
            mergeSort(arr, q+1, r);  //右子树排序
            merge(arr, p, q, r);
        }
        return arr;
    }
}