package com.leetcode.algorithms;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        return binarySearch(1 , n);
    }

    public int binarySearch(int low, int high) {
        if (high == low) {
            return high;
        }
        int mid = low + (high - low) / 2;
        if (isBadVersion(mid)) {
            return binarySearch(low, mid);
        } else {
            return binarySearch(mid + 1, high);
        }
    }

    private boolean isBadVersion(int target) {
        return target % 2 == 0;
    }
}
