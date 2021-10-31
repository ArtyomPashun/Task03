package by.epamtc.pashunArtyom.task0302.runner;

/* Дан непрямоугольный целочисленный массив (jagged array). Реализовать алгоритм "пузырьковой" сортировки,
 *таким образом, чтобы была возможность упорядочить строки матрицы:
 *• в порядке возрастания (убывания) сумм элементов строк матрицы;
 *• в порядке возрастания (убывания) максимальных элементов строк матрицы;
 *• в порядке возрастания (убывания) минимальных элементов строк матрицы.
 */

import by.epamtc.pashunArtyom.task0302.logic.ArrayBubbleSorter;
import by.epamtc.pashunArtyom.task0302.logic.ArrayStringOrganizer;

public class Runner {
    public static void main(String[] args) {

        int[][] juggedArray = {
                {13, -10, 5, 1, -6},
                {15, 7, 8, 4},
                {-2, 3, 5},
                {81, 27}
        };

        ArrayBubbleSorter.sortArray(juggedArray);
        ArrayStringOrganizer.sortByMin(juggedArray);
        ArrayStringOrganizer.sortByMax(juggedArray);
        ArrayStringOrganizer.sortBySum(juggedArray);
    }
}
