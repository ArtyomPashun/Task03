package by.epamtc.pashunArtyom.task0303.input;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringFileWriter {

    public static void createFileWithTxt () {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter ("file.txt", false))) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text...");

            String text = sc.nextLine();
            bw.write(text);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}