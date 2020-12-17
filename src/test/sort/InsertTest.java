package test.sort;

import java.util.Arrays;
import sort.Insert;

public class InsertTest {
    public static void main(String[] args) {
        Insert insert = new Insert();
        int[] arr = {22,3,25,12,16,18,20,21};
        int[] result = insert.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
