package by.epamtc.pashunArtyom.task0301.entity;

import java.util.Arrays;

public class IntegerArray {

    private Integer[] array;

    public IntegerArray(Integer... value) {
        this.array = value;
    }

    public IntegerArray(int[] array) {
        int arrayLength = array.length;
        Integer[] tempArray = new Integer[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            tempArray[i] = array[i];
        }
        this.array = tempArray;
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerArray thatArray = (IntegerArray) o;
        return Arrays.equals(array, thatArray.array);
    }

    @Override
    public int hashCode() {
        return 31 * array.length + 8;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "array: {" + Arrays.toString(array) +
                "}";
    }
}
