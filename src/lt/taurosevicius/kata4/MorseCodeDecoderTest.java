package lt.taurosevicius.kata4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MorseCodeDecoderTest {
    @BeforeAll
    public static void init() {
        System.out.println("Before All init() method called");
        MorseCodeDecoder.initMorse();
    }

    @Test
    void decodeNull() {
        assertEquals(null, MorseCodeDecoder.decode(""));
    }

    @Test
    void decodeOne() {
        assertEquals("A", MorseCodeDecoder.decode(".-"));
    }

    // Provided test
    @Test
    public void testExampleFromDescription() {
        assertEquals(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."),("HEY JUDE"));
    }
}