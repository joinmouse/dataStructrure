package search;

public class Dichotomy {
    public static int rank(int val, int[] arr, int lo, int hi) {
        int mid = (lo + hi)/2;
        if(arr[mid] == val) {
            return arr[mid];
        }else if(arr[mid] < val) {
            // 避免数组越界
            if(mid+1 == hi) {
                return -1;
            }else {
                return rank(val, arr, mid+1, hi);
            }
        }else {
            // 避免数组越界
            if(mid-1 == 0) {
                return -1;
            }else {
                return rank(val, arr, lo, mid - 1);
            }
        }
    }
}