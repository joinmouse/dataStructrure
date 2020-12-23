package test.sort;

import sort.Bubbling;

import java.util.*;

public class BubblingTest {
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
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        // int s1[] = {2,3,5,6,1,11,12,13};
        // int s2[] = {2,3,5,6,1,11,12,13};
        Bubbling bubbling = new Bubbling();
        // 简单的冒泡排序
        Integer[] result1 = bubbling.sort(s1);
        System.out.println(Arrays.toString(result1));
        // 优化的排序
        Integer[] result2 = bubbling.optSort(s2);
        System.out.println(Arrays.toString(result2));
    }
}