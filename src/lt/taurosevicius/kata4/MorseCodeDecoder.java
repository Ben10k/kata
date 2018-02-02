package lt.taurosevicius.kata4;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code          )
        return (morseCode.isEmpty() ? null : decodeSentence(morseCode));
    }

    private static String decodeSentence(String sentence) {
        StringBuilder builder = new StringBuilder();
        for (String word : sentence.split("   ")) {
            builder.append(decodeWord(word)+" ");
        }
        return builder.toString().trim();
    }

    private static String decodeWord(String word) {
        StringBuilder builder = new StringBuilder();
        for (String character : word.split(" ")) {
            String decodedCharacter = MorseCode.get(character);
            if (decodedCharacter!=null)
                builder.append(decodedCharacter);
        }
        return builder.toString();
    }

    // Preload the MorseCode which is already given online.
    private static Map<String, String> MorseCode;

    public static void initMorse() {
        MorseCode = new HashMap<>();
        MorseCode.put(".-", "A");
        MorseCode.put("-...", "B");
        MorseCode.put("-.-.", "C");
        MorseCode.put("-..", "D");
        MorseCode.put(".", "E");
        MorseCode.put("..-.", "F");
        MorseCode.put("--.", "G");
        MorseCode.put("....", "H");
        MorseCode.put("..", "I");
        MorseCode.put(".---", "J");
        MorseCode.put("-.-", "K");
        MorseCode.put(".-..", "L");
        MorseCode.put("--", "M");
        MorseCode.put("-.", "N");
        MorseCode.put("---", "O");
        MorseCode.put(".--.", "P");
        MorseCode.put("--.-", "Q");
        MorseCode.put(".-.", "R");
        MorseCode.put("...", "S");
        MorseCode.put("-", "T");
        MorseCode.put("..-", "U");
        MorseCode.put("...-", "V");
        MorseCode.put(".--", "W");
        MorseCode.put("-..-", "X");
        MorseCode.put("-.--", "Y");
        MorseCode.put("--..", "Z");
        MorseCode.put(".----", "1");
        MorseCode.put("..---", "2");
        MorseCode.put("...--", "3");
        MorseCode.put("....-", "4");
        MorseCode.put(".....", "5");
        MorseCode.put("-....", "6");
        MorseCode.put("--...", "7");
        MorseCode.put("---..", "8");
        MorseCode.put("----.", "9");
        MorseCode.put("-----", "0");
    }
}