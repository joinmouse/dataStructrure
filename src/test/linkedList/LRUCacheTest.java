package test.linkedList;

import linkedList.LRUCache;

public class LRUCacheTest {
    // 斐波拉契数列优化
    public int FiboracciCache(int n) {
        LRUCache lruCache = new LRUCache(1000);
        if(n < 3) return n;
        if(lruCache.get(n) > -1) {
            return lruCache.get(n);
        }
        lruCache.put(n-1, FiboracciCache(n-1));
        lruCache.put(n-2, FiboracciCache(n-2));
        int result = lruCache.get(n - 1) + lruCache.get(n - 2);
        return result;
    }

    // 没有优化的
    public int Fiboracci(int n) {
        if(n < 3) {
            return n;
        }
        return Fiboracci(n-1) + Fiboracci(n-2);
    }

    public static void main(String[] args) {
        LRUCacheTest lruCacheTest = new LRUCacheTest();
        // 测试时间
        double time1 = System.currentTimeMillis();
        int result1 = lruCacheTest.FiboracciCache(10);
        System.out.println(result1);
        double time2 = System.currentTimeMillis();
        System.out.println("使用缓存消耗的时间" + (time2 - time1));

        double time3 = System.currentTimeMillis();
        int result2 = lruCacheTest.Fiboracci(10);
        System.out.println(result2);
        double time4 = System.currentTimeMillis();
        System.out.println("不使用缓存消耗的时间" + (time4 - time3));
    }
}