package epamtc.pashunArtyom.task0301.logic;

public class ArrayBinarySearch {

    public static int binarySearch(Integer[] sortedArray, int key, int maxValue, int minValue) {
        int index = Integer.MAX_VALUE;

        while (minValue <= maxValue) {
            int mid = (minValue + maxValue) / 2;
            if (sortedArray[mid] < key) {
                minValue = mid + 1;
            } else if (sortedArray[mid] > key) {
                maxValue = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
