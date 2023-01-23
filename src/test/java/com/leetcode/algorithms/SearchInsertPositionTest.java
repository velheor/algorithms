package com.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void test() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1}, 1));
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1, 3}, 0));
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3}, 3));
    }
}
