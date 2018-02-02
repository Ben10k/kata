package lt.taurosevicius.kata4_1;

import lt.taurosevicius.kata4_1.MorseCodeDecoder2.UnknownDecoderMappingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static lt.taurosevicius.kata4_1.MorseCodeDecoder2.Decoder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DecoderTest {

    private Decoder decoder;
    private Map<String, Character> mapping;

    @BeforeEach
    public void init() {
        mapping = new HashMap<>();
        decoder = new Decoder(mapping);
    }

    @Test
    void testEmptyMorseDecodesToEmpty() {
        String actual = decoder.decode("");

        assertEquals("", actual);
    }

    @Test
    void testNullMorseDecodesToEmpty() {
        String actual = decoder.decode(null);

        assertEquals("", actual);
    }

    @Test
    void decodeOneSymbol() {
        char expected = createRandomChar();
        mapping.put(".", expected);

        assertEquals(String.valueOf(expected), decoder.decode("."));
    }

    @Test
    void decodeTwoSymbolsOneWord() {
        String input1 = ".";
        String input2 = "-";

        char output1 = createRandomChar();
        char output2 = createRandomChar();

        mapping.put(input1, output1);
        mapping.put(input2, output2);

        String expectedOutput = String.valueOf(output1) + String.valueOf(output2);
        String input = input1 + " " + input2;

        assertEquals(expectedOutput, decoder.decode(input));
    }

    @Test
    void decodeOneSymbolPerWordTwoWords() {
        String input1 = ".";
        String input2 = "-";

        char output1 = createRandomChar();
        char output2 = createRandomChar();

        mapping.put(input1, output1);
        mapping.put(input2, output2);

        String expectedOutput = String.valueOf(output1)+ " " + String.valueOf(output2);
        String input = input1 + "   " + input2;

        assertEquals(expectedOutput, decoder.decode(input));
    }

    @Test
    void mappingCanNotBeNull() {
        assertThrows(NullPointerException.class, () -> new Decoder(null));
    }

    @Test
    void decodeUndefinedThrowsException() {
        assertThrows(UnknownDecoderMappingException.class, () -> {
            decoder.decode(".");
        });
    }

    private char createRandomChar() {
        return (char) (new Random().nextInt(20) + 33);
    }
}