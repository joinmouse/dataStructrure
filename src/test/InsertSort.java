package test;

import sort.Insert;
import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 4, 6, 10 ,1 ,13, 29, 12};
        Insert insert = new Insert();
        int[] arrResult = insert.sort(arr);
        System.out.println(Arrays.toString(arrResult));
    }
}