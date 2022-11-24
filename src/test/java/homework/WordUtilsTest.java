package homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WordUtilsTest {

    @Test
    void shouldGetShortestWord() {
        List<String> stringsList = new ArrayList<>();
        stringsList.add("ss");
        stringsList.add("s");
        stringsList.add("sss");
        assertThat(WordUtils.getShortestWord(stringsList)).isEqualTo("s");
    }

    @Test
    void shouldGetNumberOfWordsOccurrences() {
        String test = "word, word and word";
        assertThat(WordUtils.getNumberOfWordsOccurrences(test, "word")).isEqualTo(3);
    }
}