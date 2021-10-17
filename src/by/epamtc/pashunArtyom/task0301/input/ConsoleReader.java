package by.epamtc.pashunArtyom.task0301.input;

import java.util.Scanner;

public class ConsoleReader {

    public static Integer[] integerInput(Integer n) {

        Integer[] number = new Integer[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");

        for (int i = 0; i < number.length; i++) {
            while (!sc.hasNextInt()) {
                System.out.println(".!.");
                sc.next();
            }
            number[i] = sc.nextInt();
        }
        return number;
    }
}
