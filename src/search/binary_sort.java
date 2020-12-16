package search;

public class binary_sort {
    public int baseSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left+right)/2;
            if(nums[middle] == target) {
                return middle;
            }else if(nums[middle] > target) {
                right = middle-1;
            }else if(nums[middle] < target) {
                left = middle+1;
            }
        }
        return -1;
    }

    public int rotateSearch(int[] nums, int target) {
        int n = nums.length;
        if(n == 0) return -1;
        if(n == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int left = 0;
        int right = n-1;
        while (left < right) {
            int middle = (left+right)/2;
            // 判断是否相等
            if(nums[middle] == target) {
                return middle;
            }
            // 左边有序
            if(nums[left] < nums[middle]) {
                if(nums[left] <= target && target < nums[middle]) {
                    right = middle - 1;
                }else {
                    left = middle + 1;
                }
            }else { // 右边有序
                if (nums[middle] < target && target <= nums[right]) {
                    left = middle+1;
                } else {
                    right = middle-1;
                }
            }
        }
        return -1;
    }
}