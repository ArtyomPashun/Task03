package by.epamtc.pashunArtyom.task0301.input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class IntegerFileReader {

    public static Integer[] readFromFile() throws IOException {

        ArrayList arrayList = new ArrayList();
        FileOutputStream fileOut = null;
        FileInputStream fileIn = null;
        int value;

        try {
            fileOut = new FileOutputStream("test.txt");
            for (int i = 0; i < 6; i++) {
                value = (int) (Math.random() * 100) + 1;
                fileOut.write(value);
            }
            fileIn = new FileInputStream("test.txt");
            while ((value = fileIn.read()) != -1) {
                value = fileIn.read();
                arrayList.add(value);
            }
        } finally {

            if (fileOut != null) {
                fileOut.close();
            }
            if (fileIn != null) {
                fileIn.close();
            }
        }
        return (Integer[]) arrayList.toArray();
    }
}

