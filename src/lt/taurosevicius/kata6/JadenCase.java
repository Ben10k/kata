package lt.taurosevicius.kata6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    private static final String SPLITTER_JOINER = " ";

    public String toJadenCase(String phrase) {
        return isEmpty(phrase) ?
                null :
                phraseToJadenCase(phrase);

    }

    private boolean isEmpty(String phrase) {
        return phrase == null || phrase.isEmpty();
    }

    private String phraseToJadenCase(String phrase) {
        return Arrays.stream(phrase.split(SPLITTER_JOINER))
                .map(this::wordToJadenCase)
                .collect(Collectors.joining(SPLITTER_JOINER));
    }

    private String wordToJadenCase(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

}