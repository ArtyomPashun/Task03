package by.epamtc.pashunArtyom.task0301.runner;

/* Создание типа Array, который является классом оболочкой над массивом целого типа. В данном типе должны быть реализованы конструкторы (позволяющие несколькими способами создавать объекты типа), get-ы, set-ы и переопределенные методы класса Object (toString(), equals(), hasCode()).
 *Программа должна иметь следующие возможности:
 *1. Сортировать массив тремя способами.
 *2. Осуществлять поиск элемента массива (использовать алгоритм бинарного поиска).
 *3. Нахождение максимального и минимального элемента массива.
 *4. Получить все простые числа находящиеся в массиве.
 *5. Получить все числа Фибонначчи находящиеся в массиве.
 *6. Получить все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
 *7. Заполнения элементов массива и с консоли, и с файла и с помощью генерации случайных чисел.
 */

import by.epamtc.pashunArtyom.task0301.entity.IntegerArray;
import by.epamtc.pashunArtyom.task0301.input.ConsoleReader;
import by.epamtc.pashunArtyom.task0301.logic.ArrayBinarySearch;
import by.epamtc.pashunArtyom.task0301.logic.ArraySort;
import by.epamtc.pashunArtyom.task0301.logic.ArrayValueSearch;

public class Runner {

    public static void main(String[] args) {

        ConsoleReader reader = new ConsoleReader();

        IntegerArray integerArray = new IntegerArray(reader.integerInput(5));

        Integer[] array = integerArray.getArray();

        ArraySort.bubbleSort(array);
        ArrayBinarySearch.binarySearch(array, 2, ArrayValueSearch.receiveMaxValue(array), ArrayValueSearch.receiveMinValue(array));
        ArrayValueSearch.receiveMaxValue(array);
        ArrayValueSearch.receiveMinValue(array);
        ArrayValueSearch.receivePrimeNumberArrayList(array);
        ArrayValueSearch.receiveFibonacciArrayList(array);
        ArrayValueSearch.receiveDifferentThreeDigitNumber(array);
    }
}
