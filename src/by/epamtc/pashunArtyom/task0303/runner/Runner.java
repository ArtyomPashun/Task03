package by.epamtc.pashunArtyom.task0303.runner;

/* Программа обработки текста, который может быть получен как с консоли, так и с файла.
 *1. В каждом слове k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.
 *2. В тексте после буквы Р, если она не последняя в слове, ошибочно напечатана буква А вместо О. Внести исправления в текст.
 *3. В тексте слова заданной длины заменить указанной подстрокой, длина которой может не совпадать с длиной слова.
 *4. Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами. Между последовательностями подряд идущих букв оставить хотя бы один пробел.
 *5. Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
 */

import by.epamtc.pashunArtyom.task0303.logic.TextEditor;


public class Runner {

    public static void main(String[] args) {

        String newSubstring = "learn java";

        String inputString = "12345aaa###%%^ aAvvb qq74657467###vv1";

        TextEditor.deleteAllSymbolsExceptLettersAndSpaces(inputString);
        TextEditor.deleteWordsOfGivenLengthWithConsonantStart(inputString, 3);
        TextEditor.deleteWordsOfGivenLength(inputString, newSubstring, 3);
        TextEditor.changeKLetterInEachWord(inputString, 4, 'A');
        TextEditor.changeLetterAtoOAfterP(inputString);

    }
}
