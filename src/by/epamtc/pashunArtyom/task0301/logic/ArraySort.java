package by.epamtc.pashunArtyom.task0301.logic;

public class ArraySort {

    public static void selectionSort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void bubbleSort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean noSwaps = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    noSwaps = false;
                }
            }
            if (noSwaps) {
                break;
            }
        }
    }

    public static void countingSort(Integer[] array) {
        int max = array[0];
        int min = array[0];
        for (int value : array) {
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }
        int range = max - min + 1;
        int[] count = new int[range];
        for (int value : array) {
            count[value - min]++;
        }
        for (int i = 0, j = 0; i < count.length; i++) {
            for (int k = 0; k < count[i]; k++) {
                array[j++] = i + min;
            }
        }
    }
}