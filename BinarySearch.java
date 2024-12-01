/**
 * This class implements the binary search algorithm to find a target element
 * in a sorted array.
 */
public class BinarySearch {
    
    /**
     * Performs binary search on a sorted array to find the index of the target element.
     *
     * @param sortedList The sorted array to search through.
     * @param target The element to search for.
     * @return The index of the target element if found, or -1 if the element is not found.
     */
    public static int binarySearch(int[] sortedList, int target) {
        int left = 0;
        int right = sortedList.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;   

            if (sortedList[mid] == target) {
                return mid; 
            }

            if (sortedList[mid] > target) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }
        
        return -1;
    }
}
