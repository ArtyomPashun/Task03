package by.epamtc.pashunArtyom.task0302.logic;

public class ArrayBubbleSorter {

    public static int[][] sortArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length - 1; k++) {
                    if (array[i][k] > array[i][k + 1]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] a : array) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}



