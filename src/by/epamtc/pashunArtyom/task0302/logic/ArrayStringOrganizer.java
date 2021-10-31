package by.epamtc.pashunArtyom.task0302.logic;

public class ArrayStringOrganizer {

    public static void swap(int[][] array, int str1, int str2) {
        int[] temp = array[str1];
        array[str1] = array[str2];
        array[str2] = temp;
    }

    public static int receiveSum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }

    public static void sortByMax(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                int maxStr1 = array[i][array[i].length - 1];
                int maxStr2 = array[i + 1][array[i + 1].length - 1];
                if ((maxStr1 > maxStr2)) {
                    swap(array, i, i + 1);
                }
            }
        }
    }


    public static void sortByMin(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                int minStr1 = array[i][0];
                int minStr2 = array[i + 1][0];
                if ((minStr2 < minStr1)) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    public static void sortBySum(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                int sum1 = receiveSum(array[i]);
                int sum2 = receiveSum(array[i + 1]);
                if (sum1 > sum2)
                    swap(array, i, i + 1);
            }
        }
    }
}
