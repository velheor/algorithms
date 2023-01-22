import com.leetcode.algorithms.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    void test() {
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9), 4);
        assertEquals(binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2), -1);
    }
}
