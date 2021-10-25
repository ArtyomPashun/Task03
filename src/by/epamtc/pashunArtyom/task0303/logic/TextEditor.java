package by.epamtc.pashunArtyom.task0303.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditor {

    public static String replaceKLetterInWordByRegex(String textInput, int k, char newLetter) {
        StringBuilder textBuilder = new StringBuilder(textInput);
        Pattern pattern = Pattern.compile("[^\s.,!?:;'\"@#$%^&*()+=]");
        Matcher matcher = pattern.matcher(textBuilder);
        while (matcher.find()) {
            if (matcher.group().length() >= k) {
                textBuilder.setCharAt(matcher.start() + k - 1, newLetter);
            }
        }
        return textBuilder.toString();
    }

    public static String replaceKLetterInWordByString(String textInput, int k, char newLetter) {
        String text = textInput;
        String[] textArray = text.split("[^\s.,!?:;'\"@#$%^&*()+=]");
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].length() >= k) {
                char ch = textArray[i].charAt(k - 1);
                textArray[i].replaceFirst("ch", String.valueOf(newLetter));
            } else {
                continue;
            }
        }
        return textArray.toString();
    }


}
