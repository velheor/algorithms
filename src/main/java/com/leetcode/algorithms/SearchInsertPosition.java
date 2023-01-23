package com.leetcode.algorithms;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int min, int max, int target) {
        int mid = min + (max - min) / 2;

        if (max < min) {
            return min;
        }

        if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, max, target);
        } else if (nums[mid] > target) {
            return binarySearch(nums, min, mid - 1, target);
        }
        return mid;
    }
}
