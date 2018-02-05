package lt.taurosevicius.kata5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelsTest {

    @Test
    public void emptyTest() {
        assertEquals(0, Vowels.getCount(""));

    }

    @Test
    public void nullTest() {
        assertEquals(0, Vowels.getCount(null));

    }

    @Test
    public void noVowelsTest() {
        assertEquals(0, Vowels.getCount("qwrtpsdfghjklzxcvbnm"));

    }

    @Test
    public void noVowelsCapsTest() {
        assertEquals(0, Vowels.getCount("QWRTPSDFGHJKLZXCVBNM"));

    }

    @Test
    public void oneVowelTest() {
        assertEquals(1, Vowels.getCount("e"));

    }

    @Test
    public void oneVowelCapsTest() {
        assertEquals(1, Vowels.getCount("E"));

    }

    @Test
    public void twoVowelsLowTest() {
        assertEquals(2, Vowels.getCount("eu"));

    }

    @Test
    public void twoVowelsCapsTest() {
        assertEquals(2, Vowels.getCount("EU"));

    }

    @Test
    public void twoVowelsMixedTest() {
        assertEquals(2, Vowels.getCount("Eu"));

    }

    @Test
    public void twoLetterMixedTest() {
        assertEquals(1, Vowels.getCount("Ef"));

    }

    // Provided tests:
    @Test
    public void testCase1() {
        assertEquals(5, Vowels.getCount("abracadabra"));
    }

}