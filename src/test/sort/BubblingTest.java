package test.sort;

import sort.Bubbling;
import java.util.Arrays;

public class BubblingTest {
    public static void main(String[] args) {
        Bubbling bubbling = new Bubbling();
        int[] arr = {1,4,12,2,5,7,8};
        int[] result = bubbling.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}