package lt.taurosevicius.kata4_1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MorseCodeDecoder2Test {

    @Test
    public void testEmptyMain() {
        String actual = MorseCodeDecoder2.decode("");
        assertEquals("", actual);
    }

    // Provided test
    @Disabled
    @Test
    public void testExampleFromDescription() {
        assertEquals(MorseCodeDecoder2.decode(".... . -.--   .--- ..- -.. ."), ("HEY JUDE"));
    }
}