package epamtc.pashunArtyom.task0301.logic;

import java.util.ArrayList;

public class ArrayValueSearch {

    public static Integer receiveMaxValue(Integer[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static Integer receiveMinValue(Integer[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList receivePrimeNumberArrayList(Integer[] array) {
        ArrayList<Integer> primeNumberArrayList = new ArrayList<>();

        for (int number : array) {
            if (isPrime(number)) {
                primeNumberArrayList.add(number);
            }
        }
        return primeNumberArrayList;
    }

    private static boolean isFibonacci(int number) {
        return (Math.sqrt(Math.pow(number, 2) * 5 - 4)) % 1 == 0
                || (Math.sqrt(Math.pow(number, 2) * 5 + 4)) % 1 == 0;
    }

    public static ArrayList receiveFibonacciArrayList(Integer[] array) {
        ArrayList<Integer> fibonacciNumberArrayList = new ArrayList<>();

        for (int number : array) {
            if (isPrime(number)) {
                fibonacciNumberArrayList.add(number);
            }
        }
        return fibonacciNumberArrayList;
    }
}
