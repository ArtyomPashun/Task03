package by.epamtc.pashunArtyom.task0303.input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringFileReader {

    public static String readTxtFile () {
        String s = "";

        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {

                s = br.readLine();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return s;
    }
}
