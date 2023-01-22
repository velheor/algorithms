package com.leetcode.algorithms;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int lo, int hi, int target) {
        if (hi < lo) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, hi, target);
        } else if (nums[mid] > target) {
            return binarySearch(nums, lo, mid - 1, target);
        }
        return mid;
    }
}
