
public class BinarySearch {
    
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
