package test.sort;

import sort.Bubbling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BubblingTest {
    public static void main(String[] args) {
        // 随机生成1000个数字
        Random random = new Random();
        int s1[] = new int[1000];
        int s2[] = new int[1000];
        for(int i=0; i< 1000; i++) {
            int val = random.nextInt(1000);
            s1[i] = val;
            s2[i] = val;
        }
//        int s1[] = {2,3,5,6,1,11,12,13};
//        int s2[] = {2,3,5,6,1,11,12,13};
        Bubbling bubbling = new Bubbling();
        // 简单的冒泡排序
        int[] result1 = bubbling.sort(s1);
        System.out.println(Arrays.toString(result1));
        // 优化的排序
        int[] result2 = bubbling.optSort(s2);
        System.out.println(Arrays.toString(result2));
    }
}