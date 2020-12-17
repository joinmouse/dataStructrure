package test.sort;

import sort.Merge;
import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        Merge merge = new Merge();
        int[] arr = {2, 1, 12, 3, 5, 7 ,9, 11};
        int[] result = merge.mergeSort(arr, 1, arr.length);
        System.out.println(Arrays.toString(result));
    }
}