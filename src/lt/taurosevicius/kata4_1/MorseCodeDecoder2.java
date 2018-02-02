package lt.taurosevicius.kata4_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MorseCodeDecoder2 {

    public static String decode(String morseCode) {
        return new Decoder(new HashMap<>()).decode(morseCode);
    }

    public static class Decoder {
        private final Map<String, Character> mapping;

        public Decoder(Map<String, Character> mapping) {
            this.mapping = Objects.requireNonNull(mapping);
        }

        public String decode(String morseString) {
            if (morseString == null || morseString.length() == 0)
                return "";
            return decodeSentence(morseString);
        }

        private String decodeSentence(String sentence) {
            StringBuilder builder = new StringBuilder();
            for (String word : sentence.split("   ")) {
                builder.append(String.valueOf(decodeWord(word)));
                builder.append(" ");
            }
            return builder.toString().trim();
        }

        private String decodeWord(String word) {
            StringBuilder builder = new StringBuilder();
            for (String character : word.split(" ")) {
                builder.append(String.valueOf(mapping.computeIfAbsent(character, (code) -> {
                    throw new UnknownDecoderMappingException(code);
                })));
            }
            return builder.toString();
        }
    }

    public static class UnknownDecoderMappingException extends RuntimeException {
        public UnknownDecoderMappingException(String message) {
            super(message);
        }
    }

}
