package test;

import search.Dichotomy;

public class DichotomyTest {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7};
        Dichotomy dichotomy = new Dichotomy();
        int key1 = dichotomy.rank(1, arr, arr[0], arr[arr.length-1]);
        System.out.println("key1: " + key1);
        int key2 = dichotomy.rank(10, arr, arr[0], arr[arr.length-1]);
        System.out.println("key2: " + key2);
        int key3 = dichotomy.rank(5, arr, arr[0], arr[arr.length-1]);
        System.out.println("key3: " + key3);
        int key4 = dichotomy.rank(-1, arr, arr[0], arr[arr.length-1]);
        System.out.println("key4: " + key4);
    }
}