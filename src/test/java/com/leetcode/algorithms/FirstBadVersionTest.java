package com.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {
    @Test
    void test() {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        assertEquals(firstBadVersion.firstBadVersion(5), 4);
        assertEquals(firstBadVersion.firstBadVersion(2), 1);
    }
}
