package by.epamtc.pashunArtyom.task0303.logic;

public class TextEditor {

    public static boolean isConstant(String text) {
        String regex = "[qwrtpsdfghjklzxcvbnm]";
        boolean isConstant = false;
        if (text.startsWith(regex)) {
            isConstant = true;
        }
        return isConstant;
    }

    public static String deleteAllSymbolsExceptLettersAndSpaces(String textInput) {

        String text = textInput;
        String temp = new String();
        char[] tempCharArray = text.toCharArray();

        for (char symbol : tempCharArray) {
            if (Character.isLetter(symbol) || Character.isWhitespace(symbol))
                temp += symbol;
        }

        String[] textWithSpaces = temp.split("[\\s]*");
        temp = "";

        for (String word : textWithSpaces) {
            if (word.trim().length() > 0)
                temp += word + " ";
        }
        temp = temp.trim();
        return temp;
    }

    public static StringBuilder deleteWordsOfGivenLength(String originalText, String substring, int inputLength) {

        StringBuilder newText = new StringBuilder();
        String[] text = originalText.split("[\\s]*");

        for (int i = 0; i < text.length; i++)
            if (text[i].length() == inputLength) {
                newText.append(text[i] = substring + " ");
            } else {
                newText.append(text[i] + " ");
            }
        return newText;
    }

    public static StringBuilder deleteWordsOfGivenLengthWithConsonantStart(String inputText, int inputLength) {

        StringBuilder newText = new StringBuilder();
        String[] textArray = inputText.split("[\\s]*");

        for (int i = 0; i < textArray.length; i++)
            if (!(textArray[i].length() == inputLength) && !isConstant(textArray[i])) {
                newText.append(textArray[i] + " ");
            }
        return newText;
    }

    public static StringBuilder changeKLetterInEachWord(String inputText, int kSymbol, char symbol) {

        StringBuilder newText = new StringBuilder();
        String[] textArray = inputText.split("[\\s]*");

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].length() < kSymbol - 1) {
                newText.append(textArray[i] + " ");
            } else {
                StringBuilder temp = new StringBuilder(textArray[i]);
                temp.deleteCharAt(kSymbol - 1);
                temp.insert(kSymbol - 2, symbol);
                newText.append(temp + " ");
            }
        }
        return newText;
    }

    public static StringBuilder changeLetterAtoOAfterP(String inputText) {

        StringBuilder newText = new StringBuilder();
        String[] textArray = inputText.split("[\\s]*");

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].contains("PA") && textArray[i].charAt(textArray[i].length() - 1) != 'P') {
                char[] charArray = textArray[i].toCharArray();
                for (int j = 0; j < charArray.length - 1; j++) {
                    if (charArray[j] == 'P' && charArray[j + 1] == 'A') {
                        charArray[j + 1] = 'O';
                    }
                }
                String temp = charArray.toString();
                newText.append(temp + " ");
            } else {
                newText.append(textArray[i] + " ");
            }
        }
        return newText;
    }
}

