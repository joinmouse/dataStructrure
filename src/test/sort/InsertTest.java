package test.sort;

import java.util.*;

import sort.Insert;

public class InsertTest {
    public static void main(String[] args) {
        // 随机生成1000个数字
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        Integer s1[] = null;
        Integer s2[] = null;
        for(int i=0; i< 50; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        s1 = list.toArray(new Integer[0]);
        s2 = list.toArray(new Integer[0]);

        Insert insert = new Insert();
        // 基本简单版本的
        Integer[] result1 = insert.sort(s1);
        System.out.println(Arrays.toString(result1));
        // 优化后的
        Integer[] result2 = insert.optSort(s2);
        System.out.println(Arrays.toString(result2));
    }
}