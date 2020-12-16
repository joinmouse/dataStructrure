package test.search;


import search.binary_sort;

public class binary_sort_test {
    public static void main(String[] args) {
        search.binary_sort rotated_sorted_array = new search.binary_sort();
        // 二分查找基础解答
        int[] arrBase = {2,5,7,9,10,11,17,18};
        int res = rotated_sorted_array.baseSearch(arrBase, 11);
        System.out.println("res_base: " + res);
        // 旋转有序数组
        int[] arr = {4,5,6,7,0,1,2};
        int result1 = rotated_sorted_array.rotateSearch(arr, 5);
        System.out.println("rotate_result: " + result1);
        int result2 = rotated_sorted_array.rotateSearch(arr, 1);
        System.out.println("rotate_result: " + result2);
    }
}