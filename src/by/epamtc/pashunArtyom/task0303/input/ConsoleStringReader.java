package by.epamtc.pashunArtyom.task0303.input;

import java.util.Scanner;

public class ConsoleStringReader {

    public static String StringInput() {

        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Enter text:");

        input = sc.nextLine();

        return input;
    }
}
