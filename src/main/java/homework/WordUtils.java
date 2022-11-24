package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WordUtils {
    public static String getShortestWord(List<String> words) {
        ArrayList<String> wordArray = new ArrayList<>(words);
        wordArray.sort(Comparator.comparingInt(String::length));
        return wordArray.get(0);
    }

    public static int getNumberOfWordsOccurrences(String sentence, String word) {
        int result = 0;
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(sentence.split("\\W+")));
        while (arrayList.contains(word)) {
            arrayList.remove(word);
            result++;
        }
        return result;
    }
}
