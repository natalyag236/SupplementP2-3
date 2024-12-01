import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinarySearchFound() {
        int[] sortedList = {10, 20, 30, 40, 90, 110, 130, 105};
        int target = 40;
        int result = BinarySearch.binarySearch(sortedList, target);
        assertEquals("Target should be found at index 3", 3, result);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] sortedList = {10, 20, 30, 40, 90, 110, 130, 105};
        int target = 25;
        int result = BinarySearch.binarySearch(sortedList, target);
        assertEquals("Target should not be found, should return -1", -1, result);
    }

    @Test
    public void testBinarySearchEmptyList() {
        int[] sortedList = {};
        int target = 25;
        int result = BinarySearch.binarySearch(sortedList, target);
        assertEquals("Target should not be found in an empty list, should return -1", -1, result);
    }


}
