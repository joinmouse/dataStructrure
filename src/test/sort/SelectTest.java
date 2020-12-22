package test.sort;

import sort.Select;

import java.util.Arrays;

public class SelectTest {
    public static void main(String[] args) {
        Select select = new Select();
        int[] arr = {1, 3, 2, 12, 4, 6, 8};
        int[] result = select.sort(arr, 0);
        System.out.println("result: " + Arrays.toString(result));
    }
}